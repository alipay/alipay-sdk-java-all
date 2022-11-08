package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理申请单创建或修改
 *
 * @author auto create
 * @since 1.0, 2022-09-14 17:09:13
 */
public class AlipayCommerceTransportEtcApplyorderCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 1663181713767572944L;

	/**
	 * 支付宝订单号，提供则认为是更新
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

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
	 * 发行方的标识ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 行驶证信息-核定载人数
	 */
	@ApiField("vi_license_apc")
	private String viLicenseApc;

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

	public String getViLicenseApc() {
		return this.viLicenseApc;
	}
	public void setViLicenseApc(String viLicenseApc) {
		this.viLicenseApc = viLicenseApc;
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
