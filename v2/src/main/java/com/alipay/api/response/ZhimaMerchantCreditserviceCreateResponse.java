package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditservice.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 18:13:01
 */
public class ZhimaMerchantCreditserviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7628642225465438927L;

	/** 
	 * 成功创建后返回信用服务的ID。
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	/** 
	 * 成功创建后返回的信用服务的版本号，从1开始，随着信用服务配置更新递增。
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
