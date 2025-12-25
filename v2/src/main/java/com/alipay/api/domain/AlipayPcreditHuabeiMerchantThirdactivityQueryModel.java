package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新版花呗分期商家贴息活动查询接口
 *
 * @author auto create
 * @since 1.0, 2025-09-10 15:28:52
 */
public class AlipayPcreditHuabeiMerchantThirdactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1888725532177634792L;

	/**
	 * 商品id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 出资账户信息（2088）
	 */
	@ApiField("invest_account")
	private String investAccount;

	/**
	 * 订单金额，单位元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getInvestAccount() {
		return this.investAccount;
	}
	public void setInvestAccount(String investAccount) {
		this.investAccount = investAccount;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

}
