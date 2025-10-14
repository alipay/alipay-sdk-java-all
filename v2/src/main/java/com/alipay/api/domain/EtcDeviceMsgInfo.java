package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ETC设备变更消息模型
 *
 * @author auto create
 * @since 1.0, 2024-05-21 11:51:09
 */
public class EtcDeviceMsgInfo extends AlipayObject {

	private static final long serialVersionUID = 2765541748866822356L;

	/**
	 * ETC设备激活状态
	 */
	@ApiField("active_status")
	private String activeStatus;

	/**
	 * 电量百分比数值
	 */
	@ApiField("battery_percent")
	private Long batteryPercent;

	/**
	 * 设备BIOS系统版本号
	 */
	@ApiField("bios_version")
	private String biosVersion;

	/**
	 * 业务触发时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * ETC卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 1234584849
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 设备检测状态
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * 设备固件版本号
	 */
	@ApiField("device_version")
	private String deviceVersion;

	/**
	 * 错误信息列表
	 */
	@ApiListField("error_list")
	@ApiField("etc_device_card_check_info")
	private List<EtcDeviceCardCheckInfo> errorList;

	/**
	 * ETC开关状态
	 */
	@ApiField("etc_switch_status")
	private String etcSwitchStatus;

	/**
	 * 4G信号强度百分比数值
	 */
	@ApiField("fourth_generation_signal_percent")
	private Long fourthGenerationSignalPercent;

	/**
	 * GPS信号强度百分比数值
	 */
	@ApiField("gps_signal_percent")
	private Long gpsSignalPercent;

	/**
	 * 关闭多少秒后自动打开
	 */
	@ApiField("interval")
	private Long interval;

	/**
	 * 设备商品sku码，可区分同类设备
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 设备语音开关状态
	 */
	@ApiField("sound_status")
	private String soundStatus;

	public String getActiveStatus() {
		return this.activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Long getBatteryPercent() {
		return this.batteryPercent;
	}
	public void setBatteryPercent(Long batteryPercent) {
		this.batteryPercent = batteryPercent;
	}

	public String getBiosVersion() {
		return this.biosVersion;
	}
	public void setBiosVersion(String biosVersion) {
		this.biosVersion = biosVersion;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceVersion() {
		return this.deviceVersion;
	}
	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public List<EtcDeviceCardCheckInfo> getErrorList() {
		return this.errorList;
	}
	public void setErrorList(List<EtcDeviceCardCheckInfo> errorList) {
		this.errorList = errorList;
	}

	public String getEtcSwitchStatus() {
		return this.etcSwitchStatus;
	}
	public void setEtcSwitchStatus(String etcSwitchStatus) {
		this.etcSwitchStatus = etcSwitchStatus;
	}

	public Long getFourthGenerationSignalPercent() {
		return this.fourthGenerationSignalPercent;
	}
	public void setFourthGenerationSignalPercent(Long fourthGenerationSignalPercent) {
		this.fourthGenerationSignalPercent = fourthGenerationSignalPercent;
	}

	public Long getGpsSignalPercent() {
		return this.gpsSignalPercent;
	}
	public void setGpsSignalPercent(Long gpsSignalPercent) {
		this.gpsSignalPercent = gpsSignalPercent;
	}

	public Long getInterval() {
		return this.interval;
	}
	public void setInterval(Long interval) {
		this.interval = interval;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getSoundStatus() {
		return this.soundStatus;
	}
	public void setSoundStatus(String soundStatus) {
		this.soundStatus = soundStatus;
	}

}
