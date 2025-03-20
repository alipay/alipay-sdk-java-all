package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.dataservice.insurancestatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-11 18:13:58
 */
public class AnttechMorseDataserviceInsurancestatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7818864486598226265L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于链路问题定位排查和对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 查询月份的社保缴纳状态，true代表已缴纳，false代表未缴纳
	 */
	@ApiField("status")
	private Boolean status;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
