package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡详情
 *
 * @author auto create
 * @since 1.0, 2026-05-27 16:42:58
 */
public class BizCard extends AlipayObject {

	private static final long serialVersionUID = 5422748582532598112L;

	/**
	 * 卡生效日期
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * 卡详情跳转链接
	 */
	@ApiField("card_link_url")
	private String cardLinkUrl;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡号,只有开卡之后才返回该值
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 卡模板code
	 */
	@ApiField("card_template_code")
	private String cardTemplateCode;

	/**
	 * 卡种类型,分为预付的储值卡和直接权益抵扣的权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 卡周期类型
	 */
	@ApiField("card_validity_period_type")
	private String cardValidityPeriodType;

	/**
	 * 过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getCardLinkUrl() {
		return this.cardLinkUrl;
	}
	public void setCardLinkUrl(String cardLinkUrl) {
		this.cardLinkUrl = cardLinkUrl;
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

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardTemplateCode() {
		return this.cardTemplateCode;
	}
	public void setCardTemplateCode(String cardTemplateCode) {
		this.cardTemplateCode = cardTemplateCode;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardValidityPeriodType() {
		return this.cardValidityPeriodType;
	}
	public void setCardValidityPeriodType(String cardValidityPeriodType) {
		this.cardValidityPeriodType = cardValidityPeriodType;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

}
