package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户合作设备信息变更
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:36
 */
public class AntMerchantExpandIotdeviceChangeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2274157466385515191L;

	/**
	 * 设备SN（不可变更，作为匹配对应信息主键）
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 记录创建时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/**
	 * 变更记录号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 政策类型：无政策(NO_POLICY),现金返佣(CASH_POLICY),屏幕共享(SHAREING_POLICY)
	 */
	@ApiField("policy_type")
	private String policyType;

	/**
	 * 结算支付宝账号：结算支付宝账号（商户）、结算支付宝账号（服务商）
	 */
	@ApiField("settled_alipay_id")
	private String settledAlipayId;

	/**
	 * 店铺所在详细地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 店铺所在市
	 */
	@ApiField("shop_city")
	private String shopCity;

	/**
	 * 店铺所在区/县
	 */
	@ApiField("shop_district")
	private String shopDistrict;

	/**
	 * 店铺行业,使用蚂蚁行业分类，可参考https://www.yuque.com/kangxia-ij2dr/kb/ybdoqb#ib45 注意：一级目录与行业使用"-"分隔
	 */
	@ApiField("shop_industry")
	private String shopIndustry;

	/**
	 * 店铺纬度
	 */
	@ApiField("shop_latitude")
	private String shopLatitude;

	/**
	 * 店铺联系人电话
	 */
	@ApiField("shop_linkman_mobile")
	private String shopLinkmanMobile;

	/**
	 * 店铺联系人
	 */
	@ApiField("shop_linkman_name")
	private String shopLinkmanName;

	/**
	 * 店铺经度
	 */
	@ApiField("shop_longitude")
	private String shopLongitude;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺营业时间(时间范围 00:00-24:00)
	 */
	@ApiField("shop_open_time")
	private String shopOpenTime;

	/**
	 * 店铺所在省
	 */
	@ApiField("shop_province")
	private String shopProvince;

	/**
	 * 签约支付宝PID（有效）(必须与原始设备签约账号一致
)
	 */
	@ApiField("signed_alipay_id")
	private String signedAlipayId;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public Date getGmtCreated() {
		return this.gmtCreated;
	}
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPolicyType() {
		return this.policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getSettledAlipayId() {
		return this.settledAlipayId;
	}
	public void setSettledAlipayId(String settledAlipayId) {
		this.settledAlipayId = settledAlipayId;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopCity() {
		return this.shopCity;
	}
	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopDistrict() {
		return this.shopDistrict;
	}
	public void setShopDistrict(String shopDistrict) {
		this.shopDistrict = shopDistrict;
	}

	public String getShopIndustry() {
		return this.shopIndustry;
	}
	public void setShopIndustry(String shopIndustry) {
		this.shopIndustry = shopIndustry;
	}

	public String getShopLatitude() {
		return this.shopLatitude;
	}
	public void setShopLatitude(String shopLatitude) {
		this.shopLatitude = shopLatitude;
	}

	public String getShopLinkmanMobile() {
		return this.shopLinkmanMobile;
	}
	public void setShopLinkmanMobile(String shopLinkmanMobile) {
		this.shopLinkmanMobile = shopLinkmanMobile;
	}

	public String getShopLinkmanName() {
		return this.shopLinkmanName;
	}
	public void setShopLinkmanName(String shopLinkmanName) {
		this.shopLinkmanName = shopLinkmanName;
	}

	public String getShopLongitude() {
		return this.shopLongitude;
	}
	public void setShopLongitude(String shopLongitude) {
		this.shopLongitude = shopLongitude;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopOpenTime() {
		return this.shopOpenTime;
	}
	public void setShopOpenTime(String shopOpenTime) {
		this.shopOpenTime = shopOpenTime;
	}

	public String getShopProvince() {
		return this.shopProvince;
	}
	public void setShopProvince(String shopProvince) {
		this.shopProvince = shopProvince;
	}

	public String getSignedAlipayId() {
		return this.signedAlipayId;
	}
	public void setSignedAlipayId(String signedAlipayId) {
		this.signedAlipayId = signedAlipayId;
	}

	public String getSupplierSn() {
		return this.supplierSn;
	}
	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}

}
