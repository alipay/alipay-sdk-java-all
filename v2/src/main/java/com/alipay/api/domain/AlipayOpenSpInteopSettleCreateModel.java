package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业添加入驻开通项
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:07:17
 */
public class AlipayOpenSpInteopSettleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2727958946728758696L;

	/**
	 * 受益人证照
	 */
	@ApiField("benefit_info")
	private BizOpenCertificateInfoForEntry benefitInfo;

	/**
	 * 业务开通主单号，用于一体化作业过程的申请单串联
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 法人证照
	 */
	@ApiField("legal_info")
	private BizOpenCertificateInfoForEntry legalInfo;

	/**
	 * 法人登录号
	 */
	@ApiField("legal_person_logon_id")
	private String legalPersonLogonId;

	/**
	 * 主体证照信息
	 */
	@ApiField("license_info")
	private BizOpenCommonMerchantLicenseInfo licenseInfo;

	/**
	 * 01普通企业  07个体工商户
	 */
	@ApiField("merchant_type")
	private String merchantType;

	public BizOpenCertificateInfoForEntry getBenefitInfo() {
		return this.benefitInfo;
	}
	public void setBenefitInfo(BizOpenCertificateInfoForEntry benefitInfo) {
		this.benefitInfo = benefitInfo;
	}

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public BizOpenCertificateInfoForEntry getLegalInfo() {
		return this.legalInfo;
	}
	public void setLegalInfo(BizOpenCertificateInfoForEntry legalInfo) {
		this.legalInfo = legalInfo;
	}

	public String getLegalPersonLogonId() {
		return this.legalPersonLogonId;
	}
	public void setLegalPersonLogonId(String legalPersonLogonId) {
		this.legalPersonLogonId = legalPersonLogonId;
	}

	public BizOpenCommonMerchantLicenseInfo getLicenseInfo() {
		return this.licenseInfo;
	}
	public void setLicenseInfo(BizOpenCommonMerchantLicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

}
