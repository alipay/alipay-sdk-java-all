package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceRoom;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.room.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-26 15:57:42
 */
public class AlipayCommerceLifeserviceRoomQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3783614541546379489L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("room_infos")
	@ApiField("life_service_room")
	private List<LifeServiceRoom> roomInfos;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setRoomInfos(List<LifeServiceRoom> roomInfos) {
		this.roomInfos = roomInfos;
	}
	public List<LifeServiceRoom> getRoomInfos( ) {
		return this.roomInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
