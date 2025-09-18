package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料信息变更反馈接口
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:21:51
 */
public class AntMerchantExpandAssetinfoCorrectionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8738532513256337538L;

	/**
	 * 物料信息更正请求
	 */
	@ApiField("asset_correction")
	private AssetInfoCorrectionItem assetCorrection;

	public AssetInfoCorrectionItem getAssetCorrection() {
		return this.assetCorrection;
	}
	public void setAssetCorrection(AssetInfoCorrectionItem assetCorrection) {
		this.assetCorrection = assetCorrection;
	}

}
