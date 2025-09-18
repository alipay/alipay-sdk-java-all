package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店基础信息
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:36
 */
public class StoreInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5682236414594755492L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店经营品类,多值使用逗号分隔；
	 */
	@ApiField("business_category")
	private String businessCategory;

	/**
	 * 门店营业时间
	 */
	@ApiField("business_dates")
	private BusinessDateDTO businessDates;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_tel")
	private String contactTel;

	/**
	 * 配送类型
	 */
	@ApiField("delivery_way")
	private String deliveryWay;

	/**
	 * 环境图URL列表
	 */
	@ApiListField("env_img_list")
	@ApiField("string")
	private List<String> envImgList;

	/**
	 * 门脸图URL
	 */
	@ApiField("facade_img")
	private String facadeImg;

	/**
	 * 门店创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 门店最近一次更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 门店维度，最高精确到小数点后6位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店经度，最高精确到小数点后6位
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 医保国标编码
	 */
	@ApiField("mi_code")
	private String miCode;

	/**
	 * 医保国标名称
	 */
	@ApiField("mi_name")
	private String miName;

	/**
	 * 门店能否使用医保的状态
	 */
	@ApiField("mi_state")
	private String miState;

	/**
	 * 门店营业状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 门店LOGOURL
	 */
	@ApiField("store_logo")
	private String storeLogo;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessCategory() {
		return this.businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public BusinessDateDTO getBusinessDates() {
		return this.businessDates;
	}
	public void setBusinessDates(BusinessDateDTO businessDates) {
		this.businessDates = businessDates;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getContactTel() {
		return this.contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getDeliveryWay() {
		return this.deliveryWay;
	}
	public void setDeliveryWay(String deliveryWay) {
		this.deliveryWay = deliveryWay;
	}

	public List<String> getEnvImgList() {
		return this.envImgList;
	}
	public void setEnvImgList(List<String> envImgList) {
		this.envImgList = envImgList;
	}

	public String getFacadeImg() {
		return this.facadeImg;
	}
	public void setFacadeImg(String facadeImg) {
		this.facadeImg = facadeImg;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMiCode() {
		return this.miCode;
	}
	public void setMiCode(String miCode) {
		this.miCode = miCode;
	}

	public String getMiName() {
		return this.miName;
	}
	public void setMiName(String miName) {
		this.miName = miName;
	}

	public String getMiState() {
		return this.miState;
	}
	public void setMiState(String miState) {
		this.miState = miState;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreLogo() {
		return this.storeLogo;
	}
	public void setStoreLogo(String storeLogo) {
		this.storeLogo = storeLogo;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
