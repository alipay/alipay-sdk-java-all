package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建审批单
 *
 * @author auto create
 * @since 1.0, 2025-08-06 11:02:51
 */
public class AlipayCommerceEcApprovalCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6366464552479458873L;

	/**
	 * 申请结束时间
	 */
	@ApiField("apply_finish_time")
	private Date applyFinishTime;

	/**
	 * 申请单开始时间
	 */
	@ApiField("apply_start_time")
	private Date applyStartTime;

	/**
	 * 审批单类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 二级场景，详情见：
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 审批单关联制度列表，当企业出资方式为企业出资且设置此字段非空时，会查询最优制度并发放额度至该最优制度关联的员工
	 */
	@ApiListField("institution_id_list")
	@ApiField("string")
	private List<String> institutionIdList;

	/**
	 * 用于保存外部扩展信息内容，如差旅预估金额
	 */
	@ApiField("out_ext")
	private String outExt;

	/**
	 * 支付类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 外部平台审批单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	/**
	 * 事由
	 */
	@ApiField("purpose")
	private String purpose;

	/**
	 * 一级场景，详情见：
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 同行人信息列表
	 */
	@ApiListField("traveler_list")
	@ApiField("approval_traveler_d_t_o")
	private List<ApprovalTravelerDTO> travelerList;

	/**
	 * 行程信息列表

	 */
	@ApiListField("trip_info_list")
	@ApiField("approval_trip_d_t_o")
	private List<ApprovalTripDTO> tripInfoList;

	public Date getApplyFinishTime() {
		return this.applyFinishTime;
	}
	public void setApplyFinishTime(Date applyFinishTime) {
		this.applyFinishTime = applyFinishTime;
	}

	public Date getApplyStartTime() {
		return this.applyStartTime;
	}
	public void setApplyStartTime(Date applyStartTime) {
		this.applyStartTime = applyStartTime;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
	}

	public List<String> getInstitutionIdList() {
		return this.institutionIdList;
	}
	public void setInstitutionIdList(List<String> institutionIdList) {
		this.institutionIdList = institutionIdList;
	}

	public String getOutExt() {
		return this.outExt;
	}
	public void setOutExt(String outExt) {
		this.outExt = outExt;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPlatformApprovalId() {
		return this.platformApprovalId;
	}
	public void setPlatformApprovalId(String platformApprovalId) {
		this.platformApprovalId = platformApprovalId;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<ApprovalTravelerDTO> getTravelerList() {
		return this.travelerList;
	}
	public void setTravelerList(List<ApprovalTravelerDTO> travelerList) {
		this.travelerList = travelerList;
	}

	public List<ApprovalTripDTO> getTripInfoList() {
		return this.tripInfoList;
	}
	public void setTripInfoList(List<ApprovalTripDTO> tripInfoList) {
		this.tripInfoList = tripInfoList;
	}

}
