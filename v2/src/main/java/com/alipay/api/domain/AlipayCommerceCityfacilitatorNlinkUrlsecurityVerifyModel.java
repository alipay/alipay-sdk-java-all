package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N模块链路验签接口
 *
 * @author auto create
 * @since 1.0, 2025-03-06 20:17:00
 */
public class AlipayCommerceCityfacilitatorNlinkUrlsecurityVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5178576664285434937L;

	/**
	 * 设备生成的签名
	 */
	@ApiField("device_sign")
	private String deviceSign;

	/**
	 * mcu的uuid
	 */
	@ApiField("mcu_uuid")
	private String mcuUuid;

	/**
	 * 设备生成的公钥,64字节
	 */
	@ApiField("public_key")
	private String publicKey;

	/**
	 * se设备uuid（16进制的字符串，没有0x前缀）
	 */
	@ApiField("se_uuid")
	private String seUuid;

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getDeviceSign() {
		return this.deviceSign;
	}
	public void setDeviceSign(String deviceSign) {
		this.deviceSign = deviceSign;
	}

	public String getMcuUuid() {
		return this.mcuUuid;
	}
	public void setMcuUuid(String mcuUuid) {
		this.mcuUuid = mcuUuid;
	}

	public String getPublicKey() {
		return this.publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getSeUuid() {
		return this.seUuid;
	}
	public void setSeUuid(String seUuid) {
		this.seUuid = seUuid;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
