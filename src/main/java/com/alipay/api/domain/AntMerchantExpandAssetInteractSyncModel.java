package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料域业务交互同步接口
 *
 * @author auto create
 * @since 1.0, 2022-03-23 16:44:23
 */
public class AntMerchantExpandAssetInteractSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8815781476167647885L;

	/**
	 * 回调使用
	 */
	@ApiListField("asset_callback_results")
	@ApiField("asset_callback_info")
	private List<AssetCallbackInfo> assetCallbackResults;

	public List<AssetCallbackInfo> getAssetCallbackResults() {
		return this.assetCallbackResults;
	}
	public void setAssetCallbackResults(List<AssetCallbackInfo> assetCallbackResults) {
		this.assetCallbackResults = assetCallbackResults;
	}

}
