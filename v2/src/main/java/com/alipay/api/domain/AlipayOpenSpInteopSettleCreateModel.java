package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业添加入驻开通项
 *
 * @author auto create
 * @since 1.0, 2026-01-04 14:12:37
 */
public class AlipayOpenSpInteopSettleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2891766567347479886L;

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
	 * 主体证照信息
	 */
	@ApiField("license_info")
	private BizOpenCommonMerchantLicenseInfo licenseInfo;

	/**
	 * 商户类型
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 用于接收入驻待办通知的经办人支付宝登录账号
	 */
	@ApiField("operator_login_id")
	private String operatorLoginId;

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

	public String getOperatorLoginId() {
		return this.operatorLoginId;
	}
	public void setOperatorLoginId(String operatorLoginId) {
		this.operatorLoginId = operatorLoginId;
	}

}
