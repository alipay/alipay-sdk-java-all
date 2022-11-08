package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车退款订单同步接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 15:39:12
 */
public class AlipayEcoMycarParkingRefundorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7125871156382967279L;

	/**
	 * 订单对应的车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 支付宝支付流水trade_no，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部退款单号，由外部生成在发起退款时作为输入参数的字段
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 退款金额，保留小数点后两位
	 */
	@ApiField("refund_money")
	private String refundMoney;

	/**
	 * 退款时间, 格式"YYYYMM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("refund_time")
	private String refundTime;

	/**
	 * 停车缴费用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 注意：ISV需保证用户 id的正确性，以免导致用户在停车平台查询不到相关的订单信息。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRefundMoney() {
		return this.refundMoney;
	}
	public void setRefundMoney(String refundMoney) {
		this.refundMoney = refundMoney;
	}

	public String getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
