package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2023-04-18 14:16:31
 */
public class IndirectContactPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 6492756951974995895L;

	/**
	 * 联系人身份证件号。
可传身份证、港澳居民来往内地通行证、港澳居民居住证、台湾居民来往大陆通行证、台湾居民居住证、护照、外国人永久居住证等证件号码，号码枚举见contact_card_type。若传身份证，需保证18位，且英文字母大写
	 */
	@ApiField("contact_card_no")
	private String contactCardNo;

	/**
	 * 联系人证件类型，枚举值：中国大陆居民-身份证(RESIDENT)、其他国家或地区居民-护照(PASSPORT)、中国港澳居民-来往内地通行证(PASSPORT_HK_MO)、中国台湾居民-来往大陆通行证(PASSPORT_TWN)、港澳居民居住证（RESIDENCE_PERMIT_HM）、台湾居民居住证（RESIDENCE_PERMIT_TW）、外国人永久居住证（PERMANENT_RESIDENCE_FOREIGNER）。个体户/企业/事业单位/社会组织：可选择任一证件类型。小微商户仅支持身份证类型。
	 */
	@ApiField("contact_cert_type")
	private String contactCertType;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人手机
	 */
	@ApiField("contact_phone_no")
	private String contactPhoneNo;

	public String getContactCardNo() {
		return this.contactCardNo;
	}
	public void setContactCardNo(String contactCardNo) {
		this.contactCardNo = contactCardNo;
	}

	public String getContactCertType() {
		return this.contactCertType;
	}
	public void setContactCertType(String contactCertType) {
		this.contactCertType = contactCertType;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhoneNo() {
		return this.contactPhoneNo;
	}
	public void setContactPhoneNo(String contactPhoneNo) {
		this.contactPhoneNo = contactPhoneNo;
	}

}
