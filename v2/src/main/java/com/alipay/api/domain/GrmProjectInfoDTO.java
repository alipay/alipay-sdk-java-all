package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业管平台立项信息DTO
 *
 * @author auto create
 * @since 1.0, 2021-10-14 10:49:26
 */
public class GrmProjectInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4797456937279283946L;

	/**
	 * 附件地址
	 */
	@ApiListField("attachments_url")
	@ApiField("string")
	private List<String> attachmentsUrl;

	/**
	 * 延续项目编号
	 */
	@ApiField("continue_project_code")
	private String continueProjectCode;

	/**
	 * 创建人工号
	 */
	@ApiField("create")
	private String create;

	/**
	 * 创建人名称
	 */
	@ApiField("create_name")
	private String createName;

	/**
	 * 产品交付物及验收标准
	 */
	@ApiListField("critical_deliverable")
	@ApiField("deliverable")
	private List<Deliverable> criticalDeliverable;

	/**
	 * 项目描述目的及价值
	 */
	@ApiField("description")
	private String description;

	/**
	 * 项目结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 业务方代表工号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 业务方代表名称
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 项目经理工号
	 */
	@ApiField("pm")
	private String pm;

	/**
	 * 项目经理名称
	 */
	@ApiField("pm_name")
	private String pmName;

	/**
	 * PR提交人工号
	 */
	@ApiField("pr_emp_id")
	private String prEmpId;

	/**
	 * pr提交人姓名
	 */
	@ApiField("pr_emp_name")
	private String prEmpName;

	/**
	 * 业管平台立项编码
	 */
	@ApiField("project_code")
	private String projectCode;

	/**
	 * 立项项目详情URL
	 */
	@ApiField("project_detail_url")
	private String projectDetailUrl;

	/**
	 * 业管平台立项名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 项目结算类型
	 */
	@ApiField("project_pay")
	private String projectPay;

	/**
	 * 项目时间表
	 */
	@ApiListField("project_time_sheet")
	@ApiField("project_time_table")
	private List<ProjectTimeTable> projectTimeSheet;

	/**
	 * 业管平台立项类型大类
	 */
	@ApiField("project_type")
	private String projectType;

	/**
	 * 工作量
	 */
	@ApiListField("project_workload")
	@ApiField("workload")
	private List<Workload> projectWorkload;

	/**
	 * 服务地点
	 */
	@ApiField("service_location")
	private String serviceLocation;

	/**
	 * 结算公式编码
	 */
	@ApiField("settlement_formula_code")
	private String settlementFormulaCode;

	/**
	 * 结算公式名称
	 */
	@ApiField("settlement_formula_name")
	private String settlementFormulaName;

	/**
	 * sla详情地址
	 */
	@ApiField("sla_view_info")
	private String slaViewInfo;

	/**
	 * 项目开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 立项金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 采购用途code
	 */
	@ApiField("usage_code")
	private String usageCode;

	public List<String> getAttachmentsUrl() {
		return this.attachmentsUrl;
	}
	public void setAttachmentsUrl(List<String> attachmentsUrl) {
		this.attachmentsUrl = attachmentsUrl;
	}

	public String getContinueProjectCode() {
		return this.continueProjectCode;
	}
	public void setContinueProjectCode(String continueProjectCode) {
		this.continueProjectCode = continueProjectCode;
	}

	public String getCreate() {
		return this.create;
	}
	public void setCreate(String create) {
		this.create = create;
	}

	public String getCreateName() {
		return this.createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public List<Deliverable> getCriticalDeliverable() {
		return this.criticalDeliverable;
	}
	public void setCriticalDeliverable(List<Deliverable> criticalDeliverable) {
		this.criticalDeliverable = criticalDeliverable;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPm() {
		return this.pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}

	public String getPmName() {
		return this.pmName;
	}
	public void setPmName(String pmName) {
		this.pmName = pmName;
	}

	public String getPrEmpId() {
		return this.prEmpId;
	}
	public void setPrEmpId(String prEmpId) {
		this.prEmpId = prEmpId;
	}

	public String getPrEmpName() {
		return this.prEmpName;
	}
	public void setPrEmpName(String prEmpName) {
		this.prEmpName = prEmpName;
	}

	public String getProjectCode() {
		return this.projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectDetailUrl() {
		return this.projectDetailUrl;
	}
	public void setProjectDetailUrl(String projectDetailUrl) {
		this.projectDetailUrl = projectDetailUrl;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectPay() {
		return this.projectPay;
	}
	public void setProjectPay(String projectPay) {
		this.projectPay = projectPay;
	}

	public List<ProjectTimeTable> getProjectTimeSheet() {
		return this.projectTimeSheet;
	}
	public void setProjectTimeSheet(List<ProjectTimeTable> projectTimeSheet) {
		this.projectTimeSheet = projectTimeSheet;
	}

	public String getProjectType() {
		return this.projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public List<Workload> getProjectWorkload() {
		return this.projectWorkload;
	}
	public void setProjectWorkload(List<Workload> projectWorkload) {
		this.projectWorkload = projectWorkload;
	}

	public String getServiceLocation() {
		return this.serviceLocation;
	}
	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}

	public String getSettlementFormulaCode() {
		return this.settlementFormulaCode;
	}
	public void setSettlementFormulaCode(String settlementFormulaCode) {
		this.settlementFormulaCode = settlementFormulaCode;
	}

	public String getSettlementFormulaName() {
		return this.settlementFormulaName;
	}
	public void setSettlementFormulaName(String settlementFormulaName) {
		this.settlementFormulaName = settlementFormulaName;
	}

	public String getSlaViewInfo() {
		return this.slaViewInfo;
	}
	public void setSlaViewInfo(String slaViewInfo) {
		this.slaViewInfo = slaViewInfo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUsageCode() {
		return this.usageCode;
	}
	public void setUsageCode(String usageCode) {
		this.usageCode = usageCode;
	}

}
