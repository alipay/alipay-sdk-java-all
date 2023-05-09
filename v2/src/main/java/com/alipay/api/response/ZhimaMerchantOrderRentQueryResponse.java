package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:41:51
 */
public class ZhimaMerchantOrderRentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5426245522323442173L;

	/** 
	 * 是否准入:
Y:准入
N:不准入
	 */
	@ApiField("admit_state")
	private String admitState;

	/** 
	 * 资金流水号
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 借用时间
	 */
	@ApiField("borrow_time")
	private String borrowTime;

	/** 
	 * 物品名称,最长不能超过14个汉字
	 */
	@ApiField("goods_name")
	private String goodsName;

	/** 
	 * 支付宝open_id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 芝麻信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付金额类型
RENT:租金
DAMAGE:赔偿金
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/** 
	 * 支付状态
PAY_INIT:待支付
PAY_SUCCESS:支付成功
PAY_FAILED:支付失败
PAY_INPROGRESS:支付中
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 归还时间
	 */
	@ApiField("restore_time")
	private String restoreTime;

	/** 
	 * 订单状态:
borrow:借出
restore:归还
cancel:撤销
	 */
	@ApiField("use_state")
	private String useState;

	/** 
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setAdmitState(String admitState) {
		this.admitState = admitState;
	}
	public String getAdmitState( ) {
		return this.admitState;
	}

	public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}
	public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
	}

	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}
	public String getBorrowTime( ) {
		return this.borrowTime;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName( ) {
		return this.goodsName;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}
	public String getPayAmountType( ) {
		return this.payAmountType;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
	}
	public String getRestoreTime( ) {
		return this.restoreTime;
	}

	public void setUseState(String useState) {
		this.useState = useState;
	}
	public String getUseState( ) {
		return this.useState;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
