package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景服务修改
 *
 * @author auto create
 * @since 1.0, 2020-06-16 16:13:38
 */
public class AntMerchantExpandStoreShopserviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8217163212768379959L;

	/**
	 * true/false, 是否有效，默认为true
	 */
	@ApiField("is_valid")
	private Boolean isValid;

	/**
	 * 测试的场景服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商家接收通知的手机号
	 */
	@ApiField("notify_phone")
	private String notifyPhone;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 具体描述预约的业务场景
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * 线下门店的服务项目列表
	 */
	@ApiListField("service_items")
	@ApiField("shop_service_item")
	private List<ShopServiceItem> serviceItems;

	/**
	 * 服务时间信息
	 */
	@ApiField("service_time")
	private ServiceTimeInfo serviceTime;

	/**
	 * 线下门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 场景服务ID
	 */
	@ApiField("shop_service_id")
	private String shopServiceId;

	/**
	 * 服务人员
	 */
	@ApiListField("shop_staffs")
	@ApiField("shop_staff_info")
	private List<ShopStaffInfo> shopStaffs;

	/**
	 * 规格ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 线上店的ID
	 */
	@ApiField("store_open_id")
	private String storeOpenId;

	public Boolean getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNotifyPhone() {
		return this.notifyPhone;
	}
	public void setNotifyPhone(String notifyPhone) {
		this.notifyPhone = notifyPhone;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public List<ShopServiceItem> getServiceItems() {
		return this.serviceItems;
	}
	public void setServiceItems(List<ShopServiceItem> serviceItems) {
		this.serviceItems = serviceItems;
	}

	public ServiceTimeInfo getServiceTime() {
		return this.serviceTime;
	}
	public void setServiceTime(ServiceTimeInfo serviceTime) {
		this.serviceTime = serviceTime;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopServiceId() {
		return this.shopServiceId;
	}
	public void setShopServiceId(String shopServiceId) {
		this.shopServiceId = shopServiceId;
	}

	public List<ShopStaffInfo> getShopStaffs() {
		return this.shopStaffs;
	}
	public void setShopStaffs(List<ShopStaffInfo> shopStaffs) {
		this.shopStaffs = shopStaffs;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStoreOpenId() {
		return this.storeOpenId;
	}
	public void setStoreOpenId(String storeOpenId) {
		this.storeOpenId = storeOpenId;
	}

}
