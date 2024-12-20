package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通用渠道红包活动信息
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:04:20
 */
public class DtBankVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6895934239262856524L;

	/**
	 * 发放限制信息
	 */
	@ApiField("activity_send_control_config_info")
	private DtbankActivitySendControlConfigInfo activitySendControlConfigInfo;

	/**
	 * 是否允许拆分使用
定额红包时：
true: 可以拆分使用
false：不可以拆分使用
为null时：历史活动，不可以拆分使用
非立减：空字段
	 */
	@ApiField("allow_voucher_split")
	private Boolean allowVoucherSplit;

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

	/**
	 * 消费门槛
字段取值：
有门槛，门槛金额XX元  or  零门槛
	 */
	@ApiField("threshold_text")
	private String thresholdText;

	public DtbankActivitySendControlConfigInfo getActivitySendControlConfigInfo() {
		return this.activitySendControlConfigInfo;
	}
	public void setActivitySendControlConfigInfo(DtbankActivitySendControlConfigInfo activitySendControlConfigInfo) {
		this.activitySendControlConfigInfo = activitySendControlConfigInfo;
	}

	public Boolean getAllowVoucherSplit() {
		return this.allowVoucherSplit;
	}
	public void setAllowVoucherSplit(Boolean allowVoucherSplit) {
		this.allowVoucherSplit = allowVoucherSplit;
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

	public String getThresholdText() {
		return this.thresholdText;
	}
	public void setThresholdText(String thresholdText) {
		this.thresholdText = thresholdText;
	}

}
