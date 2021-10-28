package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商推广关系查询
 *
 * @author auto create
 * @since 1.0, 2021-10-21 21:01:49
 */
public class AlipayOpenServicemarketPromotiontaskRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1553698861146544451L;

	/**
	 * 服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 当前页码，从1开始。默认：1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量，范围(1-100)。默认：10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
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

}
