package com.ctrip.xpipe.redis.core.proxy;

import com.ctrip.xpipe.api.proxy.ProxyProtocol;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;

/**
 * @author chen.zhu
 * <p>
 * Aug 15, 2018
 */
public interface ProxyedConnectionFactory {

    ChannelFuture getProxyedConnectionChannelFuture(ProxyProtocol protocol, Bootstrap bootstrap);
}
