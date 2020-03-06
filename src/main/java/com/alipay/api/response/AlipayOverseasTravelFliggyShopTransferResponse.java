package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.fliggy.shop.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-14 22:13:03
 */
public class AlipayOverseasTravelFliggyShopTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8394162542674211138L;

	/** 
	 * 响应数据
	 */
	@ApiField("result_data")
	private String resultData;

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}
	public String getResultData( ) {
		return this.resultData;
	}

}
