package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MallCardBo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:05
 */
public class KoubeiShopMallCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5654471831825346321L;

	/** 
	 * 商圈发行的会员卡信息
	 */
	@ApiListField("cards")
	@ApiField("mall_card_bo")
	private List<MallCardBo> cards;

	/** 
	 * 是否开通会员系统功能
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 商圈会员开卡链接
	 */
	@ApiField("open_card_url")
	private String openCardUrl;

	public void setCards(List<MallCardBo> cards) {
		this.cards = cards;
	}
	public List<MallCardBo> getCards( ) {
		return this.cards;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

	public void setOpenCardUrl(String openCardUrl) {
		this.openCardUrl = openCardUrl;
	}
	public String getOpenCardUrl( ) {
		return this.openCardUrl;
	}

}
