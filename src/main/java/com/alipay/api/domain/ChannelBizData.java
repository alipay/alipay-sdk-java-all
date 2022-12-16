package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道业务信息
 *
 * @author auto create
 * @since 1.0, 2022-03-28 17:06:26
 */
public class ChannelBizData extends AlipayObject {

	private static final long serialVersionUID = 1337384454123463434L;

	/**
	 * 商品描述
	 */
	@ApiField("goods_info")
	private String goodsInfo;

	/**
	 * 订单信息详情
	 */
	@ApiField("order_info")
	private String orderInfo;

	/**
	 * 渠道订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 价格因子
	 */
	@ApiField("premium_factor")
	private String premiumFactor;

	public String getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPremiumFactor() {
		return this.premiumFactor;
	}
	public void setPremiumFactor(String premiumFactor) {
		this.premiumFactor = premiumFactor;
	}

}
