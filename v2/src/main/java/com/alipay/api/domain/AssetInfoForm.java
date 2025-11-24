package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产信息
 *
 * @author auto create
 * @since 1.0, 2024-04-25 15:06:17
 */
public class AssetInfoForm extends AlipayObject {

	private static final long serialVersionUID = 4724626867714555794L;

	/**
	 * 资产ID，必传
	 */
	@ApiField("asset_no")
	private String assetNo;

	/**
	 * asset_no对应的资产类型，必填
	 */
	@ApiField("asset_type")
	private String assetType;

	public String getAssetNo() {
		return this.assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

}
