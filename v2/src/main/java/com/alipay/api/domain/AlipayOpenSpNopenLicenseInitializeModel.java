package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模组开放license初始化
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:56:29
 */
public class AlipayOpenSpNopenLicenseInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6532226547884517993L;

	/**
	 * 模组生成的签名
	 */
	@ApiField("device_sign")
	private String deviceSign;

	/**
	 * 模组的itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 模组的mcu_id
	 */
	@ApiField("mcu_id")
	private String mcuId;

	/**
	 * 模组生成的公钥,64字节
	 */
	@ApiField("public_key")
	private String publicKey;

	/**
	 * 模组的se_uuid（16进制的字符串，没有0x前缀）
	 */
	@ApiField("se_uuid")
	private String seUuid;

	/**
	 * 模组sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 模组供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 环境类型
	 */
	@ApiField("type")
	private String type;

	public String getDeviceSign() {
		return this.deviceSign;
	}
	public void setDeviceSign(String deviceSign) {
		this.deviceSign = deviceSign;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMcuId() {
		return this.mcuId;
	}
	public void setMcuId(String mcuId) {
		this.mcuId = mcuId;
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

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
