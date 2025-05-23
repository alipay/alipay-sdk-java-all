package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CrossBorderEcomShopDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.crossborder.ecomshopdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-20 15:12:23
 */
public class ZhimaCreditEpCrossborderEcomshopdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4527847946116475717L;

	/** 
	 * 结果集
	 */
	@ApiField("data")
	private CrossBorderEcomShopDetail data;

	public void setData(CrossBorderEcomShopDetail data) {
		this.data = data;
	}
	public CrossBorderEcomShopDetail getData( ) {
		return this.data;
	}

}
