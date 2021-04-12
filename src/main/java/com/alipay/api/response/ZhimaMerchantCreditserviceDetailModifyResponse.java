package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditservice.detail.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-30 17:00:01
 */
public class ZhimaMerchantCreditserviceDetailModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1435688858321288943L;

	/** 
	 * 信用服务ID，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.merchant.creditservice.detail.create">zhima.merchant.creditservice.detail.create</a>(芝麻信用信用服务创建)接口创建信用服务后获取。
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
