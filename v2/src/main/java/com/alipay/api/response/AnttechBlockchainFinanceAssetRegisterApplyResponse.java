package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.asset.register.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:00:21
 */
public class AnttechBlockchainFinanceAssetRegisterApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1236761145834187179L;

	/** 
	 * 资产登记申请结果，不同资产类型不同，比如可能包含代签名原始数据等。
	 */
	@ApiField("apply_result")
	private String applyResult;

	/** 
	 * 登记成功后，返回资产登记中心内部资产编号
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 申请时提交的外部资产编号
	 */
	@ApiField("out_asset_id")
	private String outAssetId;

	public void setApplyResult(String applyResult) {
		this.applyResult = applyResult;
	}
	public String getApplyResult( ) {
		return this.applyResult;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setOutAssetId(String outAssetId) {
		this.outAssetId = outAssetId;
	}
	public String getOutAssetId( ) {
		return this.outAssetId;
	}

}
