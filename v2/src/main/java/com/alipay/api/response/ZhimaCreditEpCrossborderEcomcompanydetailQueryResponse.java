package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CrossBorderEcomCompanyDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.crossborder.ecomcompanydetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 15:47:21
 */
public class ZhimaCreditEpCrossborderEcomcompanydetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8421718967695959755L;

	/** 
	 * 结果集
	 */
	@ApiField("data")
	private CrossBorderEcomCompanyDetail data;

	public void setData(CrossBorderEcomCompanyDetail data) {
		this.data = data;
	}
	public CrossBorderEcomCompanyDetail getData( ) {
		return this.data;
	}

}
