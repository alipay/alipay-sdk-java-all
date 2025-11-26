package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品加料信息
 *
 * @author auto create
 * @since 1.0, 2025-01-13 18:27:53
 */
public class ToppingsInfo extends AlipayObject {

	private static final long serialVersionUID = 4896878818969659639L;

	/**
	 * 加料分类名称 当前字段已废弃(参数名错误，调整成category_name字段)
	 */
	@ApiField("category")
	@Deprecated
	private String category;

	/**
	 * 加料分类id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 加料分类名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 加料份数，单位份
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 加料商品id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 加料商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品goods id 当前字段已废弃(错误字段，改为goods_id字段)
	 */
	@ApiField("id")
	@Deprecated
	private String id;

	/**
	 * 加料图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 商品加料库存，单位份
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品加料名称 当前字段已废弃(错误字段，替换成goods_name字段)
	 */
	@ApiField("name")
	@Deprecated
	private String name;

	/**
	 * 加料可选规格
	 */
	@ApiListField("optional_specifications")
	@ApiField("specification_info")
	private List<SpecificationInfo> optionalSpecifications;

	/**
	 * 商品加料价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品加料skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 加料规格id，订单计算接口需传入该参数
	 */
	@ApiField("spec_id")
	private String specId;

	/**
	 * 加料规格名称，订单计算接口需传入该参数
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 商品加料名称
	 */
	@ApiField("spu_id")
	private String spuId;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<SpecificationInfo> getOptionalSpecifications() {
		return this.optionalSpecifications;
	}
	public void setOptionalSpecifications(List<SpecificationInfo> optionalSpecifications) {
		this.optionalSpecifications = optionalSpecifications;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpecId() {
		return this.specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

}
