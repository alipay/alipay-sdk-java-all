package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一键认证ETC订单创建
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:14:21
 */
public class AlipayCommerceTransportEtcCertifyorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8572634314241592353L;

	/**
	 * 车辆类型
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 办理人所在地城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * false:不需要用户上传行驶证图片
true:需要用户上传行驶证图片
	 */
	@ApiField("license_img_required_flag")
	private Boolean licenseImgRequiredFlag;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 办理车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 办理车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 参数需要咨询业务同学,车系品牌id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 支付宝侧发行方编码,咨询业务获取
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 参数需要咨询业务同学，需预先分配后才可上送，否则会导致传入失败
	 */
	@ApiField("veh_biz_scene")
	private String vehBizScene;

	/**
	 * 车辆发动机号
	 */
	@ApiField("vi_license_engine")
	private String viLicenseEngine;

	/**
	 * 行驶证信息-车辆识别号
	 */
	@ApiField("vi_license_vin")
	private String viLicenseVin;

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Boolean getLicenseImgRequiredFlag() {
		return this.licenseImgRequiredFlag;
	}
	public void setLicenseImgRequiredFlag(Boolean licenseImgRequiredFlag) {
		this.licenseImgRequiredFlag = licenseImgRequiredFlag;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVehBizScene() {
		return this.vehBizScene;
	}
	public void setVehBizScene(String vehBizScene) {
		this.vehBizScene = vehBizScene;
	}

	public String getViLicenseEngine() {
		return this.viLicenseEngine;
	}
	public void setViLicenseEngine(String viLicenseEngine) {
		this.viLicenseEngine = viLicenseEngine;
	}

	public String getViLicenseVin() {
		return this.viLicenseVin;
	}
	public void setViLicenseVin(String viLicenseVin) {
		this.viLicenseVin = viLicenseVin;
	}

}
