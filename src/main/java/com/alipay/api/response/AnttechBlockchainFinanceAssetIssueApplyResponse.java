package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.asset.issue.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-02 20:40:36
 */
public class AnttechBlockchainFinanceAssetIssueApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3811298265867258159L;

	/** 
	 * 申请成功后生成的内部资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 提交申请时传入的资产id
	 */
	@ApiField("out_asset_id")
	private String outAssetId;

	/** 
	 * 申请成功后返回，待签名上链的业务信息，base64解码后为utf8编码的原始签名信息，xml格式
	 */
	@ApiField("sign_data")
	private String signData;

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

	public void setSignData(String signData) {
		this.signData = signData;
	}
	public String getSignData( ) {
		return this.signData;
	}

}
