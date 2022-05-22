package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资产设备关联信息
 *
 * @author auto create
 * @since 1.0, 2020-12-28 12:05:34
 */
public class AssetDeviceRelation extends AlipayObject {

	private static final long serialVersionUID = 4674422349236119979L;

	/**
	 * asset_id 金融资产ID， 字段不唯一。
提交金融资产时，由资管平台返回。
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * device_ids，字段不唯一，和用户提交金融资产附带的设备ID信息对应。
字段值由用户提供。
	 */
	@ApiListField("device_ids")
	@ApiField("string")
	private List<String> deviceIds;

	/**
	 * device_supply_code, 字段不唯一， 当设备ID重复时可以通过设备类型区分。
501-新能源车类型
可参照融资租赁资产上链文档
	 */
	@ApiField("device_supply_code")
	private Long deviceSupplyCode;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public List<String> getDeviceIds() {
		return this.deviceIds;
	}
	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
	}

	public Long getDeviceSupplyCode() {
		return this.deviceSupplyCode;
	}
	public void setDeviceSupplyCode(Long deviceSupplyCode) {
		this.deviceSupplyCode = deviceSupplyCode;
	}

}
