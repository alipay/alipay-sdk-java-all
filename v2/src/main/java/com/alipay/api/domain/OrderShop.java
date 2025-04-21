package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备订单关联店铺信息
 *
 * @author auto create
 * @since 1.0, 2021-07-06 15:44:23
 */
public class OrderShop extends AlipayObject {

	private static final long serialVersionUID = 6135624656875197822L;

	/**
	 * 法人身份证
	 */
	@ApiField("legal_person_identity_card")
	private String legalPersonIdentityCard;

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
	 * 店铺行业,使用蚂蚁行业分类，可参考https://www.yuque.com/kangxia-ij2dr/kb/ybdoqb#ib45
注意：一级目录与行业使用"-"分隔
	 */
	@ApiField("shop_industry")
	private String shopIndustry;

	/**
	 * 店铺纬度
	 */
	@ApiField("shop_latitude")
	private String shopLatitude;

	/**
	 * 店铺营业执照照片
	 */
	@ApiField("shop_licence_photo")
	private String shopLicencePhoto;

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
	 * 店铺营业时间(时间范围 00:00-24:00 )
	 */
	@ApiField("shop_open_time")
	private String shopOpenTime;

	/**
	 * 店铺所在省
	 */
	@ApiField("shop_province")
	private String shopProvince;

	public String getLegalPersonIdentityCard() {
		return this.legalPersonIdentityCard;
	}
	public void setLegalPersonIdentityCard(String legalPersonIdentityCard) {
		this.legalPersonIdentityCard = legalPersonIdentityCard;
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

	public String getShopLicencePhoto() {
		return this.shopLicencePhoto;
	}
	public void setShopLicencePhoto(String shopLicencePhoto) {
		this.shopLicencePhoto = shopLicencePhoto;
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

}
