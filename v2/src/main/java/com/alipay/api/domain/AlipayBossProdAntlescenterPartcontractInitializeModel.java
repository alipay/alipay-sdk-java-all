package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 半份签初始化合同
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:29
 */
public class AlipayBossProdAntlescenterPartcontractInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4268829358785862269L;

	/**
	 * 系统来源
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 申请人姓名
	 */
	@ApiField("applicant")
	private String applicant;

	/**
	 * 申请人部门
	 */
	@ApiField("applicant_sector")
	private String applicantSector;

	/**
	 * 申请时间
	 */
	@ApiField("application_time")
	private Date applicationTime;

	/**
	 * 申请类型
	 */
	@ApiField("application_type")
	private String applicationType;

	/**
	 * 归档编号
	 */
	@ApiField("archive_no")
	private String archiveNo;

	/**
	 * 归档时间
	 */
	@ApiField("archive_time")
	private Date archiveTime;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合同标签
	 */
	@ApiField("contract_tag")
	private String contractTag;

	/**
	 * 生效结束时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 生效开始时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 期望完成时间
	 */
	@ApiField("expect_time")
	private Date expectTime;

	/**
	 * 文件编号
	 */
	@ApiField("file_no")
	private String fileNo;

	/**
	 * 操作人花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 操作时间
	 */
	@ApiField("operator_time")
	private Date operatorTime;

	/**
	 * 操作类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 原始合同附件，未用印
	 */
	@ApiListField("ori_attachment_file_addr")
	@ApiField("antlescenter_file_d_t_o")
	private List<AntlescenterFileDTO> oriAttachmentFileAddr;

	/**
	 * 原始合同文件，未用印
	 */
	@ApiListField("ori_contract_file_addr")
	@ApiField("antlescenter_file_d_t_o")
	private List<AntlescenterFileDTO> oriContractFileAddr;

	/**
	 * 他方公司名称
	 */
	@ApiField("other_company")
	private String otherCompany;

	/**
	 * 我方公司名称
	 */
	@ApiField("our_company")
	private String ourCompany;

	/**
	 * 流程详细信息
	 */
	@ApiField("process_d_t_o")
	private AntlescenterProcessDTO processDTO;

	/**
	 * 审批所在业务系统
	 */
	@ApiField("process_source")
	private String processSource;

	/**
	 * 操作人真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用印顺序
	 */
	@ApiField("seal_order")
	private String sealOrder;

	/**
	 * 用印方式
	 */
	@ApiField("seal_type")
	private String sealType;

	/**
	 * 签署方式类型
	 */
	@ApiField("sign_task_type")
	private String signTaskType;

	/**
	 * 源系统id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 业务系统工单号
	 */
	@ApiField("source_no")
	private String sourceNo;

	/**
	 * 源系统url
	 */
	@ApiField("source_url")
	private String sourceUrl;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 操作人工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getApplicant() {
		return this.applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getApplicantSector() {
		return this.applicantSector;
	}
	public void setApplicantSector(String applicantSector) {
		this.applicantSector = applicantSector;
	}

	public Date getApplicationTime() {
		return this.applicationTime;
	}
	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getApplicationType() {
		return this.applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getArchiveNo() {
		return this.archiveNo;
	}
	public void setArchiveNo(String archiveNo) {
		this.archiveNo = archiveNo;
	}

	public Date getArchiveTime() {
		return this.archiveTime;
	}
	public void setArchiveTime(Date archiveTime) {
		this.archiveTime = archiveTime;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractTag() {
		return this.contractTag;
	}
	public void setContractTag(String contractTag) {
		this.contractTag = contractTag;
	}

	public Date getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public Date getExpectTime() {
		return this.expectTime;
	}
	public void setExpectTime(Date expectTime) {
		this.expectTime = expectTime;
	}

	public String getFileNo() {
		return this.fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getOperatorTime() {
		return this.operatorTime;
	}
	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public List<AntlescenterFileDTO> getOriAttachmentFileAddr() {
		return this.oriAttachmentFileAddr;
	}
	public void setOriAttachmentFileAddr(List<AntlescenterFileDTO> oriAttachmentFileAddr) {
		this.oriAttachmentFileAddr = oriAttachmentFileAddr;
	}

	public List<AntlescenterFileDTO> getOriContractFileAddr() {
		return this.oriContractFileAddr;
	}
	public void setOriContractFileAddr(List<AntlescenterFileDTO> oriContractFileAddr) {
		this.oriContractFileAddr = oriContractFileAddr;
	}

	public String getOtherCompany() {
		return this.otherCompany;
	}
	public void setOtherCompany(String otherCompany) {
		this.otherCompany = otherCompany;
	}

	public String getOurCompany() {
		return this.ourCompany;
	}
	public void setOurCompany(String ourCompany) {
		this.ourCompany = ourCompany;
	}

	public AntlescenterProcessDTO getProcessDTO() {
		return this.processDTO;
	}
	public void setProcessDTO(AntlescenterProcessDTO processDTO) {
		this.processDTO = processDTO;
	}

	public String getProcessSource() {
		return this.processSource;
	}
	public void setProcessSource(String processSource) {
		this.processSource = processSource;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSealOrder() {
		return this.sealOrder;
	}
	public void setSealOrder(String sealOrder) {
		this.sealOrder = sealOrder;
	}

	public String getSealType() {
		return this.sealType;
	}
	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public String getSignTaskType() {
		return this.signTaskType;
	}
	public void setSignTaskType(String signTaskType) {
		this.signTaskType = signTaskType;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceNo() {
		return this.sourceNo;
	}
	public void setSourceNo(String sourceNo) {
		this.sourceNo = sourceNo;
	}

	public String getSourceUrl() {
		return this.sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
