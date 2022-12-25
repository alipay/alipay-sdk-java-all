package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniEntityBindVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.shop.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:45:46
 */
public class AlipayOpenMiniShopRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3552427273489118153L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 小程序门店绑定关系列表，principal_id为小程序id，entity_id为门店id
	 */
	@ApiListField("data_list")
	@ApiField("mini_entity_bind_v_o")
	private List<MiniEntityBindVO> dataList;

	/** 
	 * 每页项数
	 */
	@ApiField("per_page_count")
	private Long perPageCount;

	/** 
	 * 总共项数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	public void setDataList(List<MiniEntityBindVO> dataList) {
		this.dataList = dataList;
	}
	public List<MiniEntityBindVO> getDataList( ) {
		return this.dataList;
	}

	public void setPerPageCount(Long perPageCount) {
		this.perPageCount = perPageCount;
	}
	public Long getPerPageCount( ) {
		return this.perPageCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
