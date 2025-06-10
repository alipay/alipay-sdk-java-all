package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户券实例基础信息
 *
 * @author auto create
 * @since 1.0, 2024-01-19 10:36:17
 */
public class UserVoucherBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 6836325443688194422L;

	/**
	 * 若商家券操作过关联商户订单信息，则该字段返回商家券已关联的商户订单号。
	 */
	@ApiField("associate_trade_no")
	private String associateTradeNo;

	/**
	 * 券归属商户
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/**
	 * 领券时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 券可使用的开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 券可使用的结束时间。 格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 用户领取的券码code,支付宝商家券活动才会返回券码，其他优惠券活动该值为空
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	/**
	 * 用户券 id。支付宝为用户优惠券唯一分配的 id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券最大核销次数
	 */
	@ApiField("voucher_max_use_times")
	private Long voucherMaxUseTimes;

	/**
	 * 对消费者展示的券(商品)名称。
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券状态。SENDED:可用 USED:已核销(即完全使用), EXPIRED:已过期(只能查询6个月内数据)
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券已核销次数
	 */
	@ApiField("voucher_used_times")
	private Long voucherUsedTimes;

	public String getAssociateTradeNo() {
		return this.associateTradeNo;
	}
	public void setAssociateTradeNo(String associateTradeNo) {
		this.associateTradeNo = associateTradeNo;
	}

	public String getBelongMerchantId() {
		return this.belongMerchantId;
	}
	public void setBelongMerchantId(String belongMerchantId) {
		this.belongMerchantId = belongMerchantId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getValidBeginTime() {
		return this.validBeginTime;
	}
	public void setValidBeginTime(Date validBeginTime) {
		this.validBeginTime = validBeginTime;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public Long getVoucherMaxUseTimes() {
		return this.voucherMaxUseTimes;
	}
	public void setVoucherMaxUseTimes(Long voucherMaxUseTimes) {
		this.voucherMaxUseTimes = voucherMaxUseTimes;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public Long getVoucherUsedTimes() {
		return this.voucherUsedTimes;
	}
	public void setVoucherUsedTimes(Long voucherUsedTimes) {
		this.voucherUsedTimes = voucherUsedTimes;
	}

}
