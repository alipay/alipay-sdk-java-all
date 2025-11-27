package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 扣款单详情查询
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:54
 */
public class DeductionOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 1422264889324798671L;

	/**
	 * 实支付时间
	 */
	@ApiField("actual_deduction_time")
	private Date actualDeductionTime;

	/**
	 * 扣款单取消时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * 扣款单对应扣款金额
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 扣款失败原因
	 */
	@ApiField("deduction_fail_reason")
	private String deductionFailReason;

	/**
	 * 系统生成扣款单唯一编号
	 */
	@ApiField("deduction_order_no")
	private String deductionOrderNo;

	/**
	 * PAID	初始化: INIT
支付中: PAYING
已支付: PAID
支付失败: PAY_FAILED
已取消: CANCEL
全额退款: FULLY_REFUNDED
	 */
	@ApiField("deduction_order_status")
	private String deductionOrderStatus;

	/**
	 * 押金扣款单: DEPOSIT
租金扣款单: RENT
	 */
	@ApiField("deduction_order_type")
	private String deductionOrderType;

	/**
	 * 【押金扣款】单填写
	 */
	@ApiField("deduction_reason")
	private String deductionReason;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 系统生成订单唯一编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 系统扣款: SYSTEM
用户手动扣款: USER
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 【周期付】信用服务类型填写
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 该时间用于到期扣款与扣款失败重试扣款
	 */
	@ApiField("plan_deduction_time")
	private Date planDeductionTime;

	/**
	 * 系统生成的商品编号
	 */
	@ApiField("product_no")
	private String productNo;

	/**
	 * 退款成功记录列表
	 */
	@ApiListField("refunded_record_list")
	@ApiField("refunded_record_list_d_t_o")
	private List<RefundedRecordListDTO> refundedRecordList;

	/**
	 * 分账详情列表
	 */
	@ApiListField("settle_info_list")
	@ApiField("settle_info_list_d_t_o")
	private List<SettleInfoListDTO> settleInfoList;

	/**
	 * 直付通进件得到的ID
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("u_open_id")
	private String uOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getActualDeductionTime() {
		return this.actualDeductionTime;
	}
	public void setActualDeductionTime(Date actualDeductionTime) {
		this.actualDeductionTime = actualDeductionTime;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
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

	public String getDeductionOrderNo() {
		return this.deductionOrderNo;
	}
	public void setDeductionOrderNo(String deductionOrderNo) {
		this.deductionOrderNo = deductionOrderNo;
	}

	public String getDeductionOrderStatus() {
		return this.deductionOrderStatus;
	}
	public void setDeductionOrderStatus(String deductionOrderStatus) {
		this.deductionOrderStatus = deductionOrderStatus;
	}

	public String getDeductionOrderType() {
		return this.deductionOrderType;
	}
	public void setDeductionOrderType(String deductionOrderType) {
		this.deductionOrderType = deductionOrderType;
	}

	public String getDeductionReason() {
		return this.deductionReason;
	}
	public void setDeductionReason(String deductionReason) {
		this.deductionReason = deductionReason;
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

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public Date getPlanDeductionTime() {
		return this.planDeductionTime;
	}
	public void setPlanDeductionTime(Date planDeductionTime) {
		this.planDeductionTime = planDeductionTime;
	}

	public String getProductNo() {
		return this.productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public List<RefundedRecordListDTO> getRefundedRecordList() {
		return this.refundedRecordList;
	}
	public void setRefundedRecordList(List<RefundedRecordListDTO> refundedRecordList) {
		this.refundedRecordList = refundedRecordList;
	}

	public List<SettleInfoListDTO> getSettleInfoList() {
		return this.settleInfoList;
	}
	public void setSettleInfoList(List<SettleInfoListDTO> settleInfoList) {
		this.settleInfoList = settleInfoList;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getuOpenId() {
		return this.uOpenId;
	}
	public void setuOpenId(String uOpenId) {
		this.uOpenId = uOpenId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
