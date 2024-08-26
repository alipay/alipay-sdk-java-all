package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付账单费用信息
 *
 * @author auto create
 * @since 1.0, 2024-08-16 10:24:47
 */
public class BillFeeInfo extends AlipayObject {

	private static final long serialVersionUID = 6239642847996436315L;

	/**
	 * 抽佣金额，单位：分
	 */
	@ApiField("commission_cash")
	private Long commissionCash;

	/**
	 * 抽佣pid
	 */
	@ApiField("commission_pid")
	private String commissionPid;

	/**
	 * 收费方名称
	 */
	@ApiField("commission_pid_name")
	private String commissionPidName;

	/**
	 * 退佣金额，单位：分
	 */
	@ApiField("commission_refund_cash")
	private Long commissionRefundCash;

	/**
	 * 退佣时间
	 */
	@ApiField("commission_refund_time")
	private String commissionRefundTime;

	/**
	 * 抽佣日期
	 */
	@ApiField("commission_time")
	private String commissionTime;

	/**
	 * 抽佣类型
	 */
	@ApiField("commission_type")
	private String commissionType;

	public Long getCommissionCash() {
		return this.commissionCash;
	}
	public void setCommissionCash(Long commissionCash) {
		this.commissionCash = commissionCash;
	}

	public String getCommissionPid() {
		return this.commissionPid;
	}
	public void setCommissionPid(String commissionPid) {
		this.commissionPid = commissionPid;
	}

	public String getCommissionPidName() {
		return this.commissionPidName;
	}
	public void setCommissionPidName(String commissionPidName) {
		this.commissionPidName = commissionPidName;
	}

	public Long getCommissionRefundCash() {
		return this.commissionRefundCash;
	}
	public void setCommissionRefundCash(Long commissionRefundCash) {
		this.commissionRefundCash = commissionRefundCash;
	}

	public String getCommissionRefundTime() {
		return this.commissionRefundTime;
	}
	public void setCommissionRefundTime(String commissionRefundTime) {
		this.commissionRefundTime = commissionRefundTime;
	}

	public String getCommissionTime() {
		return this.commissionTime;
	}
	public void setCommissionTime(String commissionTime) {
		this.commissionTime = commissionTime;
	}

	public String getCommissionType() {
		return this.commissionType;
	}
	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

}
