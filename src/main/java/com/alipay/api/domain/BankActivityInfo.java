package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行活动信息
 *
 * @author auto create
 * @since 1.0, 2022-10-25 11:46:57
 */
public class BankActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 6399964534748577151L;

	/**
	 * 是否绑定银行卡
	 */
	@ApiField("bind_card")
	private Boolean bindCard;

	/**
	 * 银行卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 优惠描述
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 活动logo
	 */
	@ApiField("logo")
	private String logo;

	public Boolean getBindCard() {
		return this.bindCard;
	}
	public void setBindCard(Boolean bindCard) {
		this.bindCard = bindCard;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

}
