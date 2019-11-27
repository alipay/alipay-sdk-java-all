package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺菜品数据模型
 *
 * @author auto create
 * @since 1.0, 2017-06-12 10:56:42
 */
public class ShopDishModel extends AlipayObject {

	private static final long serialVersionUID = 2169976687965857953L;

	/**
	 * 菜品描述。  当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的quantity字段值。desc。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 商家菜品SKU 
 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的dishSkuList字段值。
	 */
	@ApiField("dish_sku_list")
	private String dishSkuList;

	/**
	 * 菜品分类ID
 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的dishTypeID字段值。
	 */
	@ApiField("dish_type_id")
	private String dishTypeId;

	/**
	 * 商家定义菜品的分类名称  当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的dishTypeName字段值。
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * 菜品名称
当前值来自于
alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的name字段值。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户的菜品ID，数据的计算根据：alipay.offline.provider.shopaction.record接口中插入菜品与alipay.offline.provider.useraction.record上传用户点菜菜单作为元数据，通过分析得到的数据。当前的ID就是插入菜品中的outerDishId。
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 废弃，请ISV使用自己的图
	 */
	@ApiField("pict")
	private String pict;

	/**
	 * 平台类型 (二维火、Mike)
当前值来自于alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品 的outer_shop_do对象里面的 type字段。
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 价格 当前值来自于
alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的price字段值。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 菜品库存。
当前值来自于
alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的quantity字段值。
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 是否销售完 0 在销售  1 已经售完
 当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的soldOut字段值。
	 */
	@ApiField("sold_out")
	private Long soldOut;

	/**
	 * 菜品排序值。  当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的sort字段值。
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 店铺菜品的状态 -1删除 0 正常
当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的status字段值。
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 菜品显示的单位（份/斤/杯）  当前值来自于 alipay.offline.provider.shopaction.record商户操作行为接口中插入菜品信息 的action_detail对象里的quantity字段值。unit，
	 */
	@ApiField("unit")
	private String unit;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDishSkuList() {
		return this.dishSkuList;
	}
	public void setDishSkuList(String dishSkuList) {
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

	public String getPict() {
		return this.pict;
	}
	public void setPict(String pict) {
		this.pict = pict;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getSoldOut() {
		return this.soldOut;
	}
	public void setSoldOut(Long soldOut) {
		this.soldOut = soldOut;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
