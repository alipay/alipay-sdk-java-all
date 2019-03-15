package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单明细
 *
 * @author auto create
 * @since 1.0, 2018-07-06 14:47:25
 */
public class OrderItem extends AlipayObject {

	private static final long serialVersionUID = 3115338479916414825L;

	/**
	 * 店铺所在具体位置
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 店铺品类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 店铺所在的市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 订购的服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 订单联系人
	 */
	@ApiField("contacts")
	private String contacts;

	/**
	 * 门店创建人(已删除)
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 过期时间
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小程序APPID，订购实体为小程序的场景该字段必填
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序应用名称，订购实体为小程序的场景该字段必填
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 上架时间
	 */
	@ApiField("online_time")
	private String onlineTime;

	/**
	 * TO_DO-未实施,DOING-实施中,TO_CONFIRM-待商户确认,DONE-已完成,MERCHANT_REJECTED-商户已回绝,MERCHANT_CANCELLED-商户已取消,ISV_REJECTED-服务商已回绝,ISV_CANCELLED-服务商已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单所属人联系方式（手机或者座机）
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 店铺所在的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 店铺ID，订购实体为口碑门店的场景该字段必填
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称，订购实体为口碑门店的场景该字段必填
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺状态（ONLINE--已上架 OFFLINE--未上架 AVAILABLE--已开通 INIT--未开通 EXPIRED--已过期）
	 */
	@ApiField("shop_status")
	private String shopStatus;

	/**
	 * 待服务商接单
	 */
	@ApiField("status")
	private String status;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getContacts() {
		return this.contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppName() {
		return this.miniAppName;
	}
	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}

	public String getOnlineTime() {
		return this.onlineTime;
	}
	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
