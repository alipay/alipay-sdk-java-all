package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用印申请（我方拆）
 *
 * @author auto create
 * @since 1.0, 2021-12-29 14:38:51
 */
public class AlipayFincoreComplianceSignListApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1785487745193761166L;

	/**
	 * 申请人信息
	 */
	@ApiField("applicant")
	private PeopleOpenApiDTO applicant;

	/**
	 * 审批信息
	 */
	@ApiField("approve_info")
	private SignApproveOpenApiDTO approveInfo;

	/**
	 * 签署附件列表，不参与用印，用于辅助用印的文件
	 */
	@ApiListField("attachments")
	@ApiField("sign_file_open_api_d_t_o")
	private List<SignFileOpenApiDTO> attachments;

	/**
	 * 业务单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 本次签署描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 生效时间
	 */
	@ApiField("effect_date")
	private Date effectDate;

	/**
	 * 生效方式
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 员工id
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 失效时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 终止方式
	 */
	@ApiField("end_type")
	private String endType;

	/**
	 * 是否测试，默认非测试
	 */
	@ApiField("is_test")
	private String isTest;

	/**
	 * 员工姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其他方签署分组
	 */
	@ApiListField("other_sign_groups")
	@ApiField("sign_party_group_open_api_d_t_o")
	private List<SignPartyGroupOpenApiDTO> otherSignGroups;

	/**
	 * 我方签署分组
	 */
	@ApiField("our_sign_group")
	private SignPartyGroupOpenApiDTO ourSignGroup;

	/**
	 * 纸质用印扩展请求，仅纸质用印需要
	 */
	@ApiField("paper_seal_ext_request")
	private PaperSealExtOpenApiRequest paperSealExtRequest;

	/**
	 * 用印顺序，默认只需我方用印
	 */
	@ApiField("seal_order")
	private String sealOrder;

	/**
	 * 签署文件
	 */
	@ApiListField("sign_files")
	@ApiField("sign_file_open_api_d_t_o")
	private List<SignFileOpenApiDTO> signFiles;

	/**
	 * 签署方式
	 */
	@ApiField("sign_method")
	private String signMethod;

	/**
	 * 系统来源id
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 文件标题
	 */
	@ApiField("title")
	private String title;

	public PeopleOpenApiDTO getApplicant() {
		return this.applicant;
	}
	public void setApplicant(PeopleOpenApiDTO applicant) {
		this.applicant = applicant;
	}

	public SignApproveOpenApiDTO getApproveInfo() {
		return this.approveInfo;
	}
	public void setApproveInfo(SignApproveOpenApiDTO approveInfo) {
		this.approveInfo = approveInfo;
	}

	public List<SignFileOpenApiDTO> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<SignFileOpenApiDTO> attachments) {
		this.attachments = attachments;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public String getEffectType() {
		return this.effectType;
	}
	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEndType() {
		return this.endType;
	}
	public void setEndType(String endType) {
		this.endType = endType;
	}

	public String getIsTest() {
		return this.isTest;
	}
	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<SignPartyGroupOpenApiDTO> getOtherSignGroups() {
		return this.otherSignGroups;
	}
	public void setOtherSignGroups(List<SignPartyGroupOpenApiDTO> otherSignGroups) {
		this.otherSignGroups = otherSignGroups;
	}

	public SignPartyGroupOpenApiDTO getOurSignGroup() {
		return this.ourSignGroup;
	}
	public void setOurSignGroup(SignPartyGroupOpenApiDTO ourSignGroup) {
		this.ourSignGroup = ourSignGroup;
	}

	public PaperSealExtOpenApiRequest getPaperSealExtRequest() {
		return this.paperSealExtRequest;
	}
	public void setPaperSealExtRequest(PaperSealExtOpenApiRequest paperSealExtRequest) {
		this.paperSealExtRequest = paperSealExtRequest;
	}

	public String getSealOrder() {
		return this.sealOrder;
	}
	public void setSealOrder(String sealOrder) {
		this.sealOrder = sealOrder;
	}

	public List<SignFileOpenApiDTO> getSignFiles() {
		return this.signFiles;
	}
	public void setSignFiles(List<SignFileOpenApiDTO> signFiles) {
		this.signFiles = signFiles;
	}

	public String getSignMethod() {
		return this.signMethod;
	}
	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
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

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
