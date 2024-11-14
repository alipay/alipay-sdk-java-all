package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 半份签发起人工审核
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:29
 */
public class AlipayBossAntlescenterPartcontractreviewApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2629591175696274285L;

	/**
	 * 审核页面地址
	 */
	@ApiField("audit_url")
	private String auditUrl;

	/**
	 * 人工审核时，指定的审核人工号； 加签时指定的加签人工号
	 */
	@ApiField("audit_work_no")
	private String auditWorkNo;

	/**
	 * 验证公司名称list
	 */
	@ApiListField("company_list")
	@ApiField("string")
	private List<String> companyList;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 上传文件合同
	 */
	@ApiField("other_contract_file_addr")
	private AntlescenterFileDTO otherContractFileAddr;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getAuditUrl() {
		return this.auditUrl;
	}
	public void setAuditUrl(String auditUrl) {
		this.auditUrl = auditUrl;
	}

	public String getAuditWorkNo() {
		return this.auditWorkNo;
	}
	public void setAuditWorkNo(String auditWorkNo) {
		this.auditWorkNo = auditWorkNo;
	}

	public List<String> getCompanyList() {
		return this.companyList;
	}
	public void setCompanyList(List<String> companyList) {
		this.companyList = companyList;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public AntlescenterFileDTO getOtherContractFileAddr() {
		return this.otherContractFileAddr;
	}
	public void setOtherContractFileAddr(AntlescenterFileDTO otherContractFileAddr) {
		this.otherContractFileAddr = otherContractFileAddr;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
