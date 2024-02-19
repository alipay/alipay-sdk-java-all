package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产信息
 *
 * @author auto create
 * @since 1.0, 2023-07-08 02:23:13
 */
public class AssetInfo extends AlipayObject {

	private static final long serialVersionUID = 3733815479858656376L;

	/**
	 * 资产ID
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户开放ID
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
