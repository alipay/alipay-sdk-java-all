package com.alipay.api.response;

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
 * @since 1.0, 2024-03-01 16:34:25
 */
public class AlipayCommerceEcApprovalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2237672816834122745L;

	/** 
	 * 审批结果，可选值：
APPLYING-申请中；VALID-已生效；CANCELLED-已取消；REJECTED-已驳回
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
	 * 外部平台审批单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	/** 
	 * 事由
	 */
	@ApiField("purpose")
	private String purpose;

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

}
