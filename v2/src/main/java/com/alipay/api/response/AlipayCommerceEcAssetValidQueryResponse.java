package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.asset.valid.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-08 15:27:04
 */
public class AlipayCommerceEcAssetValidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4563937976143188814L;

	/** 
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getAssetType( ) {
		return this.assetType;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
