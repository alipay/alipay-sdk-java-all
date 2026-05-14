package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcomCompanyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ecomdetail.person.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-01 15:57:45
 */
public class ZhimaCreditEpEcomdetailPersonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5361764811614711642L;

	/** 
	 * null
	 */
	@ApiListField("array_data")
	@ApiField("ecom_company_info")
	private List<EcomCompanyInfo> arrayData;

	public void setArrayData(List<EcomCompanyInfo> arrayData) {
		this.arrayData = arrayData;
	}
	public List<EcomCompanyInfo> getArrayData( ) {
		return this.arrayData;
	}

}
