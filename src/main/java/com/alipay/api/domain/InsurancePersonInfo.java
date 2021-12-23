package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险人的信息
 *
 * @author auto create
 * @since 1.0, 2021-06-21 19:31:18
 */
public class InsurancePersonInfo extends AlipayObject {

	private static final long serialVersionUID = 5281771519692226968L;

	/**
	 * 证件号码
	 */
	@ApiField("card_code")
	private String cardCode;

	/**
	 * 投保人证件类型 01-居民身份证 03-营业执照
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 联系方式
	 */
	@ApiField("contact_info")
	private String contactInfo;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getCardCode() {
		return this.cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
