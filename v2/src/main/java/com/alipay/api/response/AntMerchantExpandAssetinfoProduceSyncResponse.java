package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetinfo.produce.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AntMerchantExpandAssetinfoProduceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5292847135836388673L;

	/** 
	 * 物料信息反馈处理结果
	 */
	@ApiListField("info_results")
	@ApiField("asset_result")
	private List<AssetResult> infoResults;

	public void setInfoResults(List<AssetResult> infoResults) {
		this.infoResults = infoResults;
	}
	public List<AssetResult> getInfoResults( ) {
		return this.infoResults;
	}

}
