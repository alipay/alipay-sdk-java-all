package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InventoryRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inventoryrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:31:09
 */
public class KoubeiRetailWmsInventoryrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3552755838145649788L;

	/** 
	 * 库存变更记录
	 */
	@ApiListField("inventory_record_list")
	@ApiField("inventory_record")
	private List<InventoryRecord> inventoryRecordList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 页码大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setInventoryRecordList(List<InventoryRecord> inventoryRecordList) {
		this.inventoryRecordList = inventoryRecordList;
	}
	public List<InventoryRecord> getInventoryRecordList( ) {
		return this.inventoryRecordList;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
