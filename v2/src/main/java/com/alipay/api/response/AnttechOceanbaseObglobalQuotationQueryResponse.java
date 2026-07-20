package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.quotation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-10 17:37:57
 */
public class AnttechOceanbaseObglobalQuotationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8811996828386665341L;

	/** 
	 * null
	 */
	@ApiListField("quotation_desc_list")
	@ApiField("string")
	private List<String> quotationDescList;

	public void setQuotationDescList(List<String> quotationDescList) {
		this.quotationDescList = quotationDescList;
	}
	public List<String> getQuotationDescList( ) {
		return this.quotationDescList;
	}

}
