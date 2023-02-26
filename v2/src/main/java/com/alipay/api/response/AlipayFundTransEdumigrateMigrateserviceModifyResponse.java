package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.edumigrate.migrateservice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:40:22
 */
public class AlipayFundTransEdumigrateMigrateserviceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7624492572598853171L;

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
