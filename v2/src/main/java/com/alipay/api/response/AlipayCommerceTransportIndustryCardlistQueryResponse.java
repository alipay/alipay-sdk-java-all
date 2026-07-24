package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.cardlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 16:42:58
 */
public class AlipayCommerceTransportIndustryCardlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1896569429958815179L;

	/** 
	 * null
	 */
	@ApiListField("card_list")
	@ApiField("biz_card")
	private List<BizCard> cardList;

	/** 
	 * 数据总量,单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setCardList(List<BizCard> cardList) {
		this.cardList = cardList;
	}
	public List<BizCard> getCardList( ) {
		return this.cardList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
