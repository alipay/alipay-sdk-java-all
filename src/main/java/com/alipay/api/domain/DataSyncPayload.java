package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据同步消息体
 *
 * @author auto create
 * @since 1.0, 2020-01-09 11:00:17
 */
public class DataSyncPayload extends AlipayObject {

	private static final long serialVersionUID = 3895516118715758441L;

	/**
	 * 数据同步通知模型
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 设备唯一ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
