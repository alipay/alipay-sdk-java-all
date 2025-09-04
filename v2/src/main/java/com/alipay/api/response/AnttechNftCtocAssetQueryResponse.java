package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.asset.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 21:07:32
 */
public class AnttechNftCtocAssetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7639222512744176257L;

	/** 
	 * 资产列表
	 */
	@ApiListField("asset_list")
	@ApiField("asset_d_t_o")
	private List<AssetDTO> assetList;

	/** 
	 * 是否还有更多数据
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 是否已经实名
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
