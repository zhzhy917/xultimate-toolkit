package org.danielli.xultimate.context.kvStore.memcached.xmemcached;

import net.rubyeye.xmemcached.MemcachedClient;

/**
 * XMemcached回调。
 * 
 * @author Daniel Li
 * @since 19 Jun 2013
 */
public interface XMemcachedCallback {
	
	/**
	 * 回调实现。
	 * 
	 * @param memcachedClient XMemcached客户端。
	 */
	void doInXMemcached(MemcachedClient memcachedClient) throws Exception;
}