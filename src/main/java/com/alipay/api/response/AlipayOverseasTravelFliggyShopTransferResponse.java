package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.fliggy.shop.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 17:48:55
 */
public class AlipayOverseasTravelFliggyShopTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7326638359128881924L;

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
