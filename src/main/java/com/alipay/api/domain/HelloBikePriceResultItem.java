package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * hellobike 定价返回结构体
 *
 * @author auto create
 * @since 1.0, 2020-04-14 17:33:54
 */
public class HelloBikePriceResultItem extends AlipayObject {

	private static final long serialVersionUID = 5636277979861576566L;

	/**
	 * 优惠卡类型，枚举值为 mcard,qcard,hycard,ycard,tcard
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 排序优先级,数字越小,优先级越高,没有经过排序的卡类型默认返回-1
	 */
	@ApiField("priority")
	private String priority;

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

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Long getPromoPriceCent() {
		return this.promoPriceCent;
	}
	public void setPromoPriceCent(Long promoPriceCent) {
		this.promoPriceCent = promoPriceCent;
	}

}
