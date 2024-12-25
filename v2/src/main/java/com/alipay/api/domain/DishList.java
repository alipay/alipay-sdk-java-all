package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品明细信息
 *
 * @author auto create
 * @since 1.0, 2020-08-05 20:15:02
 */
public class DishList extends AlipayObject {

	private static final long serialVersionUID = 3426675837935292563L;

	/**
	 * 总价
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 口碑推单的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 菜品优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 菜品优惠明细
	 */
	@ApiListField("discount_infos")
	@ApiField("discount_infos")
	private List<DiscountInfos> discountInfos;

	/**
	 * 菜品在口碑侧基于商品表达的商品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品类型：
可枚举：
(1)SINGLE
(2)COMBO
	 */
	@ApiField("dish_type")
	private String dishType;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 数量
	 */
	@ApiField("num")
	private String num;

	/**
	 * POS侧菜品明细单ID
	 */
	@ApiField("out_detail_id")
	private String outDetailId;

	/**
	 * 外部菜品ID
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * "菜品的其他信息，包括但不限于：sku、规格，做法等信息;
为Map结构的json格式，key的枚举定义：
(1)PRACTICE:""红烧""   做法
(2)PRACTICE_PRICE:""10.0"" 做法加价
(3)SALES_PROPERTY: {""甜度"":[""五分甜"",""三分甜""],""冰量"":[""少冰""]} 一般销售属性
(4)SPECIFICATION:""大""  规格"
	 */
	@ApiField("out_dish_infos")
	private String outDishInfos;

	/**
	 * 外部菜品SKU ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 套餐选择信息
	 */
	@ApiListField("selected_meal_info")
	@ApiField("selected_meal_info")
	private List<SelectedMealInfo> selectedMealInfo;

	/**
	 * 商品下细分的sku ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 菜品状态：
可枚举：
(1)INIT:加菜
(2)SUCCESS:接单
(3)REFUND:退菜
(4)CLOSE:拒单
	 */
	@ApiField("status")
	private String status;

	/**
	 * 是否临时菜：
可枚举：
(1)Y
(2)N
	 */
	@ApiField("temporary_dish")
	private String temporaryDish;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<DiscountInfos> getDiscountInfos() {
		return this.discountInfos;
	}
	public void setDiscountInfos(List<DiscountInfos> discountInfos) {
		this.discountInfos = discountInfos;
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

	public String getDishType() {
		return this.dishType;
	}
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public String getOutDetailId() {
		return this.outDetailId;
	}
	public void setOutDetailId(String outDetailId) {
		this.outDetailId = outDetailId;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<SelectedMealInfo> getSelectedMealInfo() {
		return this.selectedMealInfo;
	}
	public void setSelectedMealInfo(List<SelectedMealInfo> selectedMealInfo) {
		this.selectedMealInfo = selectedMealInfo;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemporaryDish() {
		return this.temporaryDish;
	}
	public void setTemporaryDish(String temporaryDish) {
		this.temporaryDish = temporaryDish;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
