package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益使用详情
 *
 * @author auto create
 * @since 1.0, 2020-06-22 10:06:15
 */
public class UseDetail extends AlipayObject {

	private static final long serialVersionUID = 7731447186913613335L;

	/**
	 * 实付金额，单位是分
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * 应付金额，单位是分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 权益使用的时间,格式yyyy-MM-dd HH:mm:ss (订单支付时间)
	 */
	@ApiField("date")
	private String date;

	/**
	 * 使用的权益关联的商品信息
	 */
	@ApiField("goods_info")
	private BenifitGoodsInfo goodsInfo;

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public BenifitGoodsInfo getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(BenifitGoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

}
