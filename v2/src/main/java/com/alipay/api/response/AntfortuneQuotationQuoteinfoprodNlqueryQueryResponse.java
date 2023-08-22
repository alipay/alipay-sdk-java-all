package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NLResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.quotation.quoteinfoprod.nlquery.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 09:51:42
 */
public class AntfortuneQuotationQuoteinfoprodNlqueryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4828527251369637825L;

	/** 
	 * 模型处理结果
	 */
	@ApiField("data")
	private NLResultDTO data;

	public void setData(NLResultDTO data) {
		this.data = data;
	}
	public NLResultDTO getData( ) {
		return this.data;
	}

}
