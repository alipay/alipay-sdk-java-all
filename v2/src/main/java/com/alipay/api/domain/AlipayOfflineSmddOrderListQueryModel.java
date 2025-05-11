package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单列表查询
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:20
 */
public class AlipayOfflineSmddOrderListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3858748931296255345L;

	/**
	 * 买家唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
