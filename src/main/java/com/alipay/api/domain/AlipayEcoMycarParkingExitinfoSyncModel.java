package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶出上送接口
 *
 * @author auto create
 * @since 1.0, 2022-06-20 15:10:00
 */
public class AlipayEcoMycarParkingExitinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1854527897433296917L;

	/**
	 * 实际金额
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 车牌颜色，枚举支持：
*BLUE：蓝。
*GREEN：绿。
*YELLOW：黄。
*WHITE：白。
*BLACK：黑。
*LIMEGREEN：黄绿色。
	 */
	@ApiField("car_color")
	private String carColor;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 折扣金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 用于识别车辆出口，多出入口车场适用
	 */
	@ApiField("exit_id")
	private String exitId;

	/**
	 * 是否加密，默认为false
	 */
	@ApiField("is_encrypt_car_number")
	private Boolean isEncryptCarNumber;

	/**
	 * 智能助理当前的跳转链接
	 */
	@ApiField("isv_url")
	private String isvUrl;

	/**
	 * 订单总金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 外部停车流水号(用于串通进场与出场信息)
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 车辆离场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 <a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程。通过 <a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.enterinfo.sync">alipay.eco.mycar.parking.enterinfo.sync</a>(车辆驶入接口)接口获取。
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 用于标识车辆停放车位编号，路侧适用
	 */
	@ApiField("space_number")
	private String spaceNumber;

	/**
	 * 与parking_id对应的外部停车场编号，在门店中维护
	 */
	@ApiField("store_id")
	private String storeId;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getCarColor() {
		return this.carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getExitId() {
		return this.exitId;
	}
	public void setExitId(String exitId) {
		this.exitId = exitId;
	}

	public Boolean getIsEncryptCarNumber() {
		return this.isEncryptCarNumber;
	}
	public void setIsEncryptCarNumber(Boolean isEncryptCarNumber) {
		this.isEncryptCarNumber = isEncryptCarNumber;
	}

	public String getIsvUrl() {
		return this.isvUrl;
	}
	public void setIsvUrl(String isvUrl) {
		this.isvUrl = isvUrl;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public String getOutTime() {
		return this.outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSpaceNumber() {
		return this.spaceNumber;
	}
	public void setSpaceNumber(String spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
