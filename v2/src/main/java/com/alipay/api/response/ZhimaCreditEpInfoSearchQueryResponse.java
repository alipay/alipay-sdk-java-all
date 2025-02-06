package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpSearchBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.info.search.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 11:34:10
 */
public class ZhimaCreditEpInfoSearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7635654969717486627L;

	/** 
	 * 模糊搜索命中的企业列表
	 */
	@ApiListField("basic_info_models")
	@ApiField("ep_search_basic_info")
	private List<EpSearchBasicInfo> basicInfoModels;

	/** 
	 * 分页中是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 分页用参数，代表请求结果的起始位置，默认1
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 分页用参数代表请求结果的总页面数
	 */
	@ApiField("page_total")
	private Long pageTotal;

	/** 
	 * 命中的企业总数，如果没有则是0
	 */
	@ApiField("total")
	private Long total;

	public void setBasicInfoModels(List<EpSearchBasicInfo> basicInfoModels) {
		this.basicInfoModels = basicInfoModels;
	}
	public List<EpSearchBasicInfo> getBasicInfoModels( ) {
		return this.basicInfoModels;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageTotal(Long pageTotal) {
		this.pageTotal = pageTotal;
	}
	public Long getPageTotal( ) {
		return this.pageTotal;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
