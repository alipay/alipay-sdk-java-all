package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理申请单信息同步
 *
 * @author auto create
 * @since 1.0, 2022-06-24 19:41:59
 */
public class AlipayCommerceTransportEtcApplyorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6565658194848914138L;

	/**
	 * 支付宝ETC平台扣款协议号，与order_id参数 二选一。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 业务发生时间；对应order_status 几个状态的变更时间； 当order_status = DELIVERYED 时 biz_time 为物流发货时间；order_status = ACTIVATED时 biz_time为设备激活时间，以此类推
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 用户取消订单原因，在取消状态同步时必填
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 用户ETC卡号，激活状态时必传
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 审核不通过原因标准码，审核不通过时可以传递此标准码，域内将优先以标准码为准。
	 */
	@ApiField("censor_code")
	private String censorCode;

	/**
	 * 审核不通过原因， 审核不通过时必传
	 */
	@ApiField("censor_info")
	private String censorInfo;

	/**
	 * 已发货状态必传，物流公司编码，需要与菜鸟映射
	 */
	@ApiField("delivery_code")
	private String deliveryCode;

	/**
	 * 已发货状态必传，物流公司名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 已发货状态必传，物流单号
	 */
	@ApiField("delivery_no")
	private String deliveryNo;

	/**
	 * 用户ETC OBU号， 激活状态时必传
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 是否需要退款，该字段只有在取消状态同步时才会消费，其他状态不消费；取消状态同步时，该状态必传。
	 */
	@ApiField("need_refund")
	private Boolean needRefund;

	/**
	 * 支付宝侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态；
DELIVERYED：已发货；
RECEIVED：已收货； 
CENSOR_PASS：审核通过； 
CENSOR_BLOCK：审核不通过 ；
ACTIVATED：已激活； 
UNMOUNTED：已注销； 
CANCEL：取消；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部业务号，对应用户该笔ETC申请单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 0：蓝； 1：黄； 2：黑； 3：白； 4：渐变绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 办理车牌
	 */
	@ApiField("plate_no")
	private String plateNo;

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

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCensorCode() {
		return this.censorCode;
	}
	public void setCensorCode(String censorCode) {
		this.censorCode = censorCode;
	}

	public String getCensorInfo() {
		return this.censorInfo;
	}
	public void setCensorInfo(String censorInfo) {
		this.censorInfo = censorInfo;
	}

	public String getDeliveryCode() {
		return this.deliveryCode;
	}
	public void setDeliveryCode(String deliveryCode) {
		this.deliveryCode = deliveryCode;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getDeliveryNo() {
		return this.deliveryNo;
	}
	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public Boolean getNeedRefund() {
		return this.needRefund;
	}
	public void setNeedRefund(Boolean needRefund) {
		this.needRefund = needRefund;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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
