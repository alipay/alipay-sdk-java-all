package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 语音播报数据记录详情
 *
 * @author auto create
 * @since 1.0, 2023-10-13 10:17:43
 */
public class SpeechRecordDetail extends AlipayObject {

	private static final long serialVersionUID = 4265412969598884522L;

	/**
	 * 播报关联的支付宝运营计划id，对接支付宝播报接口后，该字段可不传，其他场景必传
	 */
	@ApiField("alipay_plan_id")
	private String alipayPlanId;

	/**
	 * 设备在线地址，ip字段和地址字段（device_address且device_province且device_city且device_district）必须至少传一个
	 */
	@ApiField("device_address")
	private String deviceAddress;

	/**
	 * 设备所在城市中文名称，ip字段和地址字段（device_address且device_province且device_city且device_district）必须至少传一个
	 */
	@ApiField("device_city")
	private String deviceCity;

	/**
	 * 设备所在区中文名称，ip字段和地址字段（device_address且device_province且device_city且device_district）必须至少传一个
	 */
	@ApiField("device_district")
	private String deviceDistrict;

	/**
	 * 设备ip地址需要传入公网有效ip，ip字段和地址字段（device_address且device_province且device_city且device_district）必须至少传一个
	 */
	@ApiField("device_ip")
	private String deviceIp;

	/**
	 * 设备所在地址纬度
	 */
	@ApiField("device_latitude")
	private String deviceLatitude;

	/**
	 * 设备所在地址经度
	 */
	@ApiField("device_longitude")
	private String deviceLongitude;

	/**
	 * 最后一次开机时间，毫秒时间戳
	 */
	@ApiField("device_online_time")
	private String deviceOnlineTime;

	/**
	 * 设备操作系统版本
	 */
	@ApiField("device_os_version")
	private String deviceOsVersion;

	/**
	 * 设备所在省中文名称，ip字段和地址字段（device_address且device_province且device_city且device_district）必须至少传一个
	 */
	@ApiField("device_province")
	private String deviceProvince;

	/**
	 * 设备软件SDK版本号
	 */
	@ApiField("device_sdk_version")
	private String deviceSdkVersion;

	/**
	 * 设备SN号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备音量值，根据设备情况传入
	 */
	@ApiField("device_sound")
	private String deviceSound;

	/**
	 * 设备 supplier_id,用于区分设备类型
	 */
	@ApiField("device_supplier_id")
	private String deviceSupplierId;

	/**
	 * 外部服务商运营计划结束时间，毫秒级时间戳
	 */
	@ApiField("out_plan_end_time")
	private String outPlanEndTime;

	/**
	 * 外部服务商语音播报平台的运营计划id
	 */
	@ApiField("out_plan_id")
	private String outPlanId;

	/**
	 * 外部服务商运营计划开始时间，毫秒级时间戳
	 */
	@ApiField("out_plan_start_time")
	private String outPlanStartTime;

	/**
	 * 设备扫描情况。如果设备同时支持主扫被扫，则这个字段为必填
	 */
	@ApiField("scan_type")
	private String scanType;

	/**
	 * 设备关联的间连商户smid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 语音播报内容，字符串文本形式
	 */
	@ApiField("speech_content")
	private String speechContent;

	/**
	 * 语音播报发生的时机，根据播报触发的事件传入
	 */
	@ApiField("speech_event")
	private String speechEvent;

	/**
	 * 区分播报记录的唯一标识
	 */
	@ApiField("speech_id")
	private String speechId;

	/**
	 * 语音播报结果，如果系统暂不支持传UNKNOWN
	 */
	@ApiField("speech_result")
	private String speechResult;

	/**
	 * 语音播报结果详情，当播报结果为FAIL的情况下必须传入具体的原因
	 */
	@ApiField("speech_result_msg")
	private String speechResultMsg;

	/**
	 * 播报场景类型，支付到账类的传TRADE，营销类的传PROMOTION
	 */
	@ApiField("speech_scene")
	private String speechScene;

	/**
	 * 语音播报时间，毫秒级时间戳传入。只接收T-1的播报数据，例如11月22号上传的数据的播报时间不能早于11月21号
	 */
	@ApiField("speech_time")
	private String speechTime;

	/**
	 * 支付渠道
	 */
	@ApiField("trade_channel")
	private String tradeChannel;

	/**
	 * 交易播报关联的支付宝交易单号。当交易渠道为支付宝的时候需要传入，其他情况传空。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAlipayPlanId() {
		return this.alipayPlanId;
	}
	public void setAlipayPlanId(String alipayPlanId) {
		this.alipayPlanId = alipayPlanId;
	}

	public String getDeviceAddress() {
		return this.deviceAddress;
	}
	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
	}

	public String getDeviceCity() {
		return this.deviceCity;
	}
	public void setDeviceCity(String deviceCity) {
		this.deviceCity = deviceCity;
	}

	public String getDeviceDistrict() {
		return this.deviceDistrict;
	}
	public void setDeviceDistrict(String deviceDistrict) {
		this.deviceDistrict = deviceDistrict;
	}

	public String getDeviceIp() {
		return this.deviceIp;
	}
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	public String getDeviceLatitude() {
		return this.deviceLatitude;
	}
	public void setDeviceLatitude(String deviceLatitude) {
		this.deviceLatitude = deviceLatitude;
	}

	public String getDeviceLongitude() {
		return this.deviceLongitude;
	}
	public void setDeviceLongitude(String deviceLongitude) {
		this.deviceLongitude = deviceLongitude;
	}

	public String getDeviceOnlineTime() {
		return this.deviceOnlineTime;
	}
	public void setDeviceOnlineTime(String deviceOnlineTime) {
		this.deviceOnlineTime = deviceOnlineTime;
	}

	public String getDeviceOsVersion() {
		return this.deviceOsVersion;
	}
	public void setDeviceOsVersion(String deviceOsVersion) {
		this.deviceOsVersion = deviceOsVersion;
	}

	public String getDeviceProvince() {
		return this.deviceProvince;
	}
	public void setDeviceProvince(String deviceProvince) {
		this.deviceProvince = deviceProvince;
	}

	public String getDeviceSdkVersion() {
		return this.deviceSdkVersion;
	}
	public void setDeviceSdkVersion(String deviceSdkVersion) {
		this.deviceSdkVersion = deviceSdkVersion;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceSound() {
		return this.deviceSound;
	}
	public void setDeviceSound(String deviceSound) {
		this.deviceSound = deviceSound;
	}

	public String getDeviceSupplierId() {
		return this.deviceSupplierId;
	}
	public void setDeviceSupplierId(String deviceSupplierId) {
		this.deviceSupplierId = deviceSupplierId;
	}

	public String getOutPlanEndTime() {
		return this.outPlanEndTime;
	}
	public void setOutPlanEndTime(String outPlanEndTime) {
		this.outPlanEndTime = outPlanEndTime;
	}

	public String getOutPlanId() {
		return this.outPlanId;
	}
	public void setOutPlanId(String outPlanId) {
		this.outPlanId = outPlanId;
	}

	public String getOutPlanStartTime() {
		return this.outPlanStartTime;
	}
	public void setOutPlanStartTime(String outPlanStartTime) {
		this.outPlanStartTime = outPlanStartTime;
	}

	public String getScanType() {
		return this.scanType;
	}
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSpeechContent() {
		return this.speechContent;
	}
	public void setSpeechContent(String speechContent) {
		this.speechContent = speechContent;
	}

	public String getSpeechEvent() {
		return this.speechEvent;
	}
	public void setSpeechEvent(String speechEvent) {
		this.speechEvent = speechEvent;
	}

	public String getSpeechId() {
		return this.speechId;
	}
	public void setSpeechId(String speechId) {
		this.speechId = speechId;
	}

	public String getSpeechResult() {
		return this.speechResult;
	}
	public void setSpeechResult(String speechResult) {
		this.speechResult = speechResult;
	}

	public String getSpeechResultMsg() {
		return this.speechResultMsg;
	}
	public void setSpeechResultMsg(String speechResultMsg) {
		this.speechResultMsg = speechResultMsg;
	}

	public String getSpeechScene() {
		return this.speechScene;
	}
	public void setSpeechScene(String speechScene) {
		this.speechScene = speechScene;
	}

	public String getSpeechTime() {
		return this.speechTime;
	}
	public void setSpeechTime(String speechTime) {
		this.speechTime = speechTime;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
