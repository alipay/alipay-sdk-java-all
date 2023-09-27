package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除缓存配置
 *
 * @author auto create
 * @since 1.0, 2023-09-21 12:45:01
 */
public class AlipayCloudCloudrunObjectstorageCacheruleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3348991511875911726L;

	/**
	 * 内部使用 uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 缓存键
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/**
	 * 缓存类型。
目录：为某一路径下所有资源设置相同缓存规则。
文件后缀名：为某一文件类型资源的设置相同缓存规则。
	 */
	@ApiField("cache_type")
	private String cacheType;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getCacheKey() {
		return this.cacheKey;
	}
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getCacheType() {
		return this.cacheType;
	}
	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
