package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子订单信息
 *
 * @author auto create
 * @since 1.0, 2023-08-16 16:40:42
 */
public class SubOrderContent extends AlipayObject {

	private static final long serialVersionUID = 2826553714247942894L;

	/**
	 * 子订单优惠价格，单位：元
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 原始单价，单位：元。
	 */
	@ApiField("origin_fee")
	private String originFee;

	/**
	 * 子订单实际支付价格，单位：元。外层参数method_name为上报订单时必选
	 */
	@ApiField("pay_fee")
	private String payFee;

	/**
	 * 子订单销售单价，单位：元。外层参数method_name为上报订单时必选
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 子订单对应的商品，购买的数量。外层参数method_name为上报订单时必选
	 */
	@ApiField("sale_quantity")
	private String saleQuantity;

	/**
	 * 子订单商品skuid（如果导入数据中，店铺下不存在对应id则当前商品为非有效商品，不会存储当前子订单，如果整张订单中都不存在有效商品，认为订单无效，整个订单都不存储）。外层参数method_name为上报订单时必选
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 子订单商品副标题，如颜色、型号。外层参数method_name为上报订单时必选
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 子订单商品标题。外层参数method_name为上报订单时必选
	 */
	@ApiField("title")
	private String title;

	/**
	 * 子订单商品图片地址，用于渲染。外层参数method_name为上报订单时必选
	 */
	@ApiField("title_img")
	private String titleImg;

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getOriginFee() {
		return this.originFee;
	}
	public void setOriginFee(String originFee) {
		this.originFee = originFee;
	}

	public String getPayFee() {
		return this.payFee;
	}
	public void setPayFee(String payFee) {
		this.payFee = payFee;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleQuantity() {
		return this.saleQuantity;
	}
	public void setSaleQuantity(String saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleImg() {
		return this.titleImg;
	}
	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

}
