package com.example.reactorNettyHttpServerConnectionsActive;

import java.util.function.Function;

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReactorNettyMetricsConfig implements
    WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {

    @Override
    public void customize(final NettyReactiveWebServerFactory factory) {
        factory.addServerCustomizers(httpServer ->
            httpServer.metrics(true, Function.identity()));
    }
}
