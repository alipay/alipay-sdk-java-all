package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 简化版菜品模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:13:29
 */
public class KbdishSimplyInfo extends AlipayObject {

	private static final long serialVersionUID = 6483846219941448625L;

	/**
	 * 加购描述
	 */
	@ApiField("add_remark")
	private String addRemark;

	/**
	 * 类目名称
	 */
	@ApiField("catetory_name")
	private String catetoryName;

	/**
	 * 类目的排序值
	 */
	@ApiField("catetory_sort")
	private String catetorySort;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 商品图片，需要先调用素材的图片上传api得到图片id
	 */
	@ApiField("dmg_img")
	private String dmgImg;

	/**
	 * 套餐组列表
	 */
	@ApiListField("group_list")
	@ApiField("kbdish_group_simplify_info")
	private List<KbdishGroupSimplifyInfo> groupList;

	/**
	 * 加料组列表
	 */
	@ApiListField("material_group_list")
	@ApiField("kbdish_material_simplify_info")
	private List<KbdishMaterialSimplifyInfo> materialGroupList;

	/**
	 * 起点份数，需要保证是数字类型
	 */
	@ApiField("min_serving")
	private String minServing;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 如果此菜专属某个门店设置此值，和shop_id二选一
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 属性列表
	 */
	@ApiListField("property_list")
	@ApiField("kbdish_property_simplify_info")
	private List<KbdishPropertySimplifyInfo> propertyList;

	/**
	 * 菜品描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("kbdish_sku_simplify_info")
	private List<KbdishSkuSimplifyInfo> skuList;

	/**
	 * 菜品状态，open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 副标题
	 */
	@ApiField("sub_name")
	private String subName;

	/**
	 * 菜品描述
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 菜品类型，口碑枚举定义 single:单品;packages：套餐
	 */
	@ApiField("type_big")
	private String typeBig;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	public String getAddRemark() {
		return this.addRemark;
	}
	public void setAddRemark(String addRemark) {
		this.addRemark = addRemark;
	}

	public String getCatetoryName() {
		return this.catetoryName;
	}
	public void setCatetoryName(String catetoryName) {
		this.catetoryName = catetoryName;
	}

	public String getCatetorySort() {
		return this.catetorySort;
	}
	public void setCatetorySort(String catetorySort) {
		this.catetorySort = catetorySort;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDmgImg() {
		return this.dmgImg;
	}
	public void setDmgImg(String dmgImg) {
		this.dmgImg = dmgImg;
	}

	public List<KbdishGroupSimplifyInfo> getGroupList() {
		return this.groupList;
	}
	public void setGroupList(List<KbdishGroupSimplifyInfo> groupList) {
		this.groupList = groupList;
	}

	public List<KbdishMaterialSimplifyInfo> getMaterialGroupList() {
		return this.materialGroupList;
	}
	public void setMaterialGroupList(List<KbdishMaterialSimplifyInfo> materialGroupList) {
		this.materialGroupList = materialGroupList;
	}

	public String getMinServing() {
		return this.minServing;
	}
	public void setMinServing(String minServing) {
		this.minServing = minServing;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public List<KbdishPropertySimplifyInfo> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<KbdishPropertySimplifyInfo> propertyList) {
		this.propertyList = propertyList;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<KbdishSkuSimplifyInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<KbdishSkuSimplifyInfo> skuList) {
		this.skuList = skuList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubName() {
		return this.subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
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

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
