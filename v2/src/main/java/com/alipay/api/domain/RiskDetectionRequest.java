package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险咨询服务请求
 *
 * @author auto create
 * @since 1.0, 2025-12-24 15:52:41
 */
public class RiskDetectionRequest extends AlipayObject {

	private static final long serialVersionUID = 6112953398461924132L;

	/**
	 * 检测金额
	 */
	@ApiField("detection_amount")
	private MultiCurrencyMoneyOpenApi detectionAmount;

	/**
	 * VPC智付使用时可填写vpcSmartPay
	 */
	@ApiField("detection_source")
	private String detectionSource;

	/**
	 * 填写参与风险检测的业务单据号
	 */
	@ApiField("document_no")
	private String documentNo;

	/**
	 * 本次参与检测的单据类型
	 */
	@ApiField("document_type")
	private String documentType;

	/**
	 * 扩展业务要素【是指单据本身的业务属性，用于匹配风险检测规则，区别于riskDetectionParameters】
	 */
	@ApiListField("ext_info")
	@ApiField("risk_detection_map")
	private List<RiskDetectionMap> extInfo;

	/**
	 * VPC智付使用时填写bizid
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 风险检测参数【用于风险咨询的业务要素，比如invoiceNo,invoiceCode】
	 */
	@ApiListField("risk_detection_parameters")
	@ApiField("risk_detection_map")
	private List<RiskDetectionMap> riskDetectionParameters;

	/**
	 * 允许指定风险点进行检测，可支持输入多个，不输入的情况下默认检测该阶段下所有的风险点
	 */
	@ApiListField("risk_point_codes")
	@ApiField("string")
	private List<String> riskPointCodes;

	/**
	 * 二级业务环节枚举
BILL_INVOICE_CORRELATION-VPC老账票关联
PAYMENT_RECEIPT_CREATE-VPC老付款单创建
INVOICE_RELATE-VPC新账票关联
PAYMENT_APPLY-VPC新付款单创建
PAYMENT_SUBMIT-VPC新付款单提交
	 */
	@ApiField("second_level_business_link")
	private String secondLevelBusinessLink;

	/**
	 * VPC智付填写vendorId
	 */
	@ApiField("settle_ip_role_id")
	private String settleIpRoleId;

	public MultiCurrencyMoneyOpenApi getDetectionAmount() {
		return this.detectionAmount;
	}
	public void setDetectionAmount(MultiCurrencyMoneyOpenApi detectionAmount) {
		this.detectionAmount = detectionAmount;
	}

	public String getDetectionSource() {
		return this.detectionSource;
	}
	public void setDetectionSource(String detectionSource) {
		this.detectionSource = detectionSource;
	}

	public String getDocumentNo() {
		return this.documentNo;
	}
	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	public String getDocumentType() {
		return this.documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public List<RiskDetectionMap> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<RiskDetectionMap> extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public List<RiskDetectionMap> getRiskDetectionParameters() {
		return this.riskDetectionParameters;
	}
	public void setRiskDetectionParameters(List<RiskDetectionMap> riskDetectionParameters) {
		this.riskDetectionParameters = riskDetectionParameters;
	}

	public List<String> getRiskPointCodes() {
		return this.riskPointCodes;
	}
	public void setRiskPointCodes(List<String> riskPointCodes) {
		this.riskPointCodes = riskPointCodes;
	}

	public String getSecondLevelBusinessLink() {
		return this.secondLevelBusinessLink;
	}
	public void setSecondLevelBusinessLink(String secondLevelBusinessLink) {
		this.secondLevelBusinessLink = secondLevelBusinessLink;
	}

	public String getSettleIpRoleId() {
		return this.settleIpRoleId;
	}
	public void setSettleIpRoleId(String settleIpRoleId) {
		this.settleIpRoleId = settleIpRoleId;
	}

}
