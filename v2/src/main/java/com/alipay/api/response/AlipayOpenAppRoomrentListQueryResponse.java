package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RoomRentQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.roomrent.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-13 10:18:43
 */
public class AlipayOpenAppRoomrentListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8332335282817544228L;

	/** 
	 * 商品列表
	 */
	@ApiListField("items")
	@ApiField("room_rent_query_v_o")
	private List<RoomRentQueryVO> items;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 符合条件的商品总数
	 */
	@ApiField("total")
	private Long total;

	public void setItems(List<RoomRentQueryVO> items) {
		this.items = items;
	}
	public List<RoomRentQueryVO> getItems( ) {
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
