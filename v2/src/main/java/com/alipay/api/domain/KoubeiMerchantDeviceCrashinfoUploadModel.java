package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crash 信息上报接口
 *
 * @author auto create
 * @since 1.0, 2018-08-24 17:07:27
 */
public class KoubeiMerchantDeviceCrashinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7431225287318641794L;

	/**
	 * Crash事件发生时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 扩展信息(JSON格式)
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 设备型号
	 */
	@ApiField("hardware_version")
	private String hardwareVersion;

	/**
	 * 日志上报时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("log_time")
	private String logTime;

	/**
	 * 消息类型 CRASH_MSG/SSIDS_MSG
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * 第三方应用的app_id
	 */
	@ApiField("product")
	private String product;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 设备SN
	 */
	@ApiField("sn_id")
	private String snId;

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getHardwareVersion() {
		return this.hardwareVersion;
	}
	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	public String getLogTime() {
		return this.logTime;
	}
	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSnId() {
		return this.snId;
	}
	public void setSnId(String snId) {
		this.snId = snId;
	}

}
