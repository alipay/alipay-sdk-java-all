package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口信息模型
 *
 * @author auto create
 * @since 1.0, 2023-04-11 10:47:14
 */
public class ApiInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3839398361138463994L;

	/**
	 * 用于查询应用已添加前台产品信息的接口
	 */
	@ApiField("api_desc")
	private String apiDesc;

	/**
	 * 接口英文名称
	 */
	@ApiField("api_name")
	private String apiName;

	public String getApiDesc() {
		return this.apiDesc;
	}
	public void setApiDesc(String apiDesc) {
		this.apiDesc = apiDesc;
	}

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

}
