package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法人身份信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 10:50:16
 */
public class IndirectLegalPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 3672874644259471585L;

	/**
	 * 授权函照片（使用图片上传接口），当证件持有人类型为 经办人时，必须上传。其他情况，无需上传
	 */
	@ApiField("auth_letter_img")
	private String authLetterImg;

	/**
	 * 法人/经营者证件反面照（使用图片上传接口的image_id）。当证件类型为身份证时，此字段必传；当证件类型为非身份证时，此字段非必传。
	 */
	@ApiField("card_back_img")
	private String cardBackImg;

	/**
	 * 法人/经营者证件正面照（使用图片上传接口返回的image_id）
	 */
	@ApiField("card_front_img")
	private String cardFrontImg;

	/**
	 * 证件号码
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 证件类型，枚举值：中国大陆居民-身份证(RESIDENT)、其他国家或地区居民-护照(PASSPORT)、中国港澳居民-来往内地通行证(PASSPORT_HK_MO)、中国台湾居民-来往大陆通行证(PASSPORT_TWN)、港澳居民居住证（RESIDENCE_PERMIT_HM）、台湾居民居住证（RESIDENCE_PERMIT_TW）、外国人永久居住证（PERMANENT_RESIDENCE_FOREIGNER）。个体户/企业/事业单位/社会组织：可选择任一证件类型，政府机关、小微商户仅支持身份证类型。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 证件生效时间
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 证件过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 经营者/法人是否为受益人
	 */
	@ApiField("is_benefit_person")
	private Boolean isBenefitPerson;

	/**
	 * 证件持有人类型：
- 法人  LEGAL_PERSON
- 经办人  AGENT_PERSON
主体类型为政府机关、事业单位时选传：
（1）若上传的是法人证件，则不需要上传该字段。
（2）若因特殊情况，无法提供法人证件时，可上传经办人。
主体类型为企业、个体户、社会组织、小微商户时，默认为经营者/法人，不需要上传该字段。
	 */
	@ApiField("legal_type")
	private String legalType;

	/**
	 * 法人姓名
	 */
	@ApiField("person_name")
	private String personName;

	public String getAuthLetterImg() {
		return this.authLetterImg;
	}
	public void setAuthLetterImg(String authLetterImg) {
		this.authLetterImg = authLetterImg;
	}

	public String getCardBackImg() {
		return this.cardBackImg;
	}
	public void setCardBackImg(String cardBackImg) {
		this.cardBackImg = cardBackImg;
	}

	public String getCardFrontImg() {
		return this.cardFrontImg;
	}
	public void setCardFrontImg(String cardFrontImg) {
		this.cardFrontImg = cardFrontImg;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(String effectTime) {
		this.effectTime = effectTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Boolean getIsBenefitPerson() {
		return this.isBenefitPerson;
	}
	public void setIsBenefitPerson(Boolean isBenefitPerson) {
		this.isBenefitPerson = isBenefitPerson;
	}

	public String getLegalType() {
		return this.legalType;
	}
	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}

	public String getPersonName() {
		return this.personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
