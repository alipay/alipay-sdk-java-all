package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销订单数据同步请求模型
 *
 * @author auto create
 * @since 1.0, 2025-01-10 11:23:30
 */
public class DeductionDataSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 2383169148713254551L;

	/**
	 * 业务id，唯一键标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 核销订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 扣款金额（单位元）
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 扣款失败原因
	 */
	@ApiField("deduction_fail_reason")
	private String deductionFailReason;

	/**
	 * 扣款失败次数
	 */
	@ApiField("deduction_fail_times")
	private Long deductionFailTimes;

	/**
	 * 扣款调用appId，调用扣款的小程序id
	 */
	@ApiField("deduction_invoke_appid")
	private String deductionInvokeAppid;

	/**
	 * 扣款单类型
	 */
	@ApiField("deduction_order_type")
	private String deductionOrderType;

	/**
	 * 扣款计划id，外部传入
	 */
	@ApiField("deduction_plan_id")
	private String deductionPlanId;

	/**
	 * 扣款状态
	 */
	@ApiField("deduction_status")
	private String deductionStatus;

	/**
	 * 实际扣款日期
	 */
	@ApiField("deduction_time")
	private Date deductionTime;

	/**
	 * 环境标识，外部传入
	 */
	@ApiField("env")
	private String env;

	/**
	 * 商户pid，外部传入
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务订单号，外部传入
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 收单主体PID，外部传入
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 扣款计划对应的期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 退款金额（单位元）
	 */
	@ApiField("refund_price")
	private String refundPrice;

	/**
	 * 退款时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 门店id，外部传入
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 间连SMID，外部传入
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 核销订单更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDeductionFailReason() {
		return this.deductionFailReason;
	}
	public void setDeductionFailReason(String deductionFailReason) {
		this.deductionFailReason = deductionFailReason;
	}

	public Long getDeductionFailTimes() {
		return this.deductionFailTimes;
	}
	public void setDeductionFailTimes(Long deductionFailTimes) {
		this.deductionFailTimes = deductionFailTimes;
	}

	public String getDeductionInvokeAppid() {
		return this.deductionInvokeAppid;
	}
	public void setDeductionInvokeAppid(String deductionInvokeAppid) {
		this.deductionInvokeAppid = deductionInvokeAppid;
	}

	public String getDeductionOrderType() {
		return this.deductionOrderType;
	}
	public void setDeductionOrderType(String deductionOrderType) {
		this.deductionOrderType = deductionOrderType;
	}

	public String getDeductionPlanId() {
		return this.deductionPlanId;
	}
	public void setDeductionPlanId(String deductionPlanId) {
		this.deductionPlanId = deductionPlanId;
	}

	public String getDeductionStatus() {
		return this.deductionStatus;
	}
	public void setDeductionStatus(String deductionStatus) {
		this.deductionStatus = deductionStatus;
	}

	public Date getDeductionTime() {
		return this.deductionTime;
	}
	public void setDeductionTime(Date deductionTime) {
		this.deductionTime = deductionTime;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRefundPrice() {
		return this.refundPrice;
	}
	public void setRefundPrice(String refundPrice) {
		this.refundPrice = refundPrice;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
