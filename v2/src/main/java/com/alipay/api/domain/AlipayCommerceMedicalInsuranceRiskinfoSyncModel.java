package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益同步接口
 *
 * @author auto create
 * @since 1.0, 2026-10-26 13:57:58
 */
public class AlipayCommerceMedicalInsuranceRiskinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3841947819839888573L;

	/**
	 * 保司类型，非枚举类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * YYYY-MM-DD HH:MM:SS；通常为保单犹豫期到期时间。不能晚于最早的权益生效时间。
	 */
	@ApiField("equity_settle_start_time")
	private String equitySettleStartTime;

	/**
	 * 原权益流水号
	 */
	@ApiField("old_serial_no")
	private String oldSerialNo;

	/**
	 * 销售机构代码
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 家庭单特有
	 */
	@ApiField("parent_serial_no")
	private String parentSerialNo;

	/**
	 * 家庭单特有，非枚举类型
	 */
	@ApiField("parent_status")
	private String parentStatus;

	/**
	 * 支付时间（保单下单时间）
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 产品编号
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * null
	 */
	@ApiListField("project_list")
	@ApiField("project_info")
	private List<ProjectInfo> projectList;

	/**
	 * 销售方式，非枚举类型
	 */
	@ApiField("sales_method")
	private String salesMethod;

	/**
	 * 权益流水号	对应同一权益需保持唯一
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 权益状态，非枚举类型
	 */
	@ApiField("status")
	private String status;

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public String getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public String getEquitySettleStartTime() {
		return this.equitySettleStartTime;
	}
	public void setEquitySettleStartTime(String equitySettleStartTime) {
		this.equitySettleStartTime = equitySettleStartTime;
	}

	public String getOldSerialNo() {
		return this.oldSerialNo;
	}
	public void setOldSerialNo(String oldSerialNo) {
		this.oldSerialNo = oldSerialNo;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getParentSerialNo() {
		return this.parentSerialNo;
	}
	public void setParentSerialNo(String parentSerialNo) {
		this.parentSerialNo = parentSerialNo;
	}

	public String getParentStatus() {
		return this.parentStatus;
	}
	public void setParentStatus(String parentStatus) {
		this.parentStatus = parentStatus;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public List<ProjectInfo> getProjectList() {
		return this.projectList;
	}
	public void setProjectList(List<ProjectInfo> projectList) {
		this.projectList = projectList;
	}

	public String getSalesMethod() {
		return this.salesMethod;
	}
	public void setSalesMethod(String salesMethod) {
		this.salesMethod = salesMethod;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
