package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.devops.mobiledevice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-23 11:01:27
 */
public class AntLinkeDevopsMobiledeviceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8245497199632387616L;

	/** 
	 * access_token+唯一+ws接口使用的鉴权信息+结果返回
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * device_id+唯一+设备id信息+用来标识设备的唯一键
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 设备信息+唯一+租用展示的请求参数+返回结果
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/** 
	 * device_status+唯一+设备状态信息+返回参数
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/** 
	 * expire_time+唯一+强制过期时间+结果返回
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * image_info+唯一+镜像信息+结果信息
	 */
	@ApiField("image_info")
	private String imageInfo;

	/** 
	 * remote_port+唯一+远端请求的端口信息+返回结果
	 */
	@ApiField("remote_port")
	private String remotePort;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getDeviceInfo( ) {
		return this.deviceInfo;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	public String getDeviceStatus( ) {
		return this.deviceStatus;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setImageInfo(String imageInfo) {
		this.imageInfo = imageInfo;
	}
	public String getImageInfo( ) {
		return this.imageInfo;
	}

	public void setRemotePort(String remotePort) {
		this.remotePort = remotePort;
	}
	public String getRemotePort( ) {
		return this.remotePort;
	}

}
