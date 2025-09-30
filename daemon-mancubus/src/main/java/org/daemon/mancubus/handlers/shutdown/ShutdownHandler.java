package org.daemon.mancubus.handlers.shutdown;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.RoutingContext;

public final class ShutdownHandler implements Handler<RoutingContext> {

        private final Logger logger = LoggerFactory.getLogger("main");
        private Vertx vertx = null;

        public ShutdownHandler(Vertx vx) {
                this.vertx = vx;
        }

        @Override
        public void handle(RoutingContext ctx) {
                ctx.response()
                        .putHeader("content-type", "text/plain")
                        .setStatusCode(200)
                        .end("dying");

                logger.info("Exiting");
                vertx.close();
        }
}
