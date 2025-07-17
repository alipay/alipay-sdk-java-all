package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理申请单创建或修改
 *
 * @author auto create
 * @since 1.0, 2025-06-11 14:39:19
 */
public class AlipayCommerceTransportEtcApplyorderCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 7729866551317628168L;

	/**
	 * 支付宝订单号，提供则认为是更新
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 订单申请场景
	 */
	@ApiField("apply_scene")
	private String applyScene;

	/**
	 * 订单申请子场景
	 */
	@ApiField("apply_sub_scene")
	private String applySubScene;

	/**
	 * 参数需要咨询业务同学，需预先分配后才可上送，否则会导致传入失败
	 */
	@ApiField("bank_rule_id")
	private String bankRuleId;

	/**
	 * 车辆类型；
CAR：客车
TRUCK：货车
MOTO: 摩托车
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 办理人所在地城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 车辆总车轴数；
	 */
	@ApiField("number_of_axles")
	private String numberOfAxles;

	/**
	 * 蚂蚁会员统一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 审核资料提交状态。WAIT_SUBMIT：信息待提交；SUBMITTED：信息已提交。
	 */
	@ApiField("order_censor_status")
	private String orderCensorStatus;

	/**
	 * 支付状态。WAIT_PAY：待支付，PAYED：已支付。
	 */
	@ApiField("order_pay_status")
	private String orderPayStatus;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 办理车牌颜色
BLUE: 蓝色; 
YELLOW: 黄色; 
BLACK: 黑色; 
WHITE: 白色; 
GREEN: 绿色; 
LIMEGREEN: 黄绿色。
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
	 * 发行方的标识ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * ETC设备结算周期；
	 */
	@ApiField("settlement_cycle")
	private String settlementCycle;

	/**
	 * 支付宝ETC办理套餐code。
仅在创建订单时消费，更新订单时不消费。
创建订单：alipay_order_id为空；更新订单：alipay_order_id不为空。
	 */
	@ApiField("spu_code")
	private String spuCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 参数需要咨询业务同学，需预先分配后才可上送，否则会导致传入失败
	 */
	@ApiField("veh_biz_scene")
	private String vehBizScene;

	/**
	 * 行驶证信息-核定载人数
	 */
	@ApiField("vi_license_apc")
	private String viLicenseApc;

	/**
	 * ETC办理时，可提供行驶证图片以便审核。此处需要提供上传图片后得到图片ID。
	 */
	@ApiField("vi_license_back_img")
	private String viLicenseBackImg;

	/**
	 * 行驶证信息-品牌车型
	 */
	@ApiField("vi_license_brand_model")
	private String viLicenseBrandModel;

	/**
	 * 行驶证信息-车辆类型
	 */
	@ApiField("vi_license_car_type")
	private String viLicenseCarType;

	/**
	 * 行驶证信息-发动机号
	 */
	@ApiField("vi_license_engine")
	private String viLicenseEngine;

	/**
	 * ETC办理时，可提供行驶证图片以便审核。此处需要提供上传图片后得到图片ID。
	 */
	@ApiField("vi_license_front_img")
	private String viLicenseFrontImg;

	/**
	 * 行驶证信息-总质量
	 */
	@ApiField("vi_license_gross_mass")
	private String viLicenseGrossMass;

	/**
	 * 行驶证信息-发证时间
	 */
	@ApiField("vi_license_issue_date")
	private String viLicenseIssueDate;

	/**
	 * 行驶证信息-外廓尺寸
	 */
	@ApiField("vi_license_overall_dinmension")
	private String viLicenseOverallDinmension;

	/**
	 * 行驶证信息-车辆所有人
	 */
	@ApiField("vi_license_owner")
	private String viLicenseOwner;

	/**
	 * 行驶证信息-注册时间
	 */
	@ApiField("vi_license_register_date")
	private String viLicenseRegisterDate;

	/**
	 * 行驶证信息-整备质量
	 */
	@ApiField("vi_license_unladen_mass")
	private String viLicenseUnladenMass;

	/**
	 * 行驶证信息-使用性质：运营/非营运
	 */
	@ApiField("vi_license_use_type")
	private String viLicenseUseType;

	/**
	 * 行驶证信息-车辆识别号
	 */
	@ApiField("vi_license_vin")
	private String viLicenseVin;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getApplyScene() {
		return this.applyScene;
	}
	public void setApplyScene(String applyScene) {
		this.applyScene = applyScene;
	}

	public String getApplySubScene() {
		return this.applySubScene;
	}
	public void setApplySubScene(String applySubScene) {
		this.applySubScene = applySubScene;
	}

	public String getBankRuleId() {
		return this.bankRuleId;
	}
	public void setBankRuleId(String bankRuleId) {
		this.bankRuleId = bankRuleId;
	}

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

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getNumberOfAxles() {
		return this.numberOfAxles;
	}
	public void setNumberOfAxles(String numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderCensorStatus() {
		return this.orderCensorStatus;
	}
	public void setOrderCensorStatus(String orderCensorStatus) {
		this.orderCensorStatus = orderCensorStatus;
	}

	public String getOrderPayStatus() {
		return this.orderPayStatus;
	}
	public void setOrderPayStatus(String orderPayStatus) {
		this.orderPayStatus = orderPayStatus;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
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

	public String getSettlementCycle() {
		return this.settlementCycle;
	}
	public void setSettlementCycle(String settlementCycle) {
		this.settlementCycle = settlementCycle;
	}

	public String getSpuCode() {
		return this.spuCode;
	}
	public void setSpuCode(String spuCode) {
		this.spuCode = spuCode;
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

	public String getViLicenseApc() {
		return this.viLicenseApc;
	}
	public void setViLicenseApc(String viLicenseApc) {
		this.viLicenseApc = viLicenseApc;
	}

	public String getViLicenseBackImg() {
		return this.viLicenseBackImg;
	}
	public void setViLicenseBackImg(String viLicenseBackImg) {
		this.viLicenseBackImg = viLicenseBackImg;
	}

	public String getViLicenseBrandModel() {
		return this.viLicenseBrandModel;
	}
	public void setViLicenseBrandModel(String viLicenseBrandModel) {
		this.viLicenseBrandModel = viLicenseBrandModel;
	}

	public String getViLicenseCarType() {
		return this.viLicenseCarType;
	}
	public void setViLicenseCarType(String viLicenseCarType) {
		this.viLicenseCarType = viLicenseCarType;
	}

	public String getViLicenseEngine() {
		return this.viLicenseEngine;
	}
	public void setViLicenseEngine(String viLicenseEngine) {
		this.viLicenseEngine = viLicenseEngine;
	}

	public String getViLicenseFrontImg() {
		return this.viLicenseFrontImg;
	}
	public void setViLicenseFrontImg(String viLicenseFrontImg) {
		this.viLicenseFrontImg = viLicenseFrontImg;
	}

	public String getViLicenseGrossMass() {
		return this.viLicenseGrossMass;
	}
	public void setViLicenseGrossMass(String viLicenseGrossMass) {
		this.viLicenseGrossMass = viLicenseGrossMass;
	}

	public String getViLicenseIssueDate() {
		return this.viLicenseIssueDate;
	}
	public void setViLicenseIssueDate(String viLicenseIssueDate) {
		this.viLicenseIssueDate = viLicenseIssueDate;
	}

	public String getViLicenseOverallDinmension() {
		return this.viLicenseOverallDinmension;
	}
	public void setViLicenseOverallDinmension(String viLicenseOverallDinmension) {
		this.viLicenseOverallDinmension = viLicenseOverallDinmension;
	}

	public String getViLicenseOwner() {
		return this.viLicenseOwner;
	}
	public void setViLicenseOwner(String viLicenseOwner) {
		this.viLicenseOwner = viLicenseOwner;
	}

	public String getViLicenseRegisterDate() {
		return this.viLicenseRegisterDate;
	}
	public void setViLicenseRegisterDate(String viLicenseRegisterDate) {
		this.viLicenseRegisterDate = viLicenseRegisterDate;
	}

	public String getViLicenseUnladenMass() {
		return this.viLicenseUnladenMass;
	}
	public void setViLicenseUnladenMass(String viLicenseUnladenMass) {
		this.viLicenseUnladenMass = viLicenseUnladenMass;
	}

	public String getViLicenseUseType() {
		return this.viLicenseUseType;
	}
	public void setViLicenseUseType(String viLicenseUseType) {
		this.viLicenseUseType = viLicenseUseType;
	}

	public String getViLicenseVin() {
		return this.viLicenseVin;
	}
	public void setViLicenseVin(String viLicenseVin) {
		this.viLicenseVin = viLicenseVin;
	}

}
