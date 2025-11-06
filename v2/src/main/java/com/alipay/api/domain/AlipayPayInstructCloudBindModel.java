package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小指令设备绑定
 *
 * @author auto create
 * @since 1.0, 2025-08-13 10:20:10
 */
public class AlipayPayInstructCloudBindModel extends AlipayObject {

	private static final long serialVersionUID = 3491864535843383574L;

	/**
	 * 绑定时从 N 设备 KD4 接收的 SN
	 */
	@ApiField("n_sn")
	private String nSn;

	/**
	 * 绑定时从 N 设备 KD4 接收的配对码
	 */
	@ApiField("pairing_code")
	private String pairingCode;

	/**
	 * POS 设备唯一标识，建议取 POS 设备 SN 编号，保证每个设备唯一
	 */
	@ApiField("pos_id")
	private String posId;

	/**
	 * POS所在门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getnSn() {
		return this.nSn;
	}
	public void setnSn(String nSn) {
		this.nSn = nSn;
	}

	public String getPairingCode() {
		return this.pairingCode;
	}
	public void setPairingCode(String pairingCode) {
		this.pairingCode = pairingCode;
	}

	public String getPosId() {
		return this.posId;
	}
	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
