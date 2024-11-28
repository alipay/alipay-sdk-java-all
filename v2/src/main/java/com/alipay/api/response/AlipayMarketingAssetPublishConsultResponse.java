package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenAssetPublishConsultResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.asset.publish.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-30 19:07:07
 */
public class AlipayMarketingAssetPublishConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7225995984998281591L;

	/** 
	 * 发放咨询结果，包括权益id、实体id、是否通过等信息
	 */
	@ApiListField("open_asset_publish_consult_results")
	@ApiField("open_asset_publish_consult_result")
	private List<OpenAssetPublishConsultResult> openAssetPublishConsultResults;

	public void setOpenAssetPublishConsultResults(List<OpenAssetPublishConsultResult> openAssetPublishConsultResults) {
		this.openAssetPublishConsultResults = openAssetPublishConsultResults;
	}
	public List<OpenAssetPublishConsultResult> getOpenAssetPublishConsultResults( ) {
		return this.openAssetPublishConsultResults;
	}

}
