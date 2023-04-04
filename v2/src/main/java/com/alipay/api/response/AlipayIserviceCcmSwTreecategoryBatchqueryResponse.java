package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArticleCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.treecategory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:01:46
 */
public class AlipayIserviceCcmSwTreecategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4748664389988899566L;

	/** 
	 * 节点集合
	 */
	@ApiListField("categories")
	@ApiField("article_category_info")
	private List<ArticleCategoryInfo> categories;

	/** 
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页显示大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总行数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCategories(List<ArticleCategoryInfo> categories) {
		this.categories = categories;
	}
	public List<ArticleCategoryInfo> getCategories( ) {
		return this.categories;
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
