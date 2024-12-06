package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品列表信息
 *
 * @author auto create
 * @since 1.0, 2023-03-27 16:43:51
 */
public class GoodsDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5728747722482433856L;

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
	 * 商品的编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 建议商品名称格式为：{商家名称}+{商品名称}
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 精确到小数点后两位。单位为元。
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

	/**
	 * 商家商品sku_id
	 */
	@ApiField("sku_id")
	private String skuId;

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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
