package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝饿了么联营活动报名
 *
 * @author auto create
 * @since 1.0, 2025-07-18 19:46:04
 */
public class AntMerchantExpandAeactivityPlatformSignupModel extends AlipayObject {

	private static final long serialVersionUID = 8469565476549633978L;

	/**
	 * 点餐码url
	 */
	@ApiField("catering_url")
	private String cateringUrl;

	/**
	 * 饿了么门店地址
	 */
	@ApiField("ele_address")
	private String eleAddress;

	/**
	 * 饿了么门店品牌id
	 */
	@ApiField("ele_brand_id")
	private String eleBrandId;

	/**
	 * 饿了么门店品牌名称
	 */
	@ApiField("ele_brand_name")
	private String eleBrandName;

	/**
	 * 饿了么门店一级类目
	 */
	@ApiField("ele_category_1")
	private String eleCategory1;

	/**
	 * 饿了么门店二级类目
	 */
	@ApiField("ele_category_2")
	private String eleCategory2;

	/**
	 * 饿了么门店纬度
	 */
	@ApiField("ele_latitude")
	private String eleLatitude;

	/**
	 * 门店经度
	 */
	@ApiField("ele_longitude")
	private String eleLongitude;

	/**
	 * 饿了么门店门头照url，需要是永久可用的图片公网链接
	 */
	@ApiField("ele_outdoor_pic_url")
	private String eleOutdoorPicUrl;

	/**
	 * 饿了么门店联系电话/手机号
	 */
	@ApiField("ele_phone")
	private String elePhone;

	/**
	 * 饿了么门店名称
	 */
	@ApiField("ele_shop_name")
	private String eleShopName;

	/**
	 * 饿了么门店shopid
	 */
	@ApiField("ele_shopid")
	private String eleShopid;

	/**
	 * 饿了么门店扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("shop_ext_info")
	private List<ShopExtInfo> extInfo;

	/**
	 * 设备sn码
	 */
	@ApiField("sn_code")
	private String snCode;

	public String getCateringUrl() {
		return this.cateringUrl;
	}
	public void setCateringUrl(String cateringUrl) {
		this.cateringUrl = cateringUrl;
	}

	public String getEleAddress() {
		return this.eleAddress;
	}
	public void setEleAddress(String eleAddress) {
		this.eleAddress = eleAddress;
	}

	public String getEleBrandId() {
		return this.eleBrandId;
	}
	public void setEleBrandId(String eleBrandId) {
		this.eleBrandId = eleBrandId;
	}

	public String getEleBrandName() {
		return this.eleBrandName;
	}
	public void setEleBrandName(String eleBrandName) {
		this.eleBrandName = eleBrandName;
	}

	public String getEleCategory1() {
		return this.eleCategory1;
	}
	public void setEleCategory1(String eleCategory1) {
		this.eleCategory1 = eleCategory1;
	}

	public String getEleCategory2() {
		return this.eleCategory2;
	}
	public void setEleCategory2(String eleCategory2) {
		this.eleCategory2 = eleCategory2;
	}

	public String getEleLatitude() {
		return this.eleLatitude;
	}
	public void setEleLatitude(String eleLatitude) {
		this.eleLatitude = eleLatitude;
	}

	public String getEleLongitude() {
		return this.eleLongitude;
	}
	public void setEleLongitude(String eleLongitude) {
		this.eleLongitude = eleLongitude;
	}

	public String getEleOutdoorPicUrl() {
		return this.eleOutdoorPicUrl;
	}
	public void setEleOutdoorPicUrl(String eleOutdoorPicUrl) {
		this.eleOutdoorPicUrl = eleOutdoorPicUrl;
	}

	public String getElePhone() {
		return this.elePhone;
	}
	public void setElePhone(String elePhone) {
		this.elePhone = elePhone;
	}

	public String getEleShopName() {
		return this.eleShopName;
	}
	public void setEleShopName(String eleShopName) {
		this.eleShopName = eleShopName;
	}

	public String getEleShopid() {
		return this.eleShopid;
	}
	public void setEleShopid(String eleShopid) {
		this.eleShopid = eleShopid;
	}

	public List<ShopExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ShopExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getSnCode() {
		return this.snCode;
	}
	public void setSnCode(String snCode) {
		this.snCode = snCode;
	}

}
