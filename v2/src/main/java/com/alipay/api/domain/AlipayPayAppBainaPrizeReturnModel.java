package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户兑奖资格退回
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:03
 */
public class AlipayPayAppBainaPrizeReturnModel extends AlipayObject {

	private static final long serialVersionUID = 3347158317159255771L;

	/**
	 * 下单商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * lm侧订单号
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求编号，编号相同则认为是一个请求，幂等使用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
