package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用DataAPI工商资料查询
 *
 * @author auto create
 * @since 1.0, 2022-04-29 15:37:18
 */
public class ZhimaCreditEpDataapiMigrationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8871834535346178333L;

	/**
	 * 原来dataapi http方法，get, post, put, delete
	 */
	@ApiField("api_method")
	private String apiMethod;

	/**
	 * 原来dataapi名称，比如工商资料，主要成员
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * 原来DataAPI参数
	 */
	@ApiField("api_params")
	private String apiParams;

	public String getApiMethod() {
		return this.apiMethod;
	}
	public void setApiMethod(String apiMethod) {
		this.apiMethod = apiMethod;
	}

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiParams() {
		return this.apiParams;
	}
	public void setApiParams(String apiParams) {
		this.apiParams = apiParams;
	}

}
