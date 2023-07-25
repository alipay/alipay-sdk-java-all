package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备指纹H5版本
 *
 * @author auto create
 * @since 1.0, 2017-12-14 10:15:49
 */
public class SsdataDataserviceRiskDeviceidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2887223828249342538L;

	/**
	 * 设备token值， 服务端JS生成的设备token值（由我方提供的JS生成），界面引入我方提供的js即可获取afs_token值，token的失效期为12个小时，基本上是190位的一串字符。
	 */
	@ApiField("device_token")
	private String deviceToken;

	public String getDeviceToken() {
		return this.deviceToken;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

}
