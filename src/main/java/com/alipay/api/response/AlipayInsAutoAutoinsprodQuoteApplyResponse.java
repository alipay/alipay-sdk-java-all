package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuoteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.quote.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-26 15:39:16
 */
public class AlipayInsAutoAutoinsprodQuoteApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4576588418529233771L;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 报价返回信息
	 */
	@ApiListField("quote_infos")
	@ApiField("quote_info")
	private List<QuoteInfo> quoteInfos;

	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}
	public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

	public void setQuoteInfos(List<QuoteInfo> quoteInfos) {
		this.quoteInfos = quoteInfos;
	}
	public List<QuoteInfo> getQuoteInfos( ) {
		return this.quoteInfos;
	}

}
