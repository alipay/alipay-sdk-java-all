package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApprovalTravelerDTO;
import com.alipay.api.domain.ApprovalTripDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 11:12:41
 */
public class AlipayCommerceEcApprovalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4396468772423867473L;

	/** 
	 * 申请单的结束时间
	 */
	@ApiField("apply_finish_time")
	private Date applyFinishTime;

	/** 
	 * 申请单的开始时间
	 */
	@ApiField("apply_start_time")
	private Date applyStartTime;

	/** 
	 * 申请单状态，对应申请单修改接口的：approval_status字段
	 */
	@ApiField("approval_result")
	private String approvalResult;

	/** 
	 * 同行人信息列表
	 */
	@ApiListField("approval_traveler_dto_list")
	@ApiField("approval_traveler_d_t_o")
	private List<ApprovalTravelerDTO> approvalTravelerDtoList;

	/** 
	 * 行程信息列表
	 */
	@ApiListField("approval_trip_dto_list")
	@ApiField("approval_trip_d_t_o")
	private List<ApprovalTripDTO> approvalTripDtoList;

	/** 
	 * 申请单类型
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
	 * 申请单相关的扩展信息，如花呗券ID和金额等
	 */
	@ApiField("ex_json")
	private String exJson;

	/** 
	 * 二级场景，更多枚举请见：
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

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
	 * 外部平台申请单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	/** 
	 * 事由
	 */
	@ApiField("purpose")
	private String purpose;

	/** 
	 * 一级场景，更多枚举请见：
	 */
	@ApiField("scene")
	private String scene;

	public void setApplyFinishTime(Date applyFinishTime) {
		this.applyFinishTime = applyFinishTime;
	}
	public Date getApplyFinishTime( ) {
		return this.applyFinishTime;
	}

	public void setApplyStartTime(Date applyStartTime) {
		this.applyStartTime = applyStartTime;
	}
	public Date getApplyStartTime( ) {
		return this.applyStartTime;
	}

	public void setApprovalResult(String approvalResult) {
		this.approvalResult = approvalResult;
	}
	public String getApprovalResult( ) {
		return this.approvalResult;
	}

	public void setApprovalTravelerDtoList(List<ApprovalTravelerDTO> approvalTravelerDtoList) {
		this.approvalTravelerDtoList = approvalTravelerDtoList;
	}
	public List<ApprovalTravelerDTO> getApprovalTravelerDtoList( ) {
		return this.approvalTravelerDtoList;
	}

	public void setApprovalTripDtoList(List<ApprovalTripDTO> approvalTripDtoList) {
		this.approvalTripDtoList = approvalTripDtoList;
	}
	public List<ApprovalTripDTO> getApprovalTripDtoList( ) {
		return this.approvalTripDtoList;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory( ) {
		return this.category;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId( ) {
		return this.employeeId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setExJson(String exJson) {
		this.exJson = exJson;
	}
	public String getExJson( ) {
		return this.exJson;
	}

	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
	}
	public String getExpenseTypeSubCategory( ) {
		return this.expenseTypeSubCategory;
	}

	public void setOutExt(String outExt) {
		this.outExt = outExt;
	}
	public String getOutExt( ) {
		return this.outExt;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentType( ) {
		return this.paymentType;
	}

	public void setPlatformApprovalId(String platformApprovalId) {
		this.platformApprovalId = platformApprovalId;
	}
	public String getPlatformApprovalId( ) {
		return this.platformApprovalId;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getPurpose( ) {
		return this.purpose;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	public String getScene( ) {
		return this.scene;
	}

}
