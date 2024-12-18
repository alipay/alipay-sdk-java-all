package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期扣款任务列表
 *
 * @author auto create
 * @since 1.0, 2022-10-27 12:38:55
 */
public class InstalmentPlanTuitionDTO extends AlipayObject {

	private static final long serialVersionUID = 6795165596371372386L;

	/**
	 * 扣款金额， 类似11.12格式
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易完成信息
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 订单ID，关联充值订单主键
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付宝用户pid
	 */
	@ApiField("plan_open_id")
	private String planOpenId;

	/**
	 * 扣款调度时间
	 */
	@ApiField("schedule_time")
	private Date scheduleTime;

	/**
	 * 扣款序号
	 */
	@ApiField("serial_no")
	private Long serialNo;

	/**
	 * 二级商户pid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 扣款状态

1, "打款调度中"
2, "打款完成"
3, "退款中"
4, "退款完成"
	 */
	@ApiField("status")
	private String status;

	/**
	 * 代扣交易订单ID
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户pid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPlanOpenId() {
		return this.planOpenId;
	}
	public void setPlanOpenId(String planOpenId) {
		this.planOpenId = planOpenId;
	}

	public Date getScheduleTime() {
		return this.scheduleTime;
	}
	public void setScheduleTime(Date scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public Long getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
