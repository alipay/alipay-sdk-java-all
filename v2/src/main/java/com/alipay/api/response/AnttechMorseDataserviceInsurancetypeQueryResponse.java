package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.dataservice.insurancetype.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-11 18:14:18
 */
public class AnttechMorseDataserviceInsurancetypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5761441568728943188L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于链路问题定位排查和对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 是否为灵活就业，true代表是灵活就业，false代表不是灵活就业
	 */
	@ApiField("result")
	private Boolean result;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
