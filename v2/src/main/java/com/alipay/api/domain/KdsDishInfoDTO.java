package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品信息
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:58
 */
public class KdsDishInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3739213251188758728L;

	/**
	 * 菜品制作耗时，单位分钟
	 */
	@ApiField("cook_cost")
	private Long cookCost;

	/**
	 * 菜品组信息：套餐内单品、单品加料
	 */
	@ApiListField("dish_group_info")
	@ApiField("kds_dish_group_info_d_t_o")
	private List<KdsDishGroupInfoDTO> dishGroupInfo;

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
	 * 菜品备注
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
	 * 菜品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 销售属性 (预留字段)
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

套餐/加料的type例子:
1. 普通菜加料:
一级SINGLE;
二级SIDE.
2. 套餐 子菜不加料:
一级COMBO;
二级COMBO_SINGLE.
3. 套餐 子菜加料:
一级COMBO;
二级COMBO_SINGLE 或 SIDE + out_parent_id.
	 */
	@ApiField("type")
	private String type;

	public Long getCookCost() {
		return this.cookCost;
	}
	public void setCookCost(Long cookCost) {
		this.cookCost = cookCost;
	}

	public List<KdsDishGroupInfoDTO> getDishGroupInfo() {
		return this.dishGroupInfo;
	}
	public void setDishGroupInfo(List<KdsDishGroupInfoDTO> dishGroupInfo) {
		this.dishGroupInfo = dishGroupInfo;
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
