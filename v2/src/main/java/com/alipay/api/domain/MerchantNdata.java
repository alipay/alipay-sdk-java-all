package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家碰数据
 *
 * @author auto create
 * @since 1.0, 2025-12-04 15:04:20
 */
public class MerchantNdata extends AlipayObject {

	private static final long serialVersionUID = 5624422127252469332L;

	/**
	 * 相关信息KV返回
	 */
	@ApiField("data_content")
	private String dataContent;

	/**
	 * 设备id，N7为sn，小蓝环和音箱为tagid
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 商户smid
	 */
	@ApiField("smid")
	private String smid;

	public String getDataContent() {
		return this.dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
