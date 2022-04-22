package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣券详情 限制: 券类型voucher_type为折扣券DISCOUNT_VOUCHER时必传
 *
 * @author auto create
 * @since 1.0, 2021-12-27 14:57:40
 */
public class DiscountVoucher extends AlipayObject {

	private static final long serialVersionUID = 7257532955335739956L;

	/**
	 * 封顶金额。
限制：
币种为人民币，单位为元;
小数点以后最多保留两位; 
取值范围:0.1<=x<=15000;
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 折扣率。
限制:
取值范围：0.1<=x<=9.9，比如：6.5折填入6.5;
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 门槛金额。
限制： 
币种为人民币，单位为元；
小数点以后最多保留两位；
取值范围:0.1<=x<= 50000;
说明：
该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 商品名称。
说明：
该字段可不填，填入则origin_amount必填。
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 原价。
限制：
币种为人民币，单位为元。小数点以后最多保留两位;
取值范围:0.1<=x<=9999;
说明：
该字段可不填，填入则商品名称goods_name必填;
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
