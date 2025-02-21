package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:28
 */
public class KoubeiItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6246145115742184532L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private String currentPageNo;

	/** 
	 * 商品信息
	 */
	@ApiListField("item_infos")
	@ApiField("item_query_response")
	private List<ItemQueryResponse> itemInfos;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总共商品数目
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private String totalPageNo;

	public void setCurrentPageNo(String currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public String getCurrentPageNo( ) {
		return this.currentPageNo;
	}

	public void setItemInfos(List<ItemQueryResponse> itemInfos) {
		this.itemInfos = itemInfos;
	}
	public List<ItemQueryResponse> getItemInfos( ) {
		return this.itemInfos;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	public String getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPageNo(String totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	public String getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
