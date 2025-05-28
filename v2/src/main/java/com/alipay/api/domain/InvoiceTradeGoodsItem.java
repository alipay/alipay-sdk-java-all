package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝交易模型交易内容项模型
 *
 * @author auto create
 * @since 1.0, 2022-11-09 18:03:59
 */
public class InvoiceTradeGoodsItem extends AlipayObject {

	private static final long serialVersionUID = 7757422294378178451L;

	/**
	 * 商品类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商户设置的商品编号
	 */
	@ApiField("goods_no")
	private String goodsNo;

	/**
	 * 商品项支付金额
	 */
	@ApiField("goods_sum_amount")
	private String goodsSumAmount;

	/**
	 * 商品单价，单位元，精确到小数点后两位
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 购买商品规格型号描述
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 购买商品单位描述
	 */
	@ApiField("unit")
	private String unit;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNo() {
		return this.goodsNo;
	}
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getGoodsSumAmount() {
		return this.goodsSumAmount;
	}
	public void setGoodsSumAmount(String goodsSumAmount) {
		this.goodsSumAmount = goodsSumAmount;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
