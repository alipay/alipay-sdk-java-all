package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas承载页dto
 *
 * @author auto create
 * @since 1.0, 2022-07-19 19:44:47
 */
public class PageInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8198592216158566971L;

	/**
	 * code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建人名字
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 当前版本
	 */
	@ApiField("current_version")
	private Long currentVersion;

	/**
	 * 编辑态版本
	 */
	@ApiField("edit_version")
	private Long editVersion;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * code创建时间
	 */
	@ApiField("gmt_create_code")
	private Date gmtCreateCode;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 数据库id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 修改人id
	 */
	@ApiField("modifier_id")
	private String modifierId;

	/**
	 * 修改人名字6
	 */
	@ApiField("modifier_name")
	private String modifierName;

	/**
	 * 页面名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 所属活动dto
	 */
	@ApiField("operation_task")
	private OperationTaskDTO operationTask;

	/**
	 * 所属活动id
	 */
	@ApiField("operation_task_id")
	private Long operationTaskId;

	/**
	 * 页面模版类型
	 */
	@ApiField("page_template_type")
	private String pageTemplateType;

	/**
	 * 佩奇状态
	 */
	@ApiField("peiqi_status")
	private String peiqiStatus;

	/**
	 * 海豚权益code
	 */
	@ApiField("promo_benefit_code")
	private String promoBenefitCode;

	/**
	 * 拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 页面渲染url
	 */
	@ApiField("render_url")
	private String renderUrl;

	/**
	 * 运行态版本
	 */
	@ApiField("run_version")
	private Long runVersion;

	/**
	 * status
	 */
	@ApiField("status")
	private String status;

	/**
	 * 所属模版code
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 页面填入参数
	 */
	@ApiField("template_params")
	private String templateParams;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public Long getCurrentVersion() {
		return this.currentVersion;
	}
	public void setCurrentVersion(Long currentVersion) {
		this.currentVersion = currentVersion;
	}

	public Long getEditVersion() {
		return this.editVersion;
	}
	public void setEditVersion(Long editVersion) {
		this.editVersion = editVersion;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtCreateCode() {
		return this.gmtCreateCode;
	}
	public void setGmtCreateCode(Date gmtCreateCode) {
		this.gmtCreateCode = gmtCreateCode;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getModifierId() {
		return this.modifierId;
	}
	public void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}

	public String getModifierName() {
		return this.modifierName;
	}
	public void setModifierName(String modifierName) {
		this.modifierName = modifierName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public OperationTaskDTO getOperationTask() {
		return this.operationTask;
	}
	public void setOperationTask(OperationTaskDTO operationTask) {
		this.operationTask = operationTask;
	}

	public Long getOperationTaskId() {
		return this.operationTaskId;
	}
	public void setOperationTaskId(Long operationTaskId) {
		this.operationTaskId = operationTaskId;
	}

	public String getPageTemplateType() {
		return this.pageTemplateType;
	}
	public void setPageTemplateType(String pageTemplateType) {
		this.pageTemplateType = pageTemplateType;
	}

	public String getPeiqiStatus() {
		return this.peiqiStatus;
	}
	public void setPeiqiStatus(String peiqiStatus) {
		this.peiqiStatus = peiqiStatus;
	}

	public String getPromoBenefitCode() {
		return this.promoBenefitCode;
	}
	public void setPromoBenefitCode(String promoBenefitCode) {
		this.promoBenefitCode = promoBenefitCode;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getRenderUrl() {
		return this.renderUrl;
	}
	public void setRenderUrl(String renderUrl) {
		this.renderUrl = renderUrl;
	}

	public Long getRunVersion() {
		return this.runVersion;
	}
	public void setRunVersion(Long runVersion) {
		this.runVersion = runVersion;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateParams() {
		return this.templateParams;
	}
	public void setTemplateParams(String templateParams) {
		this.templateParams = templateParams;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
