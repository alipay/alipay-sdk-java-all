package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.fliggy.shop.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:51:41
 */
public class AlipayOverseasTravelFliggyShopTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 6844698888857683597L;

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
