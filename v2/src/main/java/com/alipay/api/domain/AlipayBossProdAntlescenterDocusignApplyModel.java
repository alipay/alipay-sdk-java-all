package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建docusign签约流程
 *
 * @author auto create
 * @since 1.0, 2022-12-07 17:11:35
 */
public class AlipayBossProdAntlescenterDocusignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4227312361653356249L;

	/**
	 * 申请人
	 */
	@ApiField("applicant")
	private String applicant;

	/**
	 * 业务系统申请单号，业务幂等字段，必传
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 申请方系统标识
	 */
	@ApiField("application_system")
	private String applicationSystem;

	/**
	 * 申请日期
	 */
	@ApiField("application_time")
	private Date applicationTime;

	/**
	 * 审批流程信息
	 */
	@ApiListField("approval_flow_info_list")
	@ApiField("approval_flow_info_d_t_o")
	private List<ApprovalFlowInfoDTO> approvalFlowInfoList;

	/**
	 * 跳转至原系统页面查看参数 (全数字组成)
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同基本信息
	 */
	@ApiField("contract_information")
	private ContractInformationVo contractInformation;

	/**
	 * 合约版本(全数字组成)
	 */
	@ApiField("contract_version")
	private String contractVersion;

	/**
	 * 鉴权字符串，必传
	 */
	@ApiField("hash_value")
	private String hashValue;

	/**
	 * 跳转至原系统页面查看参数
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 区域机房码，电子签约中心不消费，透传
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 签约文件列表，list中为文件id，具有唯一性，必传且size>0
	 */
	@ApiListField("sign_file_list")
	@ApiField("create_e_sign_task_file_v_o")
	private List<CreateESignTaskFileVO> signFileList;

	/**
	 * 业务系统链接，方便从法务中台跳转
	 */
	@ApiField("source_sys_url")
	private String sourceSysUrl;

	/**
	 * IPAY租户，电子签约中心不消费，透传
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getApplicant() {
		return this.applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationSystem() {
		return this.applicationSystem;
	}
	public void setApplicationSystem(String applicationSystem) {
		this.applicationSystem = applicationSystem;
	}

	public Date getApplicationTime() {
		return this.applicationTime;
	}
	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}

	public List<ApprovalFlowInfoDTO> getApprovalFlowInfoList() {
		return this.approvalFlowInfoList;
	}
	public void setApprovalFlowInfoList(List<ApprovalFlowInfoDTO> approvalFlowInfoList) {
		this.approvalFlowInfoList = approvalFlowInfoList;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public ContractInformationVo getContractInformation() {
		return this.contractInformation;
	}
	public void setContractInformation(ContractInformationVo contractInformation) {
		this.contractInformation = contractInformation;
	}

	public String getContractVersion() {
		return this.contractVersion;
	}
	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}

	public String getHashValue() {
		return this.hashValue;
	}
	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public List<CreateESignTaskFileVO> getSignFileList() {
		return this.signFileList;
	}
	public void setSignFileList(List<CreateESignTaskFileVO> signFileList) {
		this.signFileList = signFileList;
	}

	public String getSourceSysUrl() {
		return this.sourceSysUrl;
	}
	public void setSourceSysUrl(String sourceSysUrl) {
		this.sourceSysUrl = sourceSysUrl;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
