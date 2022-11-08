package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康记录-记录上传
 *
 * @author auto create
 * @since 1.0, 2022-05-31 16:39:36
 */
public class AlipayInsSceneInshealthcareprodRecordUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2598562226175373367L;

	/**
	 * 小区号(16 进制字符串)
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 设备电量
	 */
	@ApiField("device_battery")
	private String deviceBattery;

	/**
	 * 设备SN码，唯一，用于唯一确定设备
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备用户，非唯一，用于区分设备的用户。
单用户设备(血糖仪、呼吸机)恒为 0000；多用户设备(血压计)中 A 用户为 0000；B 用户为 0001
	 */
	@ApiField("device_user")
	private String deviceUser;

	/**
	 * 基站号(16 进制字符串)
	 */
	@ApiField("lac")
	private String lac;

	/**
	 * 测量点：0 餐前; 1 餐后; 3 随机
	 */
	@ApiField("meal")
	private String meal;

	/**
	 * 测量时间，注意需要按照特定的时间格式。
yyyy-mm-dd  hh:mm:ss
	 */
	@ApiField("measure_time")
	private Date measureTime;

	/**
	 * 测量值，非唯一，表示测量得到的数据
	 */
	@ApiField("measure_value")
	private String measureValue;

	/**
	 * 移动基站 0，联通基站 1
	 */
	@ApiField("mnc")
	private String mnc;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getDeviceBattery() {
		return this.deviceBattery;
	}
	public void setDeviceBattery(String deviceBattery) {
		this.deviceBattery = deviceBattery;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceUser() {
		return this.deviceUser;
	}
	public void setDeviceUser(String deviceUser) {
		this.deviceUser = deviceUser;
	}

	public String getLac() {
		return this.lac;
	}
	public void setLac(String lac) {
		this.lac = lac;
	}

	public String getMeal() {
		return this.meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}

	public Date getMeasureTime() {
		return this.measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}

	public String getMeasureValue() {
		return this.measureValue;
	}
	public void setMeasureValue(String measureValue) {
		this.measureValue = measureValue;
	}

	public String getMnc() {
		return this.mnc;
	}
	public void setMnc(String mnc) {
		this.mnc = mnc;
	}

}
