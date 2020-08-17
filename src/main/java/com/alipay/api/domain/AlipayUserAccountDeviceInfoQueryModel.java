package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询设备是否支付宝新用户
 *
 * @author auto create
 * @since 1.0, 2020-06-15 15:26:28
 */
public class AlipayUserAccountDeviceInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2785491576784126484L;

	/**
	 * idfa或者imei号数组。同一笔请求中，数组中只能是idfa或者imei,不能既有imei，又有idfa
	 */
	@ApiListField("device_ids")
	@ApiField("string")
	private List<String> deviceIds;

	/**
	 * 设备类型，IMEI、IDFA、MOBILE(大小写敏感）
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备id的加密方式，如没有加密，可以不传。一般MD5即可满足需求，如其他方式，请和支付宝技术支持联系
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 扩展参数，如设备系统类型，系统版本等,格式为基本字符串组成的json串
	 */
	@ApiField("extra_info")
	private String extraInfo;

	/**
	 * 一般代表调用的合作机构名称，可写简称，大小写敏感
	 */
	@ApiField("request_from")
	private String requestFrom;

	public List<String> getDeviceIds() {
		return this.deviceIds;
	}
	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
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

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

}
