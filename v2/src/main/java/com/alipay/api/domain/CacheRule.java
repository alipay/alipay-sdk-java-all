package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缓存信息
 *
 * @author auto create
 * @since 1.0, 2023-08-02 13:27:51
 */
public class CacheRule extends AlipayObject {

	private static final long serialVersionUID = 8529223465571168383L;

	/**
	 * 缓存键
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/**
	 * 缓存优先级，数字越大缓存优先级越高
	 */
	@ApiField("cache_priority")
	private Long cachePriority;

	/**
	 * 缓存超时时间，秒为单位
	 */
	@ApiField("cache_timeout")
	private Long cacheTimeout;

	/**
	 * 缓存类型
	 */
	@ApiField("cache_type")
	private String cacheType;

	public String getCacheKey() {
		return this.cacheKey;
	}
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public Long getCachePriority() {
		return this.cachePriority;
	}
	public void setCachePriority(Long cachePriority) {
		this.cachePriority = cachePriority;
	}

	public Long getCacheTimeout() {
		return this.cacheTimeout;
	}
	public void setCacheTimeout(Long cacheTimeout) {
		this.cacheTimeout = cacheTimeout;
	}

	public String getCacheType() {
		return this.cacheType;
	}
	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}

}
