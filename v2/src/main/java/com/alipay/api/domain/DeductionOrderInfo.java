package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核销订单信息
 *
 * @author auto create
 * @since 1.0, 2024-08-16 10:24:47
 */
public class DeductionOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 7778588329464764834L;

	/**
	 * 抽佣信息集合
	 */
	@ApiListField("bill_fee_info_list")
	@ApiField("bill_fee_info")
	private List<BillFeeInfo> billFeeInfoList;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 凭证序列号
	 */
	@ApiField("certificate_serial")
	private String certificateSerial;

	/**
	 * 扣款金额，单位：分
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
	 * 核销订单ID
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 扣款单类型
	 */
	@ApiField("deduction_order_type")
	private String deductionOrderType;

	/**
	 * 扣款状态
	 */
	@ApiField("deduction_status")
	private String deductionStatus;

	/**
	 * 实际扣款时间
	 */
	@ApiField("deduction_time")
	private String deductionTime;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 计划扣款时间
	 */
	@ApiField("plan_deduction_time")
	private String planDeductionTime;

	/**
	 * 退款金额，单位：分
	 */
	@ApiField("refund_cash")
	private Long refundCash;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 分期单ID
	 */
	@ApiField("sub_order_id")
	private String subOrderId;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<BillFeeInfo> getBillFeeInfoList() {
		return this.billFeeInfoList;
	}
	public void setBillFeeInfoList(List<BillFeeInfo> billFeeInfoList) {
		this.billFeeInfoList = billFeeInfoList;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateSerial() {
		return this.certificateSerial;
	}
	public void setCertificateSerial(String certificateSerial) {
		this.certificateSerial = certificateSerial;
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

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public String getDeductionOrderType() {
		return this.deductionOrderType;
	}
	public void setDeductionOrderType(String deductionOrderType) {
		this.deductionOrderType = deductionOrderType;
	}

	public String getDeductionStatus() {
		return this.deductionStatus;
	}
	public void setDeductionStatus(String deductionStatus) {
		this.deductionStatus = deductionStatus;
	}

	public String getDeductionTime() {
		return this.deductionTime;
	}
	public void setDeductionTime(String deductionTime) {
		this.deductionTime = deductionTime;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPlanDeductionTime() {
		return this.planDeductionTime;
	}
	public void setPlanDeductionTime(String planDeductionTime) {
		this.planDeductionTime = planDeductionTime;
	}

	public Long getRefundCash() {
		return this.refundCash;
	}
	public void setRefundCash(Long refundCash) {
		this.refundCash = refundCash;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
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
