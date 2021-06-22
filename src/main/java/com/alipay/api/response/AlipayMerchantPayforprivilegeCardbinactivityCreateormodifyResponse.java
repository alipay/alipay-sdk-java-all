package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardBinActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.cardbinactivity.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-21 15:07:33
 */
public class AlipayMerchantPayforprivilegeCardbinactivityCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1591494883828593762L;

	/** 
	 * 新增/修改的结果
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
