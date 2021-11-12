package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.edumigrate.migrateservice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-02 15:35:19
 */
public class AlipayCommerceEducateEdumigrateMigrateserviceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5317914995575812165L;

	/** 
	 * data字段为迁移服务数据返回 JSON结构
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
