package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城服用户消息推送许可查询
 *
 * @author auto create
 * @since 1.0, 2019-09-17 22:53:05
 */
public class AlipayEcoCityservicePushmsgPermitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3546435885534378419L;

	/**
	 * 证件号码
证件号码. 证件号码,手机号,姓名三个参 数至少有一个非空,多个条件的 情况下,按照身份证号,手机号 ,姓名的顺序匹配
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 
证件号码非空时,此字段必填
IDENTITY_CARD:身份证
PASSPORT:护照
OFFICER_CARD:军官证
SOLDIER_CARD:士兵证
BACK_HOMETOWN_CARD:回乡证
TEMP_INDENTITY_CARD:临时身份证
HOKOU:户口簿
POLICE_CARD:警官证
TAIWAN_CARD:台胞证
BUSINESS_LICENSE:营业执照
TW_HK_MC_LICENSE:港澳台居民大陆通行证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 手机号码 
证件号码,手机号,姓名三个参 数至少有一个非空,多个条件的 情况下,按照身份证号,手机号 ,姓名的顺序匹配
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 个人用户姓名 
证件号码,手机号,姓名三个参 数至少有一个非空,多个条件的 情况下,按照身份证号,手机号 ,姓名的顺序匹配
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
