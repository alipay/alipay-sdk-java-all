package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardTradeList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campuscard.tradelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-20 11:35:28
 */
public class AlipayCommerceEducateCampuscardTradelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6369759538416471517L;

	/** 
	 * 数据总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 交易列表
	 */
	@ApiListField("tradelist")
	@ApiField("card_trade_list")
	private List<CardTradeList> tradelist;

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTradelist(List<CardTradeList> tradelist) {
		this.tradelist = tradelist;
	}
	public List<CardTradeList> getTradelist( ) {
		return this.tradelist;
	}

}
