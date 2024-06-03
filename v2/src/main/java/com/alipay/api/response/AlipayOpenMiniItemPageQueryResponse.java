package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.item.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-07 15:32:45
 */
public class AlipayOpenMiniItemPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7285411741584421559L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 小程序商品列表
	 */
	@ApiListField("data_list")
	@ApiField("item_v_o")
	private List<ItemVO> dataList;

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

	public void setDataList(List<ItemVO> dataList) {
		this.dataList = dataList;
	}
	public List<ItemVO> getDataList( ) {
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
