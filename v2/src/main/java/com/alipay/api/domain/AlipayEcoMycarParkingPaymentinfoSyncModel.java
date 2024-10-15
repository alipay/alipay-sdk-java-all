package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆停车缴费接口
 *
 * @author auto create
 * @since 1.0, 2022-06-23 11:35:43
 */
public class AlipayEcoMycarParkingPaymentinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5843952559418995681L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 停车消息透出后，消息详情的落地承接页链接，可配置ISV维度的统一值
	 */
	@ApiField("isv_url")
	private String isvUrl;

	/**
	 * 外部业务停车流水号(用于串通进场与出场信息)。如果
out_serial_no与serial_no都传递，则一起校验。
● serial_no与out_serial_no二选一必填。
● 入参有serial_no和out_serial_no，则优先根据serial_no和out_serial_no一起匹配进出场事件
● 入参仅有serial_no，则优先根据serial_no匹配进出场事件
● 入参仅有out_serial_no，则根据out_serial_no匹配进出场事件
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 停车场内缴费后，允许出场的免费时长分钟数
	 */
	@ApiField("payment_free_minutes")
	private Long paymentFreeMinutes;

	/**
	 * 场内缴费时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，场内缴费不应晚于当前网络时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/**
	 * 支付宝业务流水号(用于串通进场与出场信息)。可通过 alipay.eco.mycar.parking.enterinfo.sync
(车辆驶入接口)接口获取。
● serial_no与out_serial_no二选一必填。
● 入参有serial_no和out_serial_no，则优先根据serial_no和out_serial_no一起匹配进出场事件
● 入参仅有serial_no，则优先根据serial_no匹配进出场事件
● 入参仅有out_serial_no，则根据out_serial_no匹配进出场事件
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getIsvUrl() {
		return this.isvUrl;
	}
	public void setIsvUrl(String isvUrl) {
		this.isvUrl = isvUrl;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public Long getPaymentFreeMinutes() {
		return this.paymentFreeMinutes;
	}
	public void setPaymentFreeMinutes(Long paymentFreeMinutes) {
		this.paymentFreeMinutes = paymentFreeMinutes;
	}

	public String getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
