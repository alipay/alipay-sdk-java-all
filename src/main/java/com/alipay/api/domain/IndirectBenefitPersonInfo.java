package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受益人身份信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 10:50:16
 */
public class IndirectBenefitPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 2516481782628789573L;

	/**
	 * 受益人证件反面照（使用图片上传接口的image_id）。当证件类型为身份证时，此字段必传；当证件类型为非身份证时，此字段非必传。
	 */
	@ApiField("card_back_img")
	private String cardBackImg;

	/**
	 * 受益人证件正面照（使用图片上传接口的image_id）
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
	 * 受益人姓名
	 */
	@ApiField("person_name")
	private String personName;

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

	public String getPersonName() {
		return this.personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
