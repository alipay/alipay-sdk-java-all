package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跟进状态变更通知
 *
 * @author auto create
 * @since 1.0, 2025-05-20 17:26:08
 */
public class XingheLendassistCarfinFollowupstatuschangeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7395297417221775361L;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 用户当前阻塞状态
	 */
	@ApiField("blocking_status")
	private String blockingStatus;

	/**
	 * 客服（坐席）信息
	 */
	@ApiField("customer_service_info")
	private CustomerServiceInfo customerServiceInfo;

	/**
	 * 跟进结论列表
	 */
	@ApiListField("followup_res_list")
	@ApiField("string")
	private List<String> followupResList;

	/**
	 * 跟进状态
	 */
	@ApiField("followup_status")
	private String followupStatus;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 申请单当前状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 车辆抵押到期日期
（followup_res_list中包含V_MORTGAGED_VEHICLE时传输）
	 */
	@ApiField("vehicle_mortgage_expiry_date")
	private Date vehicleMortgageExpiryDate;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBlockingStatus() {
		return this.blockingStatus;
	}
	public void setBlockingStatus(String blockingStatus) {
		this.blockingStatus = blockingStatus;
	}

	public CustomerServiceInfo getCustomerServiceInfo() {
		return this.customerServiceInfo;
	}
	public void setCustomerServiceInfo(CustomerServiceInfo customerServiceInfo) {
		this.customerServiceInfo = customerServiceInfo;
	}

	public List<String> getFollowupResList() {
		return this.followupResList;
	}
	public void setFollowupResList(List<String> followupResList) {
		this.followupResList = followupResList;
	}

	public String getFollowupStatus() {
		return this.followupStatus;
	}
	public void setFollowupStatus(String followupStatus) {
		this.followupStatus = followupStatus;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getVehicleMortgageExpiryDate() {
		return this.vehicleMortgageExpiryDate;
	}
	public void setVehicleMortgageExpiryDate(Date vehicleMortgageExpiryDate) {
		this.vehicleMortgageExpiryDate = vehicleMortgageExpiryDate;
	}

}
