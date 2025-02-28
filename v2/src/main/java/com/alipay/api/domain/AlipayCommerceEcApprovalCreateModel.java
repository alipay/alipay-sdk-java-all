package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建审批单
 *
 * @author auto create
 * @since 1.0, 2024-06-04 13:45:11
 */
public class AlipayCommerceEcApprovalCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1347395854387649244L;

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
	 * 审批单关联制度列表，当企业出资方式为企业出资且设置此字段非空时，会查询最优制度并发放额度至该最优制度关联的员工
	 */
	@ApiListField("institution_id_list")
	@ApiField("string")
	private List<String> institutionIdList;

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

	public List<String> getInstitutionIdList() {
		return this.institutionIdList;
	}
	public void setInstitutionIdList(List<String> institutionIdList) {
		this.institutionIdList = institutionIdList;
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
