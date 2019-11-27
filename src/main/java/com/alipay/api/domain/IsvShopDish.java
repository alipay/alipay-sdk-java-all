package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv回流的商户操作的菜品的具体信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class IsvShopDish extends AlipayObject {

	private static final long serialVersionUID = 3398721159869855288L;

	/**
	 * 菜品描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 菜品的SKU结果
	 */
	@ApiListField("dish_sku_list")
	@ApiField("isv_dish_sku")
	private List<IsvDishSku> dishSkuList;

	/**
	 * 菜品分类ID
	 */
	@ApiField("dish_type_id")
	private String dishTypeId;

	/**
	 * 分类名称
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * 菜品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部菜品ID
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 商品图片，可以上传多个
	 */
	@ApiListField("pict")
	@ApiField("string")
	private List<String> pict;

	/**
	 * 菜品价格，单位是分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 库存数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 菜品排序
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 菜品单位（斤、份）
	 */
	@ApiField("unit")
	private String unit;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<IsvDishSku> getDishSkuList() {
		return this.dishSkuList;
	}
	public void setDishSkuList(List<IsvDishSku> dishSkuList) {
		this.dishSkuList = dishSkuList;
	}

	public String getDishTypeId() {
		return this.dishTypeId;
	}
	public void setDishTypeId(String dishTypeId) {
		this.dishTypeId = dishTypeId;
	}

	public String getDishTypeName() {
		return this.dishTypeName;
	}
	public void setDishTypeName(String dishTypeName) {
		this.dishTypeName = dishTypeName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterDishId() {
		return this.outerDishId;
	}
	public void setOuterDishId(String outerDishId) {
		this.outerDishId = outerDishId;
	}

	public List<String> getPict() {
		return this.pict;
	}
	public void setPict(List<String> pict) {
		this.pict = pict;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
