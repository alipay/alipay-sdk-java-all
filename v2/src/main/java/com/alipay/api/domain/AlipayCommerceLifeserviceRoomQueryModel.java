package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场地分页查询
 *
 * @author auto create
 * @since 1.0, 2026-01-26 15:57:42
 */
public class AlipayCommerceLifeserviceRoomQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8867846134114696469L;

	/**
	 * null
	 */
	@ApiListField("out_room_ids")
	@ApiField("string")
	private List<String> outRoomIds;

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
	@ApiListField("room_ids")
	@ApiField("string")
	private List<String> roomIds;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * active 可预约状态
inactive 不可预约状态
	 */
	@ApiField("status")
	private String status;

	public List<String> getOutRoomIds() {
		return this.outRoomIds;
	}
	public void setOutRoomIds(List<String> outRoomIds) {
		this.outRoomIds = outRoomIds;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getRoomIds() {
		return this.roomIds;
	}
	public void setRoomIds(List<String> roomIds) {
		this.roomIds = roomIds;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
