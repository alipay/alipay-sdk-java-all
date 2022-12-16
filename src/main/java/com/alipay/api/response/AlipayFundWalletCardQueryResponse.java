package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GiftCardVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:16:43
 */
public class AlipayFundWalletCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8193949738755334133L;

	/** 
	 * 礼品卡对客展示
	 */
	@ApiListField("gift_card_vos")
	@ApiField("gift_card_vo")
	private List<GiftCardVo> giftCardVos;

	public void setGiftCardVos(List<GiftCardVo> giftCardVos) {
		this.giftCardVos = giftCardVos;
	}
	public List<GiftCardVo> getGiftCardVos( ) {
		return this.giftCardVos;
	}

}
