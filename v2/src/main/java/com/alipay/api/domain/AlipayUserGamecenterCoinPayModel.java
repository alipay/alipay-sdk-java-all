package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣减用户游戏币
 *
 * @author auto create
 * @since 1.0, 2025-04-01 16:41:54
 */
public class AlipayUserGamecenterCoinPayModel extends AlipayObject {

	private static final long serialVersionUID = 7336416395899835461L;

	/**
	 * 扣除游戏币数量
	 */
	@ApiField("amt")
	private Long amt;

	/**
	 * 游戏开发者备注，会写到道具购买交易流水中，开发者自定义
	 */
	@ApiField("app_remark")
	private String appRemark;

	/**
	 * 扣游戏币开发者订单号，需保证全局唯一，相同的订单号不会重复扣款
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 商户app_id维度下的用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 兑换游戏道具名，开发者自定义名称
	 */
	@ApiField("pay_item")
	private String payItem;

	/**
	 * 支付宝唯一用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmt() {
		return this.amt;
	}
	public void setAmt(Long amt) {
		this.amt = amt;
	}

	public String getAppRemark() {
		return this.appRemark;
	}
	public void setAppRemark(String appRemark) {
		this.appRemark = appRemark;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPayItem() {
		return this.payItem;
	}
	public void setPayItem(String payItem) {
		this.payItem = payItem;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
