package org.daemon.mancubus;

import org.daemon.mancubus.handlers.root.RootIndexHandler;
import org.daemon.mancubus.handlers.shutdown.ShutdownHandler;
import org.daemon.mancubus.handlers.vulnerabilities.VulnerabilityHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.Future;
import io.vertx.core.VerticleBase;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

public class MainVerticle extends VerticleBase {

        private final Logger logger = LoggerFactory.getLogger("main");

        @Override
        public Future<?> start() {
                String name = config().getString("name", "Mancubus");

                HttpServer server = vertx.createHttpServer();
                Router router = Router.router(vertx);
                router.route("/").handler(new RootIndexHandler());
                router.route("/vulnerabilities").handler(new VulnerabilityHandler(vertx));
                router.route("/shutdown").handler(new ShutdownHandler(vertx));

                Future<HttpServer> future = server.requestHandler(router).listen(8080)
                        .onSuccess(httpServer -> {
                                logger.info("HTTP server " + name + " started on port " + httpServer.actualPort());
                        })
                        .onFailure(throwable -> {
                                logger.error("HTTP server " + name + " could not start", throwable);
                        });

                return future;
        }
}
