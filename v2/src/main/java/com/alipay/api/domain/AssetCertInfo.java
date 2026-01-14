package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡卡密信息
 *
 * @author auto create
 * @since 1.0, 2024-03-18 18:55:01
 */
public class AssetCertInfo extends AlipayObject {

	private static final long serialVersionUID = 3755288426133931399L;

	/**
	 * 预付卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 预付卡卡密加密后的字符串
	 */
	@ApiField("card_pwd")
	private String cardPwd;

	/**
	 * 预付卡卡模版Id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 预付卡卡面额
	 */
	@ApiField("denomination")
	private String denomination;

	/**
	 * 制卡订单id
	 */
	@ApiField("order_id")
	private String orderId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardPwd() {
		return this.cardPwd;
	}
	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getDenomination() {
		return this.denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
