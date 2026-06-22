package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CrossBorderEcomCompanyDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.cbecomdetail.person.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-13 12:07:44
 */
public class ZhimaCreditEpCbecomdetailPersonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3676958231719424866L;

	/** 
	 * null
	 */
	@ApiListField("array_data")
	@ApiField("cross_border_ecom_company_detail")
	private List<CrossBorderEcomCompanyDetail> arrayData;

	public void setArrayData(List<CrossBorderEcomCompanyDetail> arrayData) {
		this.arrayData = arrayData;
	}
	public List<CrossBorderEcomCompanyDetail> getArrayData( ) {
		return this.arrayData;
	}

}
