package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文档回归测试勿动openapi_noopenid_post多场景
 *
 * @author auto create
 * @since 1.0, 2023-04-27 15:18:48
 */
public class AlipaySecurityDataSssModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2355568794862113275L;

	/**
	 * 必须，复杂参数
	 */
	@ApiField("fff")
	private AgreementParams fff;

	/**
	 * 特殊可选，布尔值，有注意事项
	 */
	@ApiField("fr")
	private Boolean fr;

	/**
	 * 营业执照有效期时间，注意事项
	 */
	@ApiField("license_expiry_date")
	private Date licenseExpiryDate;

	/**
	 * 数字，path，无注意事项
	 */
	@ApiField("xxx")
	private Long xxx;

	/**
	 * 金额，string,示例值，枚举值，注意事项
	 */
	@ApiField("xxx_amount")
	private String xxxAmount;

	public AgreementParams getFff() {
		return this.fff;
	}
	public void setFff(AgreementParams fff) {
		this.fff = fff;
	}

	public Boolean getFr() {
		return this.fr;
	}
	public void setFr(Boolean fr) {
		this.fr = fr;
	}

	public Date getLicenseExpiryDate() {
		return this.licenseExpiryDate;
	}
	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public Long getXxx() {
		return this.xxx;
	}
	public void setXxx(Long xxx) {
		this.xxx = xxx;
	}

	public String getXxxAmount() {
		return this.xxxAmount;
	}
	public void setXxxAmount(String xxxAmount) {
		this.xxxAmount = xxxAmount;
	}

}
