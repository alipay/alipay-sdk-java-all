package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付付款单查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:29:06
 */
public class ApSettleOrderQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 7893726345398776552L;

	/**
	 * 付款申请单ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 1
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 机构
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 结算Pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 起始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
