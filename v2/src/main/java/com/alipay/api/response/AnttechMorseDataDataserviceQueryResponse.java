package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.data.dataservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-11 18:13:36
 */
public class AnttechMorseDataDataserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1364473148128733445L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于链路问题定位排查和对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 结果字段，用于展示定制模型打分结果
	 */
	@ApiField("result")
	private String result;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
