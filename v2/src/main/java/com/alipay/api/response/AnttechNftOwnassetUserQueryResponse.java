package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PageAssetDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ownasset.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:42:27
 */
public class AnttechNftOwnassetUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7414424638136668118L;

	/** 
	 * 资产列表
	 */
	@ApiListField("asset_list")
	@ApiField("page_asset_d_t_o")
	private List<PageAssetDTO> assetList;

	/** 
	 * 分页编号
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总资产数量,个数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAssetList(List<PageAssetDTO> assetList) {
		this.assetList = assetList;
	}
	public List<PageAssetDTO> getAssetList( ) {
		return this.assetList;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
