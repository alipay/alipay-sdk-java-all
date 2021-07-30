package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学分银行用户证书数据模型
 *
 * @author auto create
 * @since 1.0, 2020-12-09 22:23:11
 */
public class CreditBankCertificateExperience extends AlipayObject {

	private static final long serialVersionUID = 8658764789146519533L;

	/**
	 * 获得证书id
	 */
	@ApiField("cert_exp_outer_id")
	private String certExpOuterId;

	/**
	 * 证书等级
	 */
	@ApiField("certificate_level")
	private String certificateLevel;

	/**
	 * 证书名称
	 */
	@ApiField("certificate_name")
	private String certificateName;

	/**
	 * 获取时间，格式yyyy-mm-dd HH:mm:ss
	 */
	@ApiField("experience_time")
	private Date experienceTime;

	/**
	 * 办学机构
	 */
	@ApiField("inst_name")
	private String instName;

	public String getCertExpOuterId() {
		return this.certExpOuterId;
	}
	public void setCertExpOuterId(String certExpOuterId) {
		this.certExpOuterId = certExpOuterId;
	}

	public String getCertificateLevel() {
		return this.certificateLevel;
	}
	public void setCertificateLevel(String certificateLevel) {
		this.certificateLevel = certificateLevel;
	}

	public String getCertificateName() {
		return this.certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public Date getExperienceTime() {
		return this.experienceTime;
	}
	public void setExperienceTime(Date experienceTime) {
		this.experienceTime = experienceTime;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

}
