package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商一体化开通作业添加入驻开通项
 *
 * @author auto create
 * @since 1.0, 2026-05-28 14:55:35
 */
public class AlipayOpenSpInteopSettleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3574753723354665855L;

	/**
	 * 银行账户信息。个体工商户、普通企业必填。
个体工商户支持对公账户、个人储蓄卡。 普通企业，只支持对公账户。
	 */
	@ApiField("bank_card_info")
	private SettleBankCardInfo bankCardInfo;

	/**
	 * 受益人证照
	 */
	@ApiField("benefit_info")
	private BizOpenCertificateInfoForEntry benefitInfo;

	/**
	 * 多受益人证照信息
	 */
	@ApiListField("benefit_infos")
	@ApiField("biz_open_certificate_info_for_entry")
	private List<BizOpenCertificateInfoForEntry> benefitInfos;

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

	public SettleBankCardInfo getBankCardInfo() {
		return this.bankCardInfo;
	}
	public void setBankCardInfo(SettleBankCardInfo bankCardInfo) {
		this.bankCardInfo = bankCardInfo;
	}

	public BizOpenCertificateInfoForEntry getBenefitInfo() {
		return this.benefitInfo;
	}
	public void setBenefitInfo(BizOpenCertificateInfoForEntry benefitInfo) {
		this.benefitInfo = benefitInfo;
	}

	public List<BizOpenCertificateInfoForEntry> getBenefitInfos() {
		return this.benefitInfos;
	}
	public void setBenefitInfos(List<BizOpenCertificateInfoForEntry> benefitInfos) {
		this.benefitInfos = benefitInfos;
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
