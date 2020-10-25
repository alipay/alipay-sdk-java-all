package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品库新菜品同步接口
 *
 * @author auto create
 * @since 1.0, 2020-09-08 17:20:28
 */
public class KoubeiCateringDishCreatedishSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6586924541322296947L;

	/**
	 * 类目的名称，需要保证pid+分类名称唯一
	 */
	@ApiField("catetory_name")
	private String catetoryName;

	/**
	 * 分类自身的排序值，只支持数字类型，不传默认为1
	 */
	@ApiField("catetory_sort")
	private String catetorySort;

	/**
	 * 图片id
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
	 * 起点份数，只支持数字
	 */
	@ApiField("min_serving")
	private String minServing;

	/**
	 * 菜品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部门店id，如果当前菜品是门店菜，
口碑门店id和外部门店id二者必须有一必填
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
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 规格列表
	 */
	@ApiListField("sku_list")
	@ApiField("kbdish_sku_simplify_info")
	private List<KbdishSkuSimplifyInfo> skuList;

	/**
	 * 状态，open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 副标题
	 */
	@ApiField("sub_name")
	private String subName;

	/**
	 * 菜品标签，格式为json串：key =spicy标示辣度, value标示辣度值，0不辣；1微辣；2中辣；3重辣。 key=special标示特色标签；value标示特色标签值，0标示不设定；1招牌；2新品
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 口碑枚举定义 single:单品;packages：套餐
	 */
	@ApiField("type_big")
	private String typeBig;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
