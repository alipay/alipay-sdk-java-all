package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新设备版本入参额外信息
 *
 * @author auto create
 * @since 1.0, 2025-09-05 19:43:19
 */
public class UpdateContentExtAttribute extends AlipayObject {

	private static final long serialVersionUID = 1737895275737465184L;

	/**
	 * 设备外挂配件的SN号，仅设备有外挂配件时需要传
	 */
	@ApiField("accessory_sn")
	private String accessorySn;

	/**
	 * 服务商密钥
	 */
	@ApiField("isv_access_token")
	private String isvAccessToken;

	/**
	 * 小写字母串_服务商PID
	 */
	@ApiField("isv_device_version_tag")
	private String isvDeviceVersionTag;

	public String getAccessorySn() {
		return this.accessorySn;
	}
	public void setAccessorySn(String accessorySn) {
		this.accessorySn = accessorySn;
	}

	public String getIsvAccessToken() {
		return this.isvAccessToken;
	}
	public void setIsvAccessToken(String isvAccessToken) {
		this.isvAccessToken = isvAccessToken;
	}

	public String getIsvDeviceVersionTag() {
		return this.isvDeviceVersionTag;
	}
	public void setIsvDeviceVersionTag(String isvDeviceVersionTag) {
		this.isvDeviceVersionTag = isvDeviceVersionTag;
	}

}
