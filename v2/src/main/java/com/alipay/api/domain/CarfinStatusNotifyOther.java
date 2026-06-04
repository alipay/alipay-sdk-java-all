package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单状态变更通知其他信息
 *
 * @author auto create
 * @since 1.0, 2026-05-15 17:15:30
 */
public class CarfinStatusNotifyOther extends AlipayObject {

	private static final long serialVersionUID = 7698531613498754665L;

	/**
	 * 是否事故车
	 */
	@ApiField("accident_vehicle_flag")
	private Boolean accidentVehicleFlag;

	/**
	 * 终审未提报原因码值
	 */
	@ApiField("approve_not_submit_code")
	private String approveNotSubmitCode;

	/**
	 * 终审未提交原因描述
	 */
	@ApiField("approve_not_submit_msg")
	private String approveNotSubmitMsg;

	/**
	 * 客户等级
	 */
	@ApiField("customer_credit_rating")
	private String customerCreditRating;

	/**
	 * 融担机构信息列表
	 */
	@ApiListField("guarantee_org_list")
	@ApiField("carfin_guarantee_inst")
	private List<CarfinGuaranteeInst> guaranteeOrgList;

	/**
	 * 是否安装GPS
	 */
	@ApiField("needs_gps_installation")
	private Boolean needsGpsInstallation;

	/**
	 * 机构车辆估值
	 */
	@ApiField("org_vehicle_valuation")
	private Long orgVehicleValuation;

	/**
	 * 购车方式
	 */
	@ApiField("pay_method")
	private String payMethod;

	public Boolean getAccidentVehicleFlag() {
		return this.accidentVehicleFlag;
	}
	public void setAccidentVehicleFlag(Boolean accidentVehicleFlag) {
		this.accidentVehicleFlag = accidentVehicleFlag;
	}

	public String getApproveNotSubmitCode() {
		return this.approveNotSubmitCode;
	}
	public void setApproveNotSubmitCode(String approveNotSubmitCode) {
		this.approveNotSubmitCode = approveNotSubmitCode;
	}

	public String getApproveNotSubmitMsg() {
		return this.approveNotSubmitMsg;
	}
	public void setApproveNotSubmitMsg(String approveNotSubmitMsg) {
		this.approveNotSubmitMsg = approveNotSubmitMsg;
	}

	public String getCustomerCreditRating() {
		return this.customerCreditRating;
	}
	public void setCustomerCreditRating(String customerCreditRating) {
		this.customerCreditRating = customerCreditRating;
	}

	public List<CarfinGuaranteeInst> getGuaranteeOrgList() {
		return this.guaranteeOrgList;
	}
	public void setGuaranteeOrgList(List<CarfinGuaranteeInst> guaranteeOrgList) {
		this.guaranteeOrgList = guaranteeOrgList;
	}

	public Boolean getNeedsGpsInstallation() {
		return this.needsGpsInstallation;
	}
	public void setNeedsGpsInstallation(Boolean needsGpsInstallation) {
		this.needsGpsInstallation = needsGpsInstallation;
	}

	public Long getOrgVehicleValuation() {
		return this.orgVehicleValuation;
	}
	public void setOrgVehicleValuation(Long orgVehicleValuation) {
		this.orgVehicleValuation = orgVehicleValuation;
	}

	public String getPayMethod() {
		return this.payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

}
