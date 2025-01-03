package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditservice.detail.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 11:23:44
 */
public class ZhimaMerchantCreditserviceDetailCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8687676789649434488L;

	/** 
	 * 信用服务ID，是成功创建信用服务的ID。
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	/** 
	 * 信用服务版本号，是成功创建信用服务的版本号。
	 */
	@ApiField("version_no")
	private String versionNo;

	public void setCreditServiceId(String creditServiceId) {
		this.creditServiceId = creditServiceId;
	}
	public String getCreditServiceId( ) {
		return this.creditServiceId;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
