package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-22 14:57:41
 */
public class UserOwnedAsset extends AlipayObject {

	private static final long serialVersionUID = 4736778376459441793L;

	/**
	 * 用户持有该sku资产的数据
	 */
	@ApiField("owned_sku_asset_num")
	private Long ownedSkuAssetNum;

	/**
	 * sku的Id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * sku名称
	 */
	@ApiField("sku_name")
	private String skuName;

	public Long getOwnedSkuAssetNum() {
		return this.ownedSkuAssetNum;
	}
	public void setOwnedSkuAssetNum(Long ownedSkuAssetNum) {
		this.ownedSkuAssetNum = ownedSkuAssetNum;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

}
