package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照
 *
 * @author auto create
 * @since 1.0, 2023-03-03 17:12:22
 */
public class BusinessLicenseDTO extends AlipayObject {

	private static final long serialVersionUID = 7281781755147232417L;

	/**
	 * 认证手机号码:营业执照法人手机号码
	 */
	@ApiField("cert_mobile")
	private String certMobile;

	/**
	 * 证照名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证照号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证照图片
	 */
	@ApiField("cert_pic")
	private String certPic;

	/**
	 * 证照类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * yyyy-MM-dd 长期有效传入 9999-12-31
	 */
	@ApiField("date_limitation")
	private Date dateLimitation;

	public String getCertMobile() {
		return this.certMobile;
	}
	public void setCertMobile(String certMobile) {
		this.certMobile = certMobile;
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

	public String getCertPic() {
		return this.certPic;
	}
	public void setCertPic(String certPic) {
		this.certPic = certPic;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public Date getDateLimitation() {
		return this.dateLimitation;
	}
	public void setDateLimitation(Date dateLimitation) {
		this.dateLimitation = dateLimitation;
	}

}
