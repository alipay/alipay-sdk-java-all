package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.customerservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-08 18:26:00
 */
public class AlipayEcoMycarParkingCustomerserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5384412319467881249L;

	/** 
	 * 具体响应参数
	 */
	@ApiField("response_content")
	private String responseContent;

	/** 
	 * 想用类型：
- 1：车牌绑定代扣关系
- 2：查询停车订单信息
	 */
	@ApiField("response_type")
	private String responseType;

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}
	public String getResponseContent( ) {
		return this.responseContent;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	public String getResponseType( ) {
		return this.responseType;
	}

}
