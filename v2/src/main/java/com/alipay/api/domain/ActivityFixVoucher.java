package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销私域开放满减券详情
 *
 * @author auto create
 * @since 1.0, 2023-06-01 17:31:32
 */
public class ActivityFixVoucher extends AlipayObject {

	private static final long serialVersionUID = 2223842348387168218L;

	/**
	 * 面额，每张代金券可以抵扣的金额。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额。该字段不填写，认为无门槛。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 商品名称。
	 */
	@ApiField("goods_name")
	private String goodsName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

}
