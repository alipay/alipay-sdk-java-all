package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * salesforce同步合同状态
 *
 * @author auto create
 * @since 1.0, 2026-09-09 14:17:53
 */
public class AnttechOceanbaseObglobalSfcontractstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1878497787129596476L;

	/**
	 * null
	 */
	@ApiListField("archive_files")
	@ApiField("archive_files")
	private List<ArchiveFiles> archiveFiles;

	/**
	 * 合同状态
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 合同标题
	 */
	@ApiField("contract_title")
	private String contractTitle;

	/**
	 * 合同查看地址
	 */
	@ApiField("contract_view_url")
	private String contractViewUrl;

	/**
	 * 合同金额，单位元
	 */
	@ApiField("customer_contract_fee")
	private String customerContractFee;

	/**
	 * 合同金额币种
	 */
	@ApiField("customer_contract_fee_currency_value")
	private String customerContractFeeCurrencyValue;

	/**
	 * 合同生效时间
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/**
	 * 创建甄零合同时传入的甄零合同/申请 ID
	 */
	@ApiField("external_contract_id")
	private String externalContractId;

	/**
	 * 合同归档时间
	 */
	@ApiField("filing_time")
	private String filingTime;

	/**
	 * OB 签约对方主体名称
	 */
	@ApiField("ob_sign_other_party_subject_name")
	private String obSignOtherPartySubjectName;

	/**
	 * 请求幂等 ID
	 */
	@ApiField("request_id")
	private String requestId;

	public List<ArchiveFiles> getArchiveFiles() {
		return this.archiveFiles;
	}
	public void setArchiveFiles(List<ArchiveFiles> archiveFiles) {
		this.archiveFiles = archiveFiles;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractTitle() {
		return this.contractTitle;
	}
	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public String getContractViewUrl() {
		return this.contractViewUrl;
	}
	public void setContractViewUrl(String contractViewUrl) {
		this.contractViewUrl = contractViewUrl;
	}

	public String getCustomerContractFee() {
		return this.customerContractFee;
	}
	public void setCustomerContractFee(String customerContractFee) {
		this.customerContractFee = customerContractFee;
	}

	public String getCustomerContractFeeCurrencyValue() {
		return this.customerContractFeeCurrencyValue;
	}
	public void setCustomerContractFeeCurrencyValue(String customerContractFeeCurrencyValue) {
		this.customerContractFeeCurrencyValue = customerContractFeeCurrencyValue;
	}

	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getExternalContractId() {
		return this.externalContractId;
	}
	public void setExternalContractId(String externalContractId) {
		this.externalContractId = externalContractId;
	}

	public String getFilingTime() {
		return this.filingTime;
	}
	public void setFilingTime(String filingTime) {
		this.filingTime = filingTime;
	}

	public String getObSignOtherPartySubjectName() {
		return this.obSignOtherPartySubjectName;
	}
	public void setObSignOtherPartySubjectName(String obSignOtherPartySubjectName) {
		this.obSignOtherPartySubjectName = obSignOtherPartySubjectName;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
