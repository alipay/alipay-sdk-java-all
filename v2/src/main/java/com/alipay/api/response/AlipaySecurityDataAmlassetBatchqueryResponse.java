package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmlAssetRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.amlasset.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:09
 */
public class AlipaySecurityDataAmlassetBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889342819936486375L;

	/** 
	 * 风险资产记录结果列表
	 */
	@ApiListField("asset_records")
	@ApiField("aml_asset_record")
	private List<AmlAssetRecord> assetRecords;

	public void setAssetRecords(List<AmlAssetRecord> assetRecords) {
		this.assetRecords = assetRecords;
	}
	public List<AmlAssetRecord> getAssetRecords( ) {
		return this.assetRecords;
	}

}
