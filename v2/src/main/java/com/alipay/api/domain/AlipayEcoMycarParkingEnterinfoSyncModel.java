package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶入上送接口
 *
 * @author auto create
 * @since 1.0, 2022-08-19 16:49:42
 */
public class AlipayEcoMycarParkingEnterinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1242977133657561976L;

	/**
	 * 是否启用车牌代扣状态查询功能，true为启用，false为停用
	 */
	@ApiField("agreement_query")
	private Boolean agreementQuery;

	/**
	 * 车牌颜色，车牌颜色，枚举支持：
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
	 * 用于识别车辆进口，多出入口车场适用
	 */
	@ApiField("entrance_id")
	private String entranceId;

	/**
	 * 当前停车场的入场免费时长分钟数
	 */
	@ApiField("free_minutes")
	private Long freeMinutes;

	/**
	 * 车辆入场的时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 是否加密，默认为false
	 */
	@ApiField("is_encrypt_car_number")
	private Boolean isEncryptCarNumber;

	/**
	 * 智能助理当前的跳转链接。为ISV/<a href="https://opendocs.alipay.com/support/01rb18">商家小程序scheme地址</a>或H5页面地址。
	 */
	@ApiField("isv_url")
	private String isvUrl;

	/**
	 * 外部停车流水号(用于串通进场与出场信息)
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 <a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

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

	public Boolean getAgreementQuery() {
		return this.agreementQuery;
	}
	public void setAgreementQuery(Boolean agreementQuery) {
		this.agreementQuery = agreementQuery;
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

	public String getEntranceId() {
		return this.entranceId;
	}
	public void setEntranceId(String entranceId) {
		this.entranceId = entranceId;
	}

	public Long getFreeMinutes() {
		return this.freeMinutes;
	}
	public void setFreeMinutes(Long freeMinutes) {
		this.freeMinutes = freeMinutes;
	}

	public String getInTime() {
		return this.inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
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
