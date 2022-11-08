package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连iot设备和间连商户解绑
 *
 * @author auto create
 * @since 1.0, 2022-10-14 17:00:15
 */
public class AlipayMerchantIndirectIotUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 6732623779126692836L;

	/**
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备SN号，阿里云物联网平台传设备deviceName
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 固定枚举值（阿里云物联网平台：ALIYUN，支付宝物联网平台：SDK）
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 间连商户在支付宝体系内的唯一id,一般以2088开头
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备sourceId号，阿里云物联网平台传设备productKey
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
