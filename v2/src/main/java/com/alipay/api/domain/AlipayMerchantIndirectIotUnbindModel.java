package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连iot设备和间连商户解绑
 *
 * @author auto create
 * @since 1.0, 2024-05-17 11:28:38
 */
public class AlipayMerchantIndirectIotUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 5713454319692882418L;

	/**
	 * 合约机和lite接入模式传设备SN号，千里传音模式传设备deviceName
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 固定枚举值（千里传音：ALIYUN，合约机：SDK，lite模式：LITE）
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 间连商户在支付宝体系内的唯一id,一般以2088开头
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 合约机模式必传设备sourceId号，千里传音模式必传设备的productKey，lite模式必传分配给服务商的设备型号编码
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
