package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjQuoteTagDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 17:27:39
 */
public class AlipayFinanceQuotationQuotetradeopenTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3476497916533379417L;

	/** 
	 * 行情标签模型
	 */
	@ApiListField("data")
	@ApiField("obj_quote_tag_d_t_o")
	private List<ObjQuoteTagDTO> data;

	public void setData(List<ObjQuoteTagDTO> data) {
		this.data = data;
	}
	public List<ObjQuoteTagDTO> getData( ) {
		return this.data;
	}

}
