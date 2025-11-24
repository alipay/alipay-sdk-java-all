package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserOwnedAsset;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.userasset.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-18 21:12:42
 */
public class AnttechNftCtocUserassetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7778918432575964476L;

	/** 
	 * 查询分区
	 */
	@ApiField("dt")
	private String dt;

	/** 
	 * null
	 */
	@ApiListField("user_owned_assets")
	@ApiField("user_owned_asset")
	private List<UserOwnedAsset> userOwnedAssets;

	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getDt( ) {
		return this.dt;
	}

	public void setUserOwnedAssets(List<UserOwnedAsset> userOwnedAssets) {
		this.userOwnedAssets = userOwnedAssets;
	}
	public List<UserOwnedAsset> getUserOwnedAssets( ) {
		return this.userOwnedAssets;
	}

}
