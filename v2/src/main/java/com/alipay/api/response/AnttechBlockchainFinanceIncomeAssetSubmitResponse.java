package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.income.asset.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:33
 */
public class AnttechBlockchainFinanceIncomeAssetSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6736599834215473812L;

	/** 
	 * 资产ID，资产登记成功后返回，在后续接口中标识资产身份
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 登记流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
