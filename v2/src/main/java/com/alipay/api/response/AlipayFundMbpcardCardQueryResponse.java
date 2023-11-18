package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-25 17:56:48
 */
public class AlipayFundMbpcardCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7314292935687475668L;

	/** 
	 * 卡详情列表信息
	 */
	@ApiField("mbp_card_list")
	private CardDetailInfo mbpCardList;

	public void setMbpCardList(CardDetailInfo mbpCardList) {
		this.mbpCardList = mbpCardList;
	}
	public CardDetailInfo getMbpCardList( ) {
		return this.mbpCardList;
	}

}
