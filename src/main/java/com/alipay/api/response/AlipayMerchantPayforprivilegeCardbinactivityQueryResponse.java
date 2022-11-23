package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardBinActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.cardbinactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-10 14:57:45
 */
public class AlipayMerchantPayforprivilegeCardbinactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4354686839256411657L;

	/** 
	 * 查询到的卡bin活动信息
	 */
	@ApiField("card_bin_info")
	private CardBinActivityInfo cardBinInfo;

	public void setCardBinInfo(CardBinActivityInfo cardBinInfo) {
		this.cardBinInfo = cardBinInfo;
	}
	public CardBinActivityInfo getCardBinInfo( ) {
		return this.cardBinInfo;
	}

}
