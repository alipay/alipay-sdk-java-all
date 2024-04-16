package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 首绑有礼活动信息
 *
 * @author auto create
 * @since 1.0, 2024-03-28 14:05:48
 */
public class DtBankFirstBindCardGiftInfo extends AlipayObject {

	private static final long serialVersionUID = 6411119437219834185L;

	/**
	 * bank_code_config_acount_limit值为ASSIGNED_PID_LIST有值，表示银行码指定账号PID列表
	 */
	@ApiListField("assigned_pid_list")
	@ApiField("string")
	private List<String> assignedPidList;

	/**
	 * 银行码配置账号限制，bind_source_list包含BANK_QR_CODE时，此参数有值。
	 */
	@ApiField("bank_code_config_account_limit")
	private String bankCodeConfigAccountLimit;

	/**
	 * 绑卡来源
	 */
	@ApiListField("bind_source_list")
	@ApiField("string")
	private List<String> bindSourceList;

	/**
	 * 红包有效时间
	 */
	@ApiField("coupon_available_time")
	private DtBankCouponAvailableTime couponAvailableTime;

	/**
	 * 红包使用说明文案
	 */
	@ApiListField("coupon_instruction_list")
	@ApiField("string")
	private List<String> couponInstructionList;

	public List<String> getAssignedPidList() {
		return this.assignedPidList;
	}
	public void setAssignedPidList(List<String> assignedPidList) {
		this.assignedPidList = assignedPidList;
	}

	public String getBankCodeConfigAccountLimit() {
		return this.bankCodeConfigAccountLimit;
	}
	public void setBankCodeConfigAccountLimit(String bankCodeConfigAccountLimit) {
		this.bankCodeConfigAccountLimit = bankCodeConfigAccountLimit;
	}

	public List<String> getBindSourceList() {
		return this.bindSourceList;
	}
	public void setBindSourceList(List<String> bindSourceList) {
		this.bindSourceList = bindSourceList;
	}

	public DtBankCouponAvailableTime getCouponAvailableTime() {
		return this.couponAvailableTime;
	}
	public void setCouponAvailableTime(DtBankCouponAvailableTime couponAvailableTime) {
		this.couponAvailableTime = couponAvailableTime;
	}

	public List<String> getCouponInstructionList() {
		return this.couponInstructionList;
	}
	public void setCouponInstructionList(List<String> couponInstructionList) {
		this.couponInstructionList = couponInstructionList;
	}

}
