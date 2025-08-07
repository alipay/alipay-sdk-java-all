package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI眼镜声纹核身环境信息数据上报
 *
 * @author auto create
 * @since 1.0, 2025-04-23 17:34:41
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2129893277896526294L;

	/**
	 * 数据类型描述
	 */
	@ApiField("data_type_name")
	private String dataTypeName;

	/**
	 * 设备唯一id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备当前信息
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/**
	 * 设备版本
	 */
	@ApiField("device_version")
	private String deviceVersion;

	/**
	 * 时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public String getDataTypeName() {
		return this.dataTypeName;
	}
	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getDeviceVersion() {
		return this.deviceVersion;
	}
	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
