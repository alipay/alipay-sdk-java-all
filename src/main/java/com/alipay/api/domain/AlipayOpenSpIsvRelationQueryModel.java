package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * spcenter服务商推广关系查询
 *
 * @author auto create
 * @since 1.0, 2022-05-31 14:50:11
 */
public class AlipayOpenSpIsvRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1762787534827339516L;

	/**
	 * 服务市场商品Code
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 当前页码，从1开始。默认：1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页数量，范围(1-100)。默认：10
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
