package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品列表信息
 *
 * @author auto create
 * @since 1.0, 2024-11-25 11:14:20
 */
public class GoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 1561571326451839911L;

	/**
	 * 支付宝定义的统一商品编号
	 */
	@ApiField("alipay_goods_id")
	private String alipayGoodsId;

	/**
	 * 商品描述信息
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商品类目树，从商品类目根节点到叶子节点的类目id组成，类目id值使用|分割
	 */
	@ApiField("categories_tree")
	private String categoriesTree;

	/**
	 * 商品类目
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商品的编号，该参数传入支付券上绑定商品goods_id,
倘若无支付券需要消费，该字段传入商品最小粒度的商品ID（如：若商品有sku粒度，则传商户sku粒度的ID）
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商家侧小程序商品ID，指商家提报给小程序商品库的商品。当前接口的extend_params.trade_component_order_id字段不为空时该字段必填，且与交易组件订单参数保持一致。了解小程序商品请参考：<a href="https://opendocs.alipay.com/mini/06uila?pathHash=63b6fba7">https://opendocs.alipay.com/mini/06uila?pathHash=63b6fba7</a>
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧小程序商品ID，指商家提报给小程序商品库的商品。当前接口的extend_params.trade_component_order_id字段不为空时该字段必填，且与交易组件订单参数保持一致。了解小程序商品请参考：<a target="_blank" href="https://opendocs.alipay.com/mini/06uila?pathHash=63b6fba7" >https://opendocs.alipay.com/mini/06uila?pathHash=63b6fba7</a>
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品单价，单位为元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品的展示地址
	 */
	@ApiField("show_url")
	private String showUrl;

	public String getAlipayGoodsId() {
		return this.alipayGoodsId;
	}
	public void setAlipayGoodsId(String alipayGoodsId) {
		this.alipayGoodsId = alipayGoodsId;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCategoriesTree() {
		return this.categoriesTree;
	}
	public void setCategoriesTree(String categoriesTree) {
		this.categoriesTree = categoriesTree;
	}

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getShowUrl() {
		return this.showUrl;
	}
	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

}
