package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LubUnifiedShopListQueryItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.unifiedshop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 10:27:53
 */
public class AlipayCommerceLifeserviceUnifiedshopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2696466833433697756L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("lub_unified_shop_list_query_item")
	private List<LubUnifiedShopListQueryItem> list;

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

	public void setList(List<LubUnifiedShopListQueryItem> list) {
		this.list = list;
	}
	public List<LubUnifiedShopListQueryItem> getList( ) {
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
