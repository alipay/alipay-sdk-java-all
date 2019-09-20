package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户设备信息上报
 *
 * @author auto create
 * @since 1.0, 2018-06-15 19:33:26
 */
public class AlipayUserAccountDeviceInfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2158546967768949681L;

	/**
	 * 回调地址
	 */
	@ApiField("call_back")
	private String callBack;

	/**
	 * 设备id，必须和device_type一一对应，即如果传的是device_type=IDFA，则改字段传设备id，如果device_type=IMEI，传设备IMEI号.
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型:IMEI、IDFA、MOBILE等(大小写敏感)
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备id的加密方式,如没有加 密,可以不传。一般sha256即可满足需求,如其他方式,请提前和支付宝技术支持联系
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 扩展参数，如设备系统类型，系统版本等,格式为基本字符串组成的json串
	 */
	@ApiField("extra_info")
	private String extraInfo;

	/**
	 * 链接参数信息，格式为基本字符串组成的json串
	 */
	@ApiField("params")
	private String params;

	/**
	 * 一般代表调用的合作机构名称,可写简称,大小写敏感
	 */
	@ApiField("request_from")
	private String requestFrom;

	public String getCallBack() {
		return this.callBack;
	}
	public void setCallBack(String callBack) {
		this.callBack = callBack;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

}
