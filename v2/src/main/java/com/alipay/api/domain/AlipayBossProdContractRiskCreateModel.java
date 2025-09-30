package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合同中心风险扫描
 *
 * @author auto create
 * @since 1.0, 2021-10-09 10:06:58
 */
public class AlipayBossProdContractRiskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5369179382619133187L;

	/**
	 * 待扫描的附件【前置已经写入法务oss】
	 */
	@ApiField("attach")
	private Attach attach;

	/**
	 * 请求id
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 业务线
	 */
	@ApiField("business_line")
	private String businessLine;

	/**
	 * 文件下载地址 http
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 开票类型
	 */
	@ApiListField("invoice_type_list")
	@ApiField("string")
	private List<String> invoiceTypeList;

	/**
	 * 操作人信息
	 */
	@ApiField("operator")
	private People operator;

	/**
	 * 付款账户
	 */
	@ApiListField("payment_account_list")
	@ApiField("string")
	private List<String> paymentAccountList;

	/**
	 * 我方公司信息
	 */
	@ApiListField("risk_partner_a_list")
	@ApiField("risk_partner_d_t_o")
	private List<RiskPartnerDTO> riskPartnerAList;

	/**
	 * 相对方公司
	 */
	@ApiListField("risk_partner_b_list")
	@ApiField("risk_partner_d_t_o")
	private List<RiskPartnerDTO> riskPartnerBList;

	/**
	 * 需要扫描的风险类型列表
	 */
	@ApiListField("risk_types")
	@ApiField("string")
	private List<String> riskTypes;

	/**
	 * 当前系统的名称
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public Attach getAttach() {
		return this.attach;
	}
	public void setAttach(Attach attach) {
		this.attach = attach;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessLine() {
		return this.businessLine;
	}
	public void setBusinessLine(String businessLine) {
		this.businessLine = businessLine;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public List<String> getInvoiceTypeList() {
		return this.invoiceTypeList;
	}
	public void setInvoiceTypeList(List<String> invoiceTypeList) {
		this.invoiceTypeList = invoiceTypeList;
	}

	public People getOperator() {
		return this.operator;
	}
	public void setOperator(People operator) {
		this.operator = operator;
	}

	public List<String> getPaymentAccountList() {
		return this.paymentAccountList;
	}
	public void setPaymentAccountList(List<String> paymentAccountList) {
		this.paymentAccountList = paymentAccountList;
	}

	public List<RiskPartnerDTO> getRiskPartnerAList() {
		return this.riskPartnerAList;
	}
	public void setRiskPartnerAList(List<RiskPartnerDTO> riskPartnerAList) {
		this.riskPartnerAList = riskPartnerAList;
	}

	public List<RiskPartnerDTO> getRiskPartnerBList() {
		return this.riskPartnerBList;
	}
	public void setRiskPartnerBList(List<RiskPartnerDTO> riskPartnerBList) {
		this.riskPartnerBList = riskPartnerBList;
	}

	public List<String> getRiskTypes() {
		return this.riskTypes;
	}
	public void setRiskTypes(List<String> riskTypes) {
		this.riskTypes = riskTypes;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
