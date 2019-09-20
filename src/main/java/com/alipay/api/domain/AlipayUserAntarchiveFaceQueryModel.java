package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁档案人脸图片查询
 *
 * @author auto create
 * @since 1.0, 2018-11-28 14:49:34
 */
public class AlipayUserAntarchiveFaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1269859259722733315L;

	/**
	 * 出生日期(RFC3339格式)，yyyy-MM-dd，可选.若证件类型为105(港澳居民往来内地通行证)或106(台湾居民往来内地通行证)时,cert_expire_date与birthday至少填写一项
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 证件过期日期(RFC3339格式)，yyyy-MM-dd，可选.若证件类型为105(港澳居民往来内地通行证)或106(台湾居民往来内地通行证)时,cert_expire_date与birthday至少填写一项
	 */
	@ApiField("cert_expire_date")
	private String certExpireDate;

	/**
	 * 证件上的姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号.若证件类型为105(港澳居民往来内地通行证),需将换证次数拼接到证件号后,如H8746985300
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型,取值范围为:
100 居民身份证
102 护照
105 港澳居民往来内地通行证
106 台湾居民往来内地通行证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 性别,可选.取值范围:
1 男
2 女
	 */
	@ApiField("gender")
	private String gender;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCertExpireDate() {
		return this.certExpireDate;
	}
	public void setCertExpireDate(String certExpireDate) {
		this.certExpireDate = certExpireDate;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

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

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
