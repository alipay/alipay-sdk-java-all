package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拉新邀请任务兑换资格咨询
 *
 * @author auto create
 * @since 1.0, 2018-12-28 11:31:13
 */
public class AlipayUserInvitetaskExchangeConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6316974745634323854L;

	/**
	 * 猫超券兑换金额,单位:分
	 */
	@ApiField("exchange_amount_money")
	private Long exchangeAmountMoney;

	/**
	 * 兑换类型：PRODUCT/实物商品；TMALL_COUPON/猫超券
	 */
	@ApiField("exchange_type")
	private String exchangeType;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 兑换商品ID
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

	public Long getExchangeAmountMoney() {
		return this.exchangeAmountMoney;
	}
	public void setExchangeAmountMoney(Long exchangeAmountMoney) {
		this.exchangeAmountMoney = exchangeAmountMoney;
	}

	public String getExchangeType() {
		return this.exchangeType;
	}
	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
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
