package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝二手车订单同步
 *
 * @author auto create
 * @since 1.0, 2025-12-18 17:11:46
 */
public class AlipayCommerceTransportCarsaleBtoborderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4785456174992935211L;

	/**
	 * 城市编码，买家城市编码
	 */
	@ApiField("buy_city_code")
	private String buyCityCode;

	/**
	 * 买家手机号
	 */
	@ApiField("buy_mobile_no")
	private String buyMobileNo;

	/**
	 * 车源城市编码
	 */
	@ApiField("car_city_code")
	private String carCityCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额;单位分
	 */
	@ApiField("order_amount")
	private Long orderAmount;

	/**
	 * 车生活orderNo， 修改订单时候， 必传。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 已收金额；单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 支付方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 二级商户id
	 */
	@ApiField("second_pid")
	private String secondPid;

	/**
	 * 卖家手机号
	 */
	@ApiField("sell_mobile_no")
	private String sellMobileNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("sell_open_id")
	private String sellOpenId;

	/**
	 * 卖方uid, 支付宝uid
	 */
	@ApiField("sell_user_id")
	private String sellUserId;

	/**
	 * 待收金额；单位分
	 */
	@ApiField("unpay_amount")
	private Long unpayAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车辆信息
	 */
	@ApiField("vehicle_info")
	private CarSaleVehicleInfoDTO vehicleInfo;

	/**
	 * vin码
	 */
	@ApiField("vin")
	private String vin;

	public String getBuyCityCode() {
		return this.buyCityCode;
	}
	public void setBuyCityCode(String buyCityCode) {
		this.buyCityCode = buyCityCode;
	}

	public String getBuyMobileNo() {
		return this.buyMobileNo;
	}
	public void setBuyMobileNo(String buyMobileNo) {
		this.buyMobileNo = buyMobileNo;
	}

	public String getCarCityCode() {
		return this.carCityCode;
	}
	public void setCarCityCode(String carCityCode) {
		this.carCityCode = carCityCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
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

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getSecondPid() {
		return this.secondPid;
	}
	public void setSecondPid(String secondPid) {
		this.secondPid = secondPid;
	}

	public String getSellMobileNo() {
		return this.sellMobileNo;
	}
	public void setSellMobileNo(String sellMobileNo) {
		this.sellMobileNo = sellMobileNo;
	}

	public String getSellOpenId() {
		return this.sellOpenId;
	}
	public void setSellOpenId(String sellOpenId) {
		this.sellOpenId = sellOpenId;
	}

	public String getSellUserId() {
		return this.sellUserId;
	}
	public void setSellUserId(String sellUserId) {
		this.sellUserId = sellUserId;
	}

	public Long getUnpayAmount() {
		return this.unpayAmount;
	}
	public void setUnpayAmount(Long unpayAmount) {
		this.unpayAmount = unpayAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public CarSaleVehicleInfoDTO getVehicleInfo() {
		return this.vehicleInfo;
	}
	public void setVehicleInfo(CarSaleVehicleInfoDTO vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
