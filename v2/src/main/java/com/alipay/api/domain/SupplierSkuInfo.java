package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链商品同步信息:增加商品上架业务渠道编码
 *
 * @author auto create
 * @since 1.0, 2023-12-08 13:48:41
 */
public class SupplierSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 4877395662695422725L;

	/**
	 * 商品属性集合{"WEIGHT": "100丝","SIZE": "120mm*170mm","SELECTSIDED": "单面"}
	 */
	@ApiListField("attr_collect")
	@ApiField("supplier_item_attr_field")
	private List<SupplierItemAttrField> attrCollect;

	/**
	 * 商品条形码
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * 是否需要批次管理(Y是N否 ;默认为N)
	 */
	@ApiField("batch_mgmt_flag")
	private String batchMgmtFlag;

	/**
	 * 品牌代码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商品类别Id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品类别名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 是否易碎品, Y/N (默认为N)
	 */
	@ApiField("fragile_flag")
	private String fragileFlag;

	/**
	 * 是否易碎品, Y/N (默认为N)
	 */
	@ApiField("hazardous_flag")
	private String hazardousFlag;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 如果是上架到多个渠道，多个渠道编码之间用逗号隔开。
	 */
	@ApiField("item_listing_channels")
	private String itemListingChannels;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品类型 (ZC=正常商品, FX=分销商品, ZH=组合商品, ZP=赠品, BC=包材, HC=耗材, FL=辅料, XN=虚拟品, FS=附属品, CC=残次品, OTHER=其它) 只传英文编码
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 是否液体, Y/N, (默认为N)
	 */
	@ApiField("liquid_flag")
	private String liquidFlag;

	/**
	 * 保质期禁售天数(单位：天)
	 */
	@ApiField("lockup_lifecycle")
	private Long lockupLifecycle;

	/**
	 * 保质期禁收天数(单位：天)
	 */
	@ApiField("reject_lifecycle")
	private Long rejectLifecycle;

	/**
	 * 保质期 (单位：小时)
	 */
	@ApiField("shelf_life")
	private Long shelfLife;

	/**
	 * 是否需要保质期管理, Y/N (默认为N)
	 */
	@ApiField("shelf_life_mgmt_flag")
	private String shelfLifeMgmtFlag;

	/**
	 * 是否需要串号管理, Y/N (默认为N)
	 */
	@ApiField("snmgmt_flag")
	private String snmgmtFlag;

	public List<SupplierItemAttrField> getAttrCollect() {
		return this.attrCollect;
	}
	public void setAttrCollect(List<SupplierItemAttrField> attrCollect) {
		this.attrCollect = attrCollect;
	}

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBatchMgmtFlag() {
		return this.batchMgmtFlag;
	}
	public void setBatchMgmtFlag(String batchMgmtFlag) {
		this.batchMgmtFlag = batchMgmtFlag;
	}

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getFragileFlag() {
		return this.fragileFlag;
	}
	public void setFragileFlag(String fragileFlag) {
		this.fragileFlag = fragileFlag;
	}

	public String getHazardousFlag() {
		return this.hazardousFlag;
	}
	public void setHazardousFlag(String hazardousFlag) {
		this.hazardousFlag = hazardousFlag;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemListingChannels() {
		return this.itemListingChannels;
	}
	public void setItemListingChannels(String itemListingChannels) {
		this.itemListingChannels = itemListingChannels;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getLiquidFlag() {
		return this.liquidFlag;
	}
	public void setLiquidFlag(String liquidFlag) {
		this.liquidFlag = liquidFlag;
	}

	public Long getLockupLifecycle() {
		return this.lockupLifecycle;
	}
	public void setLockupLifecycle(Long lockupLifecycle) {
		this.lockupLifecycle = lockupLifecycle;
	}

	public Long getRejectLifecycle() {
		return this.rejectLifecycle;
	}
	public void setRejectLifecycle(Long rejectLifecycle) {
		this.rejectLifecycle = rejectLifecycle;
	}

	public Long getShelfLife() {
		return this.shelfLife;
	}
	public void setShelfLife(Long shelfLife) {
		this.shelfLife = shelfLife;
	}

	public String getShelfLifeMgmtFlag() {
		return this.shelfLifeMgmtFlag;
	}
	public void setShelfLifeMgmtFlag(String shelfLifeMgmtFlag) {
		this.shelfLifeMgmtFlag = shelfLifeMgmtFlag;
	}

	public String getSnmgmtFlag() {
		return this.snmgmtFlag;
	}
	public void setSnmgmtFlag(String snmgmtFlag) {
		this.snmgmtFlag = snmgmtFlag;
	}

}
