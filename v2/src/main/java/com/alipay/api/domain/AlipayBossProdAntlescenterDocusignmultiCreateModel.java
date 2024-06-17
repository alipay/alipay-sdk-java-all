package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发起docusign多方签署
 *
 * @author auto create
 * @since 1.0, 2024-02-27 15:03:31
 */
public class AlipayBossProdAntlescenterDocusignmultiCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5593465459653952758L;

	/**
	 * 申请人工号
	 */
	@ApiField("applicant")
	private String applicant;

	/**
	 * 申请人真实姓名
	 */
	@ApiField("applicant_real_name")
	private String applicantRealName;

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
	@ApiField("approval_flow_info")
	private List<ApprovalFlowInfo> approvalFlowInfoList;

	/**
	 * 签约附件列表，list中为文件id，具有唯一性
	 */
	@ApiListField("attachement_file_list")
	@ApiField("create_e_sign_task_file_v_o")
	private List<CreateESignTaskFileVO> attachementFileList;

	/**
	 * 业务线编码
	 */
	@ApiField("business_line_code")
	private String businessLineCode;

	/**
	 * 合同id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同基本信息
	 */
	@ApiField("contract_information")
	private ContractInformation contractInformation;

	/**
	 * contractVersion (全数字组成)
	 */
	@ApiField("contract_version")
	private String contractVersion;

	/**
	 * 合同描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 签署中心：签署受理唯一流水号
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 鉴权字符串
	 */
	@ApiField("hash_value")
	private String hashValue;

	/**
	 * 是否测试
	 */
	@ApiField("is_test")
	private String isTest;

	/**
	 * 签署组件信息
	 */
	@ApiListField("multi_signer_and_tab_vos_dto_list")
	@ApiField("multi_signer_and_tab_vos_d_t_o")
	private List<MultiSignerAndTabVosDTO> multiSignerAndTabVosDtoList;

	/**
	 * 区域机房码，电子签约中心不消费，透传
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

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
	 * 租户信息
	 */
	@ApiField("tenant")
	private String tenant;

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

	public String getApplicantRealName() {
		return this.applicantRealName;
	}
	public void setApplicantRealName(String applicantRealName) {
		this.applicantRealName = applicantRealName;
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

	public List<ApprovalFlowInfo> getApprovalFlowInfoList() {
		return this.approvalFlowInfoList;
	}
	public void setApprovalFlowInfoList(List<ApprovalFlowInfo> approvalFlowInfoList) {
		this.approvalFlowInfoList = approvalFlowInfoList;
	}

	public List<CreateESignTaskFileVO> getAttachementFileList() {
		return this.attachementFileList;
	}
	public void setAttachementFileList(List<CreateESignTaskFileVO> attachementFileList) {
		this.attachementFileList = attachementFileList;
	}

	public String getBusinessLineCode() {
		return this.businessLineCode;
	}
	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public ContractInformation getContractInformation() {
		return this.contractInformation;
	}
	public void setContractInformation(ContractInformation contractInformation) {
		this.contractInformation = contractInformation;
	}

	public String getContractVersion() {
		return this.contractVersion;
	}
	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getHashValue() {
		return this.hashValue;
	}
	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}

	public String getIsTest() {
		return this.isTest;
	}
	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}

	public List<MultiSignerAndTabVosDTO> getMultiSignerAndTabVosDtoList() {
		return this.multiSignerAndTabVosDtoList;
	}
	public void setMultiSignerAndTabVosDtoList(List<MultiSignerAndTabVosDTO> multiSignerAndTabVosDtoList) {
		this.multiSignerAndTabVosDtoList = multiSignerAndTabVosDtoList;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
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

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
