package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.terminate.consultresult.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 16:12:31
 */
public class AntMerchantExpandTerminateConsultresultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4819944148966772799L;

	/** 
	 * 返回结果
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
