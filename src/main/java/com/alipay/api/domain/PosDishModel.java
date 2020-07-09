package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自建盒子的菜品的模型
 *
 * @author auto create
 * @since 1.0, 2018-12-21 17:36:25
 */
public class PosDishModel extends AlipayObject {

	private static final long serialVersionUID = 4751757191813823777L;

	/**
	 * 菜品大类的ID，除了删除，其他情况必传
	 */
	@ApiField("category_big_id")
	private String categoryBigId;

	/**
	 * 组合菜的列表，如果是套餐，那这个必传
	 */
	@ApiListField("choose_dish_group_list")
	@ApiField("pos_choose_dish_group_model")
	private List<PosChooseDishGroupModel> chooseDishGroupList;

	/**
	 * 关联的菜谱的ID，一期的时候是必传的
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 创建者的ID，新建的时候必传
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 菜品的ID，更新和删除时候必传
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品图片ID，请使用素材库的ID
	 */
	@ApiField("dish_img")
	private String dishImg;

	/**
	 * 菜品的名字，除了删除，其他情况必传
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品SKU的列表，新增，更新套餐时候是必传的
删除时可以不传
	 */
	@ApiListField("dish_sku_list")
	@ApiField("pos_sku_model")
	private List<PosSkuModel> dishSkuList;

	/**
	 * 拼音助记码
	 */
	@ApiField("en_remember_code")
	private String enRememberCode;

	/**
	 * 套餐固定菜的列表，如果是套餐有固定菜，那就必传
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
	 * 配料的ID列表
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
	 * 最低起点份数，除了删除，其他情况必传
	 */
	@ApiField("min_serving")
	private Long minServing;

	/**
	 * 数字助记码
	 */
	@ApiField("nb_remember_code")
	private String nbRememberCode;

	/**
	 * 菜品做法的列表
	 */
	@ApiListField("practice_list")
	@ApiField("pos_dish_practice_model")
	private List<PosDishPracticeModel> practiceList;

	/**
	 * 菜品的描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 菜品售卖价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 打印档口的ID列表
	 */
	@ApiListField("stall_list")
	@ApiField("pos_stall_model")
	private List<PosStallModel> stallList;

	/**
	 * 菜品的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 操作的类型，add新增 update更新 del删除
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 标签只支持那两种
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 菜品类别single单品 packages套餐
除了删除，其他情况必传
	 */
	@ApiField("type_big")
	private String typeBig;

	/**
	 * fixed固定套餐 choose 组合套餐
如果是套餐类型，这个必传，删除时候，可以不传
	 */
	@ApiField("type_small")
	private String typeSmall;

	/**
	 * 菜品单位名称，除了删除，其他情况必传
	 */
	@ApiField("unit_name")
	private String unitName;

	/**
	 * 更新时候的用户，更新，删除操作必传
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getCategoryBigId() {
		return this.categoryBigId;
	}
	public void setCategoryBigId(String categoryBigId) {
		this.categoryBigId = categoryBigId;
	}

	public List<PosChooseDishGroupModel> getChooseDishGroupList() {
		return this.chooseDishGroupList;
	}
	public void setChooseDishGroupList(List<PosChooseDishGroupModel> chooseDishGroupList) {
		this.chooseDishGroupList = chooseDishGroupList;
	}

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
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

	public List<PosSkuModel> getDishSkuList() {
		return this.dishSkuList;
	}
	public void setDishSkuList(List<PosSkuModel> dishSkuList) {
		this.dishSkuList = dishSkuList;
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

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
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

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
