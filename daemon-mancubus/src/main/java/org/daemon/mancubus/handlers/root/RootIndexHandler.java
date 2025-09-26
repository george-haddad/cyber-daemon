package org.daemon.mancubus.handlers.root;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

public class RootIndexHandler implements Handler<RoutingContext> {

        @Override
        public void handle(RoutingContext ctx) {
                ctx.response()
                        .putHeader("content-type", "text/plain")
                        .setStatusCode(200)
                        .end("Hello");
        }
}
