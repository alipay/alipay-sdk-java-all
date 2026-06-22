package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CheckPlaceQueryItemOpenApiVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.expo.checkplace.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-25 18:02:50
 */
public class AlipayOfflineProviderExpoCheckplaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3258376594296957198L;

	/** 
	 * null
	 */
	@ApiListField("check_place_list")
	@ApiField("check_place_query_item_open_api_v_o")
	private List<CheckPlaceQueryItemOpenApiVO> checkPlaceList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCheckPlaceList(List<CheckPlaceQueryItemOpenApiVO> checkPlaceList) {
		this.checkPlaceList = checkPlaceList;
	}
	public List<CheckPlaceQueryItemOpenApiVO> getCheckPlaceList( ) {
		return this.checkPlaceList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
