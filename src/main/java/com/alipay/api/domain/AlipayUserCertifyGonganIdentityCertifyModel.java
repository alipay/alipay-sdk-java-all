package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公安网身份信息验证外部接口
 *
 * @author auto create
 * @since 1.0, 2018-08-30 19:52:15
 */
public class AlipayUserCertifyGonganIdentityCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 8857252787196368896L;

	/**
	 * 生日，格式为yyyyMMdd；如果需要校验的证件为非大陆身份证，则该字段必须传入
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * IDENTITY_CARD：身份证
HOME_VISIT_PERMIT_HK_MC：港澳居民来往内地通行证  
HOME_VISIT_PERMIT_TAIWAN：台湾居民来往内地通行证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 换证次数；如果需要校验的证件为非大陆身份证，则该字段必须传入
	 */
	@ApiField("cert_version")
	private Long certVersion;

	/**
	 * 证件有效期日期，格式为yyyyMMdd；如果需要校验的证件为非大陆身份证，则该字段必须传入
	 */
	@ApiField("expired_date")
	private String expiredDate;

	/**
	 * 用户证件
	 */
	@ApiField("real_name")
	private String realName;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

	public Long getCertVersion() {
		return this.certVersion;
	}
	public void setCertVersion(Long certVersion) {
		this.certVersion = certVersion;
	}

	public String getExpiredDate() {
		return this.expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
