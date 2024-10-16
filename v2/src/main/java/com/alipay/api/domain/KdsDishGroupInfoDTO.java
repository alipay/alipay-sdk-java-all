package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品信息(与KdsDishInfoDTO相比, 仅缺一个dishGroupInfo字段, 增加一个out_parent_id字段)
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:58
 */
public class KdsDishGroupInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3374995663527976423L;

	/**
	 * 菜品制作耗时，单位分钟
	 */
	@ApiField("cook_cost")
	private Long cookCost;

	/**
	 * 口碑菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 口碑菜品skuID
	 */
	@ApiField("dish_sku_id")
	private String dishSkuId;

	/**
	 * 菜品时间：非预约单是接单时间，预约单是预约时间
	 */
	@ApiField("dish_time")
	private Date dishTime;

	/**
	 * 菜品单位
	 */
	@ApiField("dish_unit")
	private String dishUnit;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 菜品一次性可制作最大份数
	 */
	@ApiField("max_cook_num")
	private Long maxCookNum;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部菜品ID
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部菜品信息(JSON格式)
	 */
	@ApiField("out_dish_info")
	private String outDishInfo;

	/**
	 * 外部菜品skuID
	 */
	@ApiField("out_dish_sku_id")
	private String outDishSkuId;

	/**
	 * 加料的归属菜的out_dish_id. 备注: 仅套餐子菜加料需要, 单菜加料不需要填写.
	 */
	@ApiField("out_parent_id")
	private String outParentId;

	/**
	 * 做法描述
	 */
	@ApiField("practice_desc")
	private String practiceDesc;

	/**
	 * 做法ID
	 */
	@ApiField("practice_id")
	private String practiceId;

	/**
	 * 菜品数量（注意，此处的数量是指一份套餐下，子菜的数量，不需要乘以套餐的份数，单品加料同理）
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 销售属性(预留字段)
	 */
	@ApiField("sales_properties")
	private String salesProperties;

	/**
	 * sku规格描述
	 */
	@ApiField("sku_spec_desc")
	private String skuSpecDesc;

	/**
	 * 规格ID
	 */
	@ApiField("spec_id")
	private String specId;

	/**
	 * 菜品类型. "SINGLE": 单品; "SIDE": 加料; "COMBO": 套餐"; "COMBO_SINGLE": 套餐内单品

type 校验规则:
1. 单品/加料 type=SINGLE/SIDE
2. 套餐: 一级type=COMBO, dish_group_info里的子菜type=COMBO_SINGLE
3. 无法同步到口碑的套餐 (只能打平后同步). type=COMBO_SINGLE
	 */
	@ApiField("type")
	private String type;

	public Long getCookCost() {
		return this.cookCost;
	}
	public void setCookCost(Long cookCost) {
		this.cookCost = cookCost;
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

	public String getDishSkuId() {
		return this.dishSkuId;
	}
	public void setDishSkuId(String dishSkuId) {
		this.dishSkuId = dishSkuId;
	}

	public Date getDishTime() {
		return this.dishTime;
	}
	public void setDishTime(Date dishTime) {
		this.dishTime = dishTime;
	}

	public String getDishUnit() {
		return this.dishUnit;
	}
	public void setDishUnit(String dishUnit) {
		this.dishUnit = dishUnit;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getMaxCookNum() {
		return this.maxCookNum;
	}
	public void setMaxCookNum(Long maxCookNum) {
		this.maxCookNum = maxCookNum;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutDishInfo() {
		return this.outDishInfo;
	}
	public void setOutDishInfo(String outDishInfo) {
		this.outDishInfo = outDishInfo;
	}

	public String getOutDishSkuId() {
		return this.outDishSkuId;
	}
	public void setOutDishSkuId(String outDishSkuId) {
		this.outDishSkuId = outDishSkuId;
	}

	public String getOutParentId() {
		return this.outParentId;
	}
	public void setOutParentId(String outParentId) {
		this.outParentId = outParentId;
	}

	public String getPracticeDesc() {
		return this.practiceDesc;
	}
	public void setPracticeDesc(String practiceDesc) {
		this.practiceDesc = practiceDesc;
	}

	public String getPracticeId() {
		return this.practiceId;
	}
	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSalesProperties() {
		return this.salesProperties;
	}
	public void setSalesProperties(String salesProperties) {
		this.salesProperties = salesProperties;
	}

	public String getSkuSpecDesc() {
		return this.skuSpecDesc;
	}
	public void setSkuSpecDesc(String skuSpecDesc) {
		this.skuSpecDesc = skuSpecDesc;
	}

	public String getSpecId() {
		return this.specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
