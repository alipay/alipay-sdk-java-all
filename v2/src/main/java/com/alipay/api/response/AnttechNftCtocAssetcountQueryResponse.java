package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.assetcount.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-18 21:17:41
 */
public class AnttechNftCtocAssetcountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8365728799949275765L;

	/** 
	 * 查询分区
	 */
	@ApiField("dt")
	private String dt;

	/** 
	 * 持有资产总数
	 */
	@ApiField("total_owned_asset_num")
	private Long totalOwnedAssetNum;

	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getDt( ) {
		return this.dt;
	}

	public void setTotalOwnedAssetNum(Long totalOwnedAssetNum) {
		this.totalOwnedAssetNum = totalOwnedAssetNum;
	}
	public Long getTotalOwnedAssetNum( ) {
		return this.totalOwnedAssetNum;
	}

}
