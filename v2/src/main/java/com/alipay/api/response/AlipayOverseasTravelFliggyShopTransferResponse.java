package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.fliggy.shop.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:01:56
 */
public class AlipayOverseasTravelFliggyShopTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7846732642221192553L;

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
