package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.qingyongtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 17:12:03
 */
public class AlipayBossProdQingyongtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5761356332394881413L;

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
