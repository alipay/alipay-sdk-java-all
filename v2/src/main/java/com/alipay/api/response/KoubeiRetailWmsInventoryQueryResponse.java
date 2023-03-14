package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Inventory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inventory.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:09:41
 */
public class KoubeiRetailWmsInventoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7543694774677427989L;

	/** 
	 * 返回货品库存列表
	 */
	@ApiListField("inventory_list")
	@ApiField("inventory")
	private List<Inventory> inventoryList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setInventoryList(List<Inventory> inventoryList) {
		this.inventoryList = inventoryList;
	}
	public List<Inventory> getInventoryList( ) {
		return this.inventoryList;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
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
