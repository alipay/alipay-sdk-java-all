package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产设备信息查询
 *
 * @author auto create
 * @since 1.0, 2020-12-28 12:05:34
 */
public class AnttechBlockchainFinanceAssetDevicelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6865268786596522864L;

	/**
	 * 资产所有人标示
	 */
	@ApiField("asset_owner")
	private String assetOwner;

	/**
	 * 需要查询的设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备物料类型，当设备ID重复时，可通过该字段区分。
具体取值可以参考金融资产上链文档。
	 */
	@ApiField("device_supply_type")
	private String deviceSupplyType;

	public String getAssetOwner() {
		return this.assetOwner;
	}
	public void setAssetOwner(String assetOwner) {
		this.assetOwner = assetOwner;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceSupplyType() {
		return this.deviceSupplyType;
	}
	public void setDeviceSupplyType(String deviceSupplyType) {
		this.deviceSupplyType = deviceSupplyType;
	}

}
