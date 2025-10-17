package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.zcardprod.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 17:10:26
 */
public class AlipayFundZcardprodUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5396337987578155516L;

	/** 
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 绑定状态
	 */
	@ApiField("bind_status")
	private String bindStatus;

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}
	public String getBindStatus( ) {
		return this.bindStatus;
	}

}
