package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包创单接口
 *
 * @author auto create
 * @since 1.0, 2024-04-15 11:55:11
 */
public class AlipayCloudFundWalletDepositorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1765297214643381763L;

	/**
	 * 充值金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 标题描述
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 充值外部订单号，用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单失效时间。绝对超时时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time_expire")
	private Date timeExpire;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
