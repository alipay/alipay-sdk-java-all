package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡详情信息
 *
 * @author auto create
 * @since 1.0, 2023-10-25 17:53:10
 */
public class CardDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4129984113476263538L;

	/**
	 * 当前余额，单位元，精确到分
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 卡背景图片
	 */
	@ApiField("card_bg_image")
	private String cardBgImage;

	/**
	 * 卡LOGO地址
	 */
	@ApiField("card_logo")
	private String cardLogo;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 初始面额，单位元，精确到分
	 */
	@ApiField("origin_amount")
	private String originAmount;

	/**
	 * 截止时间
	 */
	@ApiField("valid_end_date")
	private String validEndDate;

	/**
	 * 起始时间
	 */
	@ApiField("valid_start_date")
	private String validStartDate;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCardBgImage() {
		return this.cardBgImage;
	}
	public void setCardBgImage(String cardBgImage) {
		this.cardBgImage = cardBgImage;
	}

	public String getCardLogo() {
		return this.cardLogo;
	}
	public void setCardLogo(String cardLogo) {
		this.cardLogo = cardLogo;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

	public String getValidEndDate() {
		return this.validEndDate;
	}
	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}

	public String getValidStartDate() {
		return this.validStartDate;
	}
	public void setValidStartDate(String validStartDate) {
		this.validStartDate = validStartDate;
	}

}
