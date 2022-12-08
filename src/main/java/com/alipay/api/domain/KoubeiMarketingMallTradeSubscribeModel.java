package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员交易信息订阅申请
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:08:43
 */
public class KoubeiMarketingMallTradeSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 4385797968942453352L;

	/**
	 * 会员卡模版id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
