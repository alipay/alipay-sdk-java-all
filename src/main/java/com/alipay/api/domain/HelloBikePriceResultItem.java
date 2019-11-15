package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * hellobike 定价返回结构体
 *
 * @author auto create
 * @since 1.0, 2018-11-29 15:49:29
 */
public class HelloBikePriceResultItem extends AlipayObject {

	private static final long serialVersionUID = 3457859917988564819L;

	/**
	 * 优惠卡类型，枚举值为 mcard,qcard,hycard,ycard,tcard
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 推荐价格，单位为分
	 */
	@ApiField("promo_price_cent")
	private Long promoPriceCent;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getPromoPriceCent() {
		return this.promoPriceCent;
	}
	public void setPromoPriceCent(Long promoPriceCent) {
		this.promoPriceCent = promoPriceCent;
	}

}
