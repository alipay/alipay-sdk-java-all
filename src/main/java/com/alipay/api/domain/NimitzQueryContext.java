package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Nimitz 查询语境
 *
 * @author auto create
 * @since 1.0, 2022-06-10 15:34:21
 */
public class NimitzQueryContext extends AlipayObject {

	private static final long serialVersionUID = 7771682525554888323L;

	/**
	 * 查询策略，可选经过缓存 CACHED，或不经过缓存 DIRECT
	 */
	@ApiField("query_strategy")
	private String queryStrategy;

	/**
	 * 用于区分访问者身份
	 */
	@ApiField("query_token")
	private String queryToken;

	public String getQueryStrategy() {
		return this.queryStrategy;
	}
	public void setQueryStrategy(String queryStrategy) {
		this.queryStrategy = queryStrategy;
	}

	public String getQueryToken() {
		return this.queryToken;
	}
	public void setQueryToken(String queryToken) {
		this.queryToken = queryToken;
	}

}
