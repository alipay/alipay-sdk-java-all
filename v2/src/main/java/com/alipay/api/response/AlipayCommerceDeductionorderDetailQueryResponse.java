package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SettleOrderResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.deductionorder.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:53
 */
public class AlipayCommerceDeductionorderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5368655128565812913L;

	/** 
	 * 卡ID
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
	 * 扣款金额
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
	 * 扣款单ID
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/** 
	 * 扣款计划ID
	 */
	@ApiField("deduction_plan_id")
	private String deductionPlanId;

	/** 
	 * 扣款状态
	 */
	@ApiField("deduction_status")
	private String deductionStatus;

	/** 
	 * 实际扣款时间
	 */
	@ApiField("deduction_time")
	private Date deductionTime;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 用户账号
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 业务单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 计划扣款时间
	 */
	@ApiField("plan_deduction_time")
	private Date planDeductionTime;

	/** 
	 * 分账单
	 */
	@ApiField("settle_order_response")
	private SettleOrderResponse settleOrderResponse;

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
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardId( ) {
		return this.cardId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateId( ) {
		return this.certificateId;
	}

	public void setCertificateSerial(String certificateSerial) {
		this.certificateSerial = certificateSerial;
	}
	public String getCertificateSerial( ) {
		return this.certificateSerial;
	}

	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
	public String getDeductionAmount( ) {
		return this.deductionAmount;
	}

	public void setDeductionFailReason(String deductionFailReason) {
		this.deductionFailReason = deductionFailReason;
	}
	public String getDeductionFailReason( ) {
		return this.deductionFailReason;
	}

	public void setDeductionFailTimes(Long deductionFailTimes) {
		this.deductionFailTimes = deductionFailTimes;
	}
	public Long getDeductionFailTimes( ) {
		return this.deductionFailTimes;
	}

	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}
	public String getDeductionOrderId( ) {
		return this.deductionOrderId;
	}

	public void setDeductionPlanId(String deductionPlanId) {
		this.deductionPlanId = deductionPlanId;
	}
	public String getDeductionPlanId( ) {
		return this.deductionPlanId;
	}

	public void setDeductionStatus(String deductionStatus) {
		this.deductionStatus = deductionStatus;
	}
	public String getDeductionStatus( ) {
		return this.deductionStatus;
	}

	public void setDeductionTime(Date deductionTime) {
		this.deductionTime = deductionTime;
	}
	public Date getDeductionTime( ) {
		return this.deductionTime;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setPlanDeductionTime(Date planDeductionTime) {
		this.planDeductionTime = planDeductionTime;
	}
	public Date getPlanDeductionTime( ) {
		return this.planDeductionTime;
	}

	public void setSettleOrderResponse(SettleOrderResponse settleOrderResponse) {
		this.settleOrderResponse = settleOrderResponse;
	}
	public SettleOrderResponse getSettleOrderResponse( ) {
		return this.settleOrderResponse;
	}

	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}
	public String getSubOrderId( ) {
		return this.subOrderId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
