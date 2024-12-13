package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 盒子自建菜品查询时返回的模型
 *
 * @author auto create
 * @since 1.0, 2018-12-21 17:36:31
 */
public class PosDishQryModel extends AlipayObject {

	private static final long serialVersionUID = 7118347977399842143L;

	/**
	 * 菜品类别
	 */
	@ApiField("category_big_id")
	private String categoryBigId;

	/**
	 * 菜品类别中文名
	 */
	@ApiField("category_big_name")
	private String categoryBigName;

	/**
	 * 组合菜的列表
	 */
	@ApiListField("choose_dish_group_list")
	@ApiField("pos_dish_group_model")
	private List<PosDishGroupModel> chooseDishGroupList;

	/**
	 * 菜品的ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品图片素材库ID
	 */
	@ApiField("dish_img")
	private String dishImg;

	/**
	 * 菜品的名字
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 拼音助记码
	 */
	@ApiField("en_remember_code")
	private String enRememberCode;

	/**
	 * 固定菜列表
	 */
	@ApiListField("fixed_dish_group_list")
	@ApiField("pos_fixed_dish_group_model")
	private List<PosFixedDishGroupModel> fixedDishGroupList;

	/**
	 * 制作时长，单位：秒
	 */
	@ApiField("making_time")
	private Long makingTime;

	/**
	 * 配菜列表
	 */
	@ApiListField("material_list")
	@ApiField("pos_dish_material_model")
	private List<PosDishMaterialModel> materialList;

	/**
	 * 单次最大制作份数
	 */
	@ApiField("max_copies_per_time")
	private Long maxCopiesPerTime;

	/**
	 * 最小份数
	 */
	@ApiField("min_serving")
	private Long minServing;

	/**
	 * 数字助记码
	 */
	@ApiField("nb_remember_code")
	private String nbRememberCode;

	/**
	 * 菜品做法列表
	 */
	@ApiListField("practice_list")
	@ApiField("pos_dish_practice_model")
	private List<PosDishPracticeModel> practiceList;

	/**
	 * 菜品描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("pos_sku_model")
	private List<PosSkuModel> skuList;

	/**
	 * 档口列表
	 */
	@ApiListField("stall_list")
	@ApiField("pos_stall_model")
	private List<PosStallModel> stallList;

	/**
	 * 菜品的售卖状态
open 起售
stop 停售
	 */
	@ApiField("status")
	private String status;

	/**
	 * 菜品标签
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 菜品大类
	 */
	@ApiField("type_big")
	private String typeBig;

	/**
	 * 菜品小类
	 */
	@ApiField("type_small")
	private String typeSmall;

	/**
	 * 菜品单位
	 */
	@ApiField("unit_name")
	private String unitName;

	public String getCategoryBigId() {
		return this.categoryBigId;
	}
	public void setCategoryBigId(String categoryBigId) {
		this.categoryBigId = categoryBigId;
	}

	public String getCategoryBigName() {
		return this.categoryBigName;
	}
	public void setCategoryBigName(String categoryBigName) {
		this.categoryBigName = categoryBigName;
	}

	public List<PosDishGroupModel> getChooseDishGroupList() {
		return this.chooseDishGroupList;
	}
	public void setChooseDishGroupList(List<PosDishGroupModel> chooseDishGroupList) {
		this.chooseDishGroupList = chooseDishGroupList;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishImg() {
		return this.dishImg;
	}
	public void setDishImg(String dishImg) {
		this.dishImg = dishImg;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getEnRememberCode() {
		return this.enRememberCode;
	}
	public void setEnRememberCode(String enRememberCode) {
		this.enRememberCode = enRememberCode;
	}

	public List<PosFixedDishGroupModel> getFixedDishGroupList() {
		return this.fixedDishGroupList;
	}
	public void setFixedDishGroupList(List<PosFixedDishGroupModel> fixedDishGroupList) {
		this.fixedDishGroupList = fixedDishGroupList;
	}

	public Long getMakingTime() {
		return this.makingTime;
	}
	public void setMakingTime(Long makingTime) {
		this.makingTime = makingTime;
	}

	public List<PosDishMaterialModel> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<PosDishMaterialModel> materialList) {
		this.materialList = materialList;
	}

	public Long getMaxCopiesPerTime() {
		return this.maxCopiesPerTime;
	}
	public void setMaxCopiesPerTime(Long maxCopiesPerTime) {
		this.maxCopiesPerTime = maxCopiesPerTime;
	}

	public Long getMinServing() {
		return this.minServing;
	}
	public void setMinServing(Long minServing) {
		this.minServing = minServing;
	}

	public String getNbRememberCode() {
		return this.nbRememberCode;
	}
	public void setNbRememberCode(String nbRememberCode) {
		this.nbRememberCode = nbRememberCode;
	}

	public List<PosDishPracticeModel> getPracticeList() {
		return this.practiceList;
	}
	public void setPracticeList(List<PosDishPracticeModel> practiceList) {
		this.practiceList = practiceList;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<PosSkuModel> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<PosSkuModel> skuList) {
		this.skuList = skuList;
	}

	public List<PosStallModel> getStallList() {
		return this.stallList;
	}
	public void setStallList(List<PosStallModel> stallList) {
		this.stallList = stallList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTypeBig() {
		return this.typeBig;
	}
	public void setTypeBig(String typeBig) {
		this.typeBig = typeBig;
	}

	public String getTypeSmall() {
		return this.typeSmall;
	}
	public void setTypeSmall(String typeSmall) {
		this.typeSmall = typeSmall;
	}

	public String getUnitName() {
		return this.unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

}
