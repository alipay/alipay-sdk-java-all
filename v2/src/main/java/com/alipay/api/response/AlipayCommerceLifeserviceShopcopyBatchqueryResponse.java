package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LubUnifiedShopCopyListQueryItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shopcopy.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 10:22:54
 */
public class AlipayCommerceLifeserviceShopcopyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2261393188811955798L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("lub_unified_shop_copy_list_query_item")
	private List<LubUnifiedShopCopyListQueryItem> list;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setList(List<LubUnifiedShopCopyListQueryItem> list) {
		this.list = list;
	}
	public List<LubUnifiedShopCopyListQueryItem> getList( ) {
		return this.list;
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
