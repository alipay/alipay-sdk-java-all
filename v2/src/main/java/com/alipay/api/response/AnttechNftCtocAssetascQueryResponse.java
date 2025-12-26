package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.assetasc.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 21:02:41
 */
public class AnttechNftCtocAssetascQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7543625947465154133L;

	/** 
	 * null
	 */
	@ApiListField("asset_list")
	@ApiField("asset_d_t_o")
	private List<AssetDTO> assetList;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 是否实名
	 */
	@ApiField("has_real_name")
	private Boolean hasRealName;

	/** 
	 * 最后的查询游标
	 */
	@ApiField("last_index")
	private Long lastIndex;

	public void setAssetList(List<AssetDTO> assetList) {
		this.assetList = assetList;
	}
	public List<AssetDTO> getAssetList( ) {
		return this.assetList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setHasRealName(Boolean hasRealName) {
		this.hasRealName = hasRealName;
	}
	public Boolean getHasRealName( ) {
		return this.hasRealName;
	}

	public void setLastIndex(Long lastIndex) {
		this.lastIndex = lastIndex;
	}
	public Long getLastIndex( ) {
		return this.lastIndex;
	}

}
