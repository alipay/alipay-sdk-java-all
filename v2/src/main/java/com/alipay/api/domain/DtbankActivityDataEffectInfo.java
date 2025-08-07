package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动数据效果
 *
 * @author auto create
 * @since 1.0, 2025-01-18 13:46:21
 */
public class DtbankActivityDataEffectInfo extends AlipayObject {

	private static final long serialVersionUID = 6142533712175137227L;

	/**
	 * 笔均核销优惠金额，单位：分
	 */
	@ApiField("avg_order_write_off_discount_amt")
	private Long avgOrderWriteOffDiscountAmt;

	/**
	 * 人均核销优惠金额，单位：分
	 */
	@ApiField("avg_user_write_off_discount_amt")
	private Long avgUserWriteOffDiscountAmt;

	/**
	 * 取数据更新的截止日期
	 */
	@ApiField("data_update_time")
	private String dataUpdateTime;

	/**
	 * 累计退款活动金额，单位：分
	 */
	@ApiField("total_camp_refund_amt")
	private Long totalCampRefundAmt;

	/**
	 * 失效优惠券金额，单位：分
	 */
	@ApiField("total_expire_amt")
	private Long totalExpireAmt;

	/**
	 * 失效优惠券数量，单位：个
	 */
	@ApiField("total_expire_cnt")
	private Long totalExpireCnt;

	/**
	 * 累计退款订单数，单位：笔
	 */
	@ApiField("total_order_refund_cnt")
	private Long totalOrderRefundCnt;

	/**
	 * 累积领取优惠金额，单位：分
	 */
	@ApiField("total_receive_amt")
	private Long totalReceiveAmt;

	/**
	 * 累积领取次数，单位：次
	 */
	@ApiField("total_receive_times")
	private Long totalReceiveTimes;

	/**
	 * 累计领取用户数，单位：个
	 */
	@ApiField("total_receive_user_cnt")
	private Long totalReceiveUserCnt;

	/**
	 * 累积核销优惠金额，单位：分
	 */
	@ApiField("total_write_off_discount_amt")
	private Long totalWriteOffDiscountAmt;

	/**
	 * 累积核销订单数，单位：笔
	 */
	@ApiField("total_write_off_order_cnt")
	private Long totalWriteOffOrderCnt;

	/**
	 * 累积核销用户数，单位：个
	 */
	@ApiField("total_write_off_user_cnt")
	private Long totalWriteOffUserCnt;

	public Long getAvgOrderWriteOffDiscountAmt() {
		return this.avgOrderWriteOffDiscountAmt;
	}
	public void setAvgOrderWriteOffDiscountAmt(Long avgOrderWriteOffDiscountAmt) {
		this.avgOrderWriteOffDiscountAmt = avgOrderWriteOffDiscountAmt;
	}

	public Long getAvgUserWriteOffDiscountAmt() {
		return this.avgUserWriteOffDiscountAmt;
	}
	public void setAvgUserWriteOffDiscountAmt(Long avgUserWriteOffDiscountAmt) {
		this.avgUserWriteOffDiscountAmt = avgUserWriteOffDiscountAmt;
	}

	public String getDataUpdateTime() {
		return this.dataUpdateTime;
	}
	public void setDataUpdateTime(String dataUpdateTime) {
		this.dataUpdateTime = dataUpdateTime;
	}

	public Long getTotalCampRefundAmt() {
		return this.totalCampRefundAmt;
	}
	public void setTotalCampRefundAmt(Long totalCampRefundAmt) {
		this.totalCampRefundAmt = totalCampRefundAmt;
	}

	public Long getTotalExpireAmt() {
		return this.totalExpireAmt;
	}
	public void setTotalExpireAmt(Long totalExpireAmt) {
		this.totalExpireAmt = totalExpireAmt;
	}

	public Long getTotalExpireCnt() {
		return this.totalExpireCnt;
	}
	public void setTotalExpireCnt(Long totalExpireCnt) {
		this.totalExpireCnt = totalExpireCnt;
	}

	public Long getTotalOrderRefundCnt() {
		return this.totalOrderRefundCnt;
	}
	public void setTotalOrderRefundCnt(Long totalOrderRefundCnt) {
		this.totalOrderRefundCnt = totalOrderRefundCnt;
	}

	public Long getTotalReceiveAmt() {
		return this.totalReceiveAmt;
	}
	public void setTotalReceiveAmt(Long totalReceiveAmt) {
		this.totalReceiveAmt = totalReceiveAmt;
	}

	public Long getTotalReceiveTimes() {
		return this.totalReceiveTimes;
	}
	public void setTotalReceiveTimes(Long totalReceiveTimes) {
		this.totalReceiveTimes = totalReceiveTimes;
	}

	public Long getTotalReceiveUserCnt() {
		return this.totalReceiveUserCnt;
	}
	public void setTotalReceiveUserCnt(Long totalReceiveUserCnt) {
		this.totalReceiveUserCnt = totalReceiveUserCnt;
	}

	public Long getTotalWriteOffDiscountAmt() {
		return this.totalWriteOffDiscountAmt;
	}
	public void setTotalWriteOffDiscountAmt(Long totalWriteOffDiscountAmt) {
		this.totalWriteOffDiscountAmt = totalWriteOffDiscountAmt;
	}

	public Long getTotalWriteOffOrderCnt() {
		return this.totalWriteOffOrderCnt;
	}
	public void setTotalWriteOffOrderCnt(Long totalWriteOffOrderCnt) {
		this.totalWriteOffOrderCnt = totalWriteOffOrderCnt;
	}

	public Long getTotalWriteOffUserCnt() {
		return this.totalWriteOffUserCnt;
	}
	public void setTotalWriteOffUserCnt(Long totalWriteOffUserCnt) {
		this.totalWriteOffUserCnt = totalWriteOffUserCnt;
	}

}
