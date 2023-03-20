package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetBom;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.asset.bom.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:35:24
 */
public class AntMerchantExpandAssetBomQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6299382157294853614L;

	/** 
	 * 物料清单信息
	 */
	@ApiField("asset_bom")
	private AssetBom assetBom;

	public void setAssetBom(AssetBom assetBom) {
		this.assetBom = assetBom;
	}
	public AssetBom getAssetBom( ) {
		return this.assetBom;
	}

}
