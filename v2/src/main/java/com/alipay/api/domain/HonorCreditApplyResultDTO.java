package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信结果通知
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:15
 */
public class HonorCreditApplyResultDTO extends AlipayObject {

	private static final long serialVersionUID = 6366768639752256341L;

	/**
	 * 荣耀侧授信申请流水号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 授信结果，1-审核中，2-通过，3-拒绝
	 */
	@ApiField("apply_status")
	private Long applyStatus;

	/**
	 * 年利率, 示例: 23.4 【即23.4%】(授信通过时返回)
	 */
	@ApiField("apr")
	private String apr;

	/**
	 * 荣耀方用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 授信总额度，单位分 (授信通过时返回)
	 */
	@ApiField("credit_limit")
	private String creditLimit;

	/**
	 * 日利率, 示例: 0.065 【即0.065%】(授信通过时返回, 价格最低产品为日利率时返回)
	 */
	@ApiField("day_rate")
	private String dayRate;

	/**
	 * 额度失效日期, 格式yyyyMMdd
	 */
	@ApiField("limit_expire_date")
	private String limitExpireDate;

	/**
	 * 额度类型，1-循环额度
	 */
	@ApiField("limit_type")
	private Long limitType;

	/**
	 * 渠道方授信流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 拒绝原因码拒绝时必传
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 授信拒绝管控期(天)
	 */
	@ApiField("refuse_control_time")
	private Long refuseControlTime;

	/**
	 * 拒绝原因说明拒绝时必传
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/**
	 * 拒绝原因说明拒绝时必传
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	/**
	 * 可用额度，单位分 (授信通过时返回)
	 */
	@ApiField("remain_limit")
	private String remainLimit;

	/**
	 * 总可用额度 (临额+固额总和)，单位分 (授信通过时返回)
	 */
	@ApiField("total_available_limit")
	private String totalAvailableLimit;

	/**
	 * 总授信额度 (临额+固额总和)，单位分 (授信通过时返回)
	 */
	@ApiField("total_credit_limit")
	private String totalCreditLimit;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Long getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(Long applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getApr() {
		return this.apr;
	}
	public void setApr(String apr) {
		this.apr = apr;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getCreditLimit() {
		return this.creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getDayRate() {
		return this.dayRate;
	}
	public void setDayRate(String dayRate) {
		this.dayRate = dayRate;
	}

	public String getLimitExpireDate() {
		return this.limitExpireDate;
	}
	public void setLimitExpireDate(String limitExpireDate) {
		this.limitExpireDate = limitExpireDate;
	}

	public Long getLimitType() {
		return this.limitType;
	}
	public void setLimitType(Long limitType) {
		this.limitType = limitType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public Long getRefuseControlTime() {
		return this.refuseControlTime;
	}
	public void setRefuseControlTime(Long refuseControlTime) {
		this.refuseControlTime = refuseControlTime;
	}

	public String getRefuseMsg() {
		return this.refuseMsg;
	}
	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

	public String getRefuseMsgData() {
		return this.refuseMsgData;
	}
	public void setRefuseMsgData(String refuseMsgData) {
		this.refuseMsgData = refuseMsgData;
	}

	public String getRemainLimit() {
		return this.remainLimit;
	}
	public void setRemainLimit(String remainLimit) {
		this.remainLimit = remainLimit;
	}

	public String getTotalAvailableLimit() {
		return this.totalAvailableLimit;
	}
	public void setTotalAvailableLimit(String totalAvailableLimit) {
		this.totalAvailableLimit = totalAvailableLimit;
	}

	public String getTotalCreditLimit() {
		return this.totalCreditLimit;
	}
	public void setTotalCreditLimit(String totalCreditLimit) {
		this.totalCreditLimit = totalCreditLimit;
	}

}
