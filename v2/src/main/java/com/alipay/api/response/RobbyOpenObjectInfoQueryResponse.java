package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjectItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: robby.open.object.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 17:17:53
 */
public class RobbyOpenObjectInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8158793694341679572L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("object_item")
	private List<ObjectItem> items;

	/** 
	 * 当前页
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
	@ApiField("total")
	private Long total;

	public void setItems(List<ObjectItem> items) {
		this.items = items;
	}
	public List<ObjectItem> getItems( ) {
		return this.items;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
