package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员交易信息订阅申请
 *
 * @author auto create
 * @since 1.0, 2018-01-26 15:43:59
 */
public class KoubeiMarketingMallTradeSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 6886894442734993889L;

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
