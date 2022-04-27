package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销私域开放折扣券详情
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:45
 */
public class ActivityDiscountVoucher extends AlipayObject {

	private static final long serialVersionUID = 3682928377868416988L;

	/**
	 * 封顶金额。 限制： 币种为人民币，单位为元; 小数点以后最多保留两位; 取值范围:0.1<=x<=15000;
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 折扣率。 限制: 取值范围：0.1<=x<=9.9，比如：6.5折填入6.5;
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 门槛金额。 限制： 币种为人民币，单位为元； 小数点以后最多保留两位； 取值范围:0.1<=x<= 50000; 说明： 该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 商品名称。 说明： 该字段可不填，填入则origin_amount必填。
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 原价。 限制： 币种为人民币，单位为元。小数点以后最多保留两位; 取值范围:0.1<=x<=9999;
	 */
	@ApiField("origin_amount")
	private String originAmount;

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
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

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

}
