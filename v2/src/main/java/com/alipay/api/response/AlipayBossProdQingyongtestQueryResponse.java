package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.qingyongtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-06 15:59:29
 */
public class AlipayBossProdQingyongtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3135573448393944928L;

	/** 
	 * 是否调用成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 1
	 */
	@ApiField("test_chucan")
	private String testChucan;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setTestChucan(String testChucan) {
		this.testChucan = testChucan;
	}
	public String getTestChucan( ) {
		return this.testChucan;
	}

}
