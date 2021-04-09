package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拉新邀请任务兑换确认
 *
 * @author auto create
 * @since 1.0, 2018-12-28 11:31:32
 */
public class AlipayUserInvitetaskExchangeConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7285617974458298461L;

	/**
	 * 猫超券兑换金额,单位:分
	 */
	@ApiField("exchange_amount_money")
	private String exchangeAmountMoney;

	/**
	 * 兑换类型：PRODUCT/实物商品；TMALL_COUPON/猫超券
	 */
	@ApiField("exchange_type")
	private String exchangeType;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 兑换商品item_id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 邀请任务进程业务号
	 */
	@ApiField("task_process_id")
	private String taskProcessId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getExchangeAmountMoney() {
		return this.exchangeAmountMoney;
	}
	public void setExchangeAmountMoney(String exchangeAmountMoney) {
		this.exchangeAmountMoney = exchangeAmountMoney;
	}

	public String getExchangeType() {
		return this.exchangeType;
	}
	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTaskProcessId() {
		return this.taskProcessId;
	}
	public void setTaskProcessId(String taskProcessId) {
		this.taskProcessId = taskProcessId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
