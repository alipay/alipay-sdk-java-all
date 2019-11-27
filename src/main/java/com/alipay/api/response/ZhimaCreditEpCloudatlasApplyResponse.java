package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.cloudatlas.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditEpCloudatlasApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5726949648166384712L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 云图编码
	 */
	@ApiField("cloudatlas_code")
	private String cloudatlasCode;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCloudatlasCode(String cloudatlasCode) {
		this.cloudatlasCode = cloudatlasCode;
	}
	public String getCloudatlasCode( ) {
		return this.cloudatlasCode;
	}

}
