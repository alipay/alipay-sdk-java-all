package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期卡定价结果
 *
 * @author auto create
 * @since 1.0, 2021-04-15 16:15:17
 */
public class CardPriceResponseItem extends AlipayObject {

	private static final long serialVersionUID = 4836266531294782462L;

	/**
	 * 优惠卡类型，枚举值为 mcard,qcard,hycard,ycard,tcard
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 排序优先级,数字越小,优先级越高,没有经过排序的卡类型默认返回-1
	 */
	@ApiField("priority")
	private Long priority;

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

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Long getPromoPriceCent() {
		return this.promoPriceCent;
	}
	public void setPromoPriceCent(Long promoPriceCent) {
		this.promoPriceCent = promoPriceCent;
	}

}
