package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车对外开票申请
 *
 * @author auto create
 * @since 1.0, 2026-10-26 14:22:59
 */
public class AlipayCommerceTransportTaxiTripinvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6529544473411127383L;

	/**
	 * 购买方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/**
	 * 购买方开户行及账号
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/**
	 * 发票抬头名称(购买方名称)，不传默认"个人"
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 购买方税号(企业抬头时使用)
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 城市编码，如 330100
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 18 位身份证号，用于反查司机账号信息
	 */
	@ApiField("driver_id_card")
	private String driverIdCard;

	/**
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 支付宝订单号；无则传行程号，服务端生成 outerApplyId 占位
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 接收发票的手机号，11 位
	 */
	@ApiField("passenger_phone")
	private String passengerPhone;

	/**
	 * 销方税号，15/18/20 位
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 抬头类型，不传按默认"个人"开票；CORPORATION 视为企业抬头，税号类型推导为营业执照
	 */
	@ApiField("title_type")
	private String titleType;

	/**
	 * 行程金额，精确到分，5200(表示 52.00 元)
	 */
	@ApiField("trip_amount")
	private String tripAmount;

	/**
	 * 行程到达地(写入开票 到达地)
	 */
	@ApiField("trip_end_location")
	private String tripEndLocation;

	/**
	 * 行程结束时间(毫秒时间戳，同时作为开票的 receivePay)
	 */
	@ApiField("trip_end_time")
	private String tripEndTime;

	/**
	 * 行程号，无 order_no 时作幂等键
	 */
	@ApiField("trip_id")
	private String tripId;

	/**
	 * 行程出发地(写入开票 出发地)
	 */
	@ApiField("trip_start_location")
	private String tripStartLocation;

	/**
	 * 行程开始时间(毫秒时间戳)
	 */
	@ApiField("trip_start_time")
	private String tripStartTime;

	public String getBuyerAddress() {
		return this.buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBuyerBankName() {
		return this.buyerBankName;
	}
	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDriverIdCard() {
		return this.driverIdCard;
	}
	public void setDriverIdCard(String driverIdCard) {
		this.driverIdCard = driverIdCard;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPassengerPhone() {
		return this.passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTitleType() {
		return this.titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getTripAmount() {
		return this.tripAmount;
	}
	public void setTripAmount(String tripAmount) {
		this.tripAmount = tripAmount;
	}

	public String getTripEndLocation() {
		return this.tripEndLocation;
	}
	public void setTripEndLocation(String tripEndLocation) {
		this.tripEndLocation = tripEndLocation;
	}

	public String getTripEndTime() {
		return this.tripEndTime;
	}
	public void setTripEndTime(String tripEndTime) {
		this.tripEndTime = tripEndTime;
	}

	public String getTripId() {
		return this.tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getTripStartLocation() {
		return this.tripStartLocation;
	}
	public void setTripStartLocation(String tripStartLocation) {
		this.tripStartLocation = tripStartLocation;
	}

	public String getTripStartTime() {
		return this.tripStartTime;
	}
	public void setTripStartTime(String tripStartTime) {
		this.tripStartTime = tripStartTime;
	}

}
