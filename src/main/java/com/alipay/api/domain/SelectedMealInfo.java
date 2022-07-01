package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 套餐信息
 *
 * @author auto create
 * @since 1.0, 2020-08-05 20:15:02
 */
public class SelectedMealInfo extends AlipayObject {

	private static final long serialVersionUID = 8146584664552743622L;

	/**
	 * 套餐的加价.仅当type=COMBO时有效
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 套餐子明细的加料信息列表
	 */
	@ApiListField("meal_side_list")
	@ApiField("selected_meal_side_info")
	private List<SelectedMealSideInfo> mealSideList;

	/**
	 * 数量
	 */
	@ApiField("num")
	private String num;

	/**
	 * 外部菜品ID
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * "菜品的其他信息，包括但不限于：sku、规格，做法等信息;
为Map结构的json格式，key的枚举定义：
(1)PRACTICE:""红烧""   做法
(2PRACTICE_PRICE:""10.0"" 做法加价
(3)SALES_PROPERTY: {""甜度"":[""五分甜"",""三分甜""],""冰量"":[""少冰""]} 一般销售属性 (4)SPECIFICATION:""大""  规格"
	 */
	@ApiField("out_dish_infos")
	private String outDishInfos;

	/**
	 * 外部菜品SKU ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 加料价格，仅当type=SIDE时有值
	 */
	@ApiField("side_price")
	private String sidePrice;

	/**
	 * 商品下细分的sku ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * "（新增）子明细类型：
可枚举：
(1)COMBO 套餐内子明细
(2)SIDE  加料明细"
	 */
	@ApiField("type")
	private String type;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	public String getAddPrice() {
		return this.addPrice;
	}
	public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public List<SelectedMealSideInfo> getMealSideList() {
		return this.mealSideList;
	}
	public void setMealSideList(List<SelectedMealSideInfo> mealSideList) {
		this.mealSideList = mealSideList;
	}

	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutDishInfos() {
		return this.outDishInfos;
	}
	public void setOutDishInfos(String outDishInfos) {
		this.outDishInfos = outDishInfos;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSidePrice() {
		return this.sidePrice;
	}
	public void setSidePrice(String sidePrice) {
		this.sidePrice = sidePrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
