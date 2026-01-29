package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海图商机对象
 *
 * @author auto create
 * @since 1.0, 2025-06-18 15:26:02
 */
public class LeadsDTO extends AlipayObject {

	private static final long serialVersionUID = 5371956293627795534L;

	/**
	 * BD团队名称
	 */
	@ApiField("bd_dept_name")
	private String bdDeptName;

	/**
	 * BD姓名或花名
	 */
	@ApiField("bd_name")
	private String bdName;

	/**
	 * BD工号
	 */
	@ApiField("bd_work_no")
	private String bdWorkNo;

	/**
	 * 商机客户编码
	 */
	@ApiField("crm_customer_id")
	private String crmCustomerId;

	/**
	 * 商机客户名称
	 */
	@ApiField("crm_customer_name")
	private String crmCustomerName;

	/**
	 * 商机部署方式CODE
	 */
	@ApiField("deploy_type")
	private String deployType;

	/**
	 * 部署类型枚举值
	 */
	@ApiField("deploy_type_str")
	private String deployTypeStr;

	/**
	 * 海图商机创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 海图商机修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 海图商机自增ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 海图商机编码
	 */
	@ApiField("lead_id")
	private String leadId;

	/**
	 * 商机SA姓名或花名
	 */
	@ApiField("ob_sa_name")
	private String obSaName;

	/**
	 * 商机SA工号
	 */
	@ApiField("ob_sa_work_no")
	private String obSaWorkNo;

	/**
	 * 商机或项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 商机阶段CODE
	 */
	@ApiField("project_phase")
	private String projectPhase;

	/**
	 * 商机阶段枚举值
	 */
	@ApiField("project_phase_name")
	private String projectPhaseName;

	/**
	 * 商机签约概率
	 */
	@ApiField("sign_probability")
	private String signProbability;

	/**
	 * 商机签约概率枚举值
	 */
	@ApiField("sign_probability_str")
	private String signProbabilityStr;

	public String getBdDeptName() {
		return this.bdDeptName;
	}
	public void setBdDeptName(String bdDeptName) {
		this.bdDeptName = bdDeptName;
	}

	public String getBdName() {
		return this.bdName;
	}
	public void setBdName(String bdName) {
		this.bdName = bdName;
	}

	public String getBdWorkNo() {
		return this.bdWorkNo;
	}
	public void setBdWorkNo(String bdWorkNo) {
		this.bdWorkNo = bdWorkNo;
	}

	public String getCrmCustomerId() {
		return this.crmCustomerId;
	}
	public void setCrmCustomerId(String crmCustomerId) {
		this.crmCustomerId = crmCustomerId;
	}

	public String getCrmCustomerName() {
		return this.crmCustomerName;
	}
	public void setCrmCustomerName(String crmCustomerName) {
		this.crmCustomerName = crmCustomerName;
	}

	public String getDeployType() {
		return this.deployType;
	}
	public void setDeployType(String deployType) {
		this.deployType = deployType;
	}

	public String getDeployTypeStr() {
		return this.deployTypeStr;
	}
	public void setDeployTypeStr(String deployTypeStr) {
		this.deployTypeStr = deployTypeStr;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
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

	public String getLeadId() {
		return this.leadId;
	}
	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public String getObSaName() {
		return this.obSaName;
	}
	public void setObSaName(String obSaName) {
		this.obSaName = obSaName;
	}

	public String getObSaWorkNo() {
		return this.obSaWorkNo;
	}
	public void setObSaWorkNo(String obSaWorkNo) {
		this.obSaWorkNo = obSaWorkNo;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectPhase() {
		return this.projectPhase;
	}
	public void setProjectPhase(String projectPhase) {
		this.projectPhase = projectPhase;
	}

	public String getProjectPhaseName() {
		return this.projectPhaseName;
	}
	public void setProjectPhaseName(String projectPhaseName) {
		this.projectPhaseName = projectPhaseName;
	}

	public String getSignProbability() {
		return this.signProbability;
	}
	public void setSignProbability(String signProbability) {
		this.signProbability = signProbability;
	}

	public String getSignProbabilityStr() {
		return this.signProbabilityStr;
	}
	public void setSignProbabilityStr(String signProbabilityStr) {
		this.signProbabilityStr = signProbabilityStr;
	}

}
