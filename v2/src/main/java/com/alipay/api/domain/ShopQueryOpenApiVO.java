package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店分页查询详情
 *
 * @author auto create
 * @since 1.0, 2024-04-02 10:47:55
 */
public class ShopQueryOpenApiVO extends AlipayObject {

	private static final long serialVersionUID = 4722357372543238586L;

	/**
	 * 经营地址
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 店铺经营时间
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

	/**
	 * 店铺联系手机
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 店铺的联系固话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 新版门店类目标准二级类目code.类目标准及与原shop_category映射关系参见<a href="https://gw.alipayobjects.com/os/bmw-prod/4b3f82df-e53e-4b84-bc41-fe025101e726.xlsx">文档</a>
	 */
	@ApiField("new_shop_category")
	private String newShopCategory;

	/**
	 * 店铺类目.取值参见文件<a href="https://mif-pub.alipayobjects.com/ShopCategory.xlsx">文件</a>中的三级门店类目
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 蚂蚁店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 当前名称、地址、经纬度信息准确一致，可用于数字化经营场景消费
	 */
	@ApiField("shop_info_status")
	private String shopInfoStatus;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店状态
	 */
	@ApiField("shop_status")
	private String shopStatus;

	/**
	 * 店铺经营类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	public AddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public List<ShopBusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<ShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getNewShopCategory() {
		return this.newShopCategory;
	}
	public void setNewShopCategory(String newShopCategory) {
		this.newShopCategory = newShopCategory;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopInfoStatus() {
		return this.shopInfoStatus;
	}
	public void setShopInfoStatus(String shopInfoStatus) {
		this.shopInfoStatus = shopInfoStatus;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopStatus() {
		return this.shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
