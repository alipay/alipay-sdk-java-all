package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具设备信息查询
 *
 * @author auto create
 * @since 1.0, 2018-07-31 17:08:29
 */
public class AlipayCommerceIotMdeviceprodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2421587363729268454L;

	/**
	 * 设备id（物料系统的id）
	 */
	@ApiField("asset_id")
	private String assetId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

}
