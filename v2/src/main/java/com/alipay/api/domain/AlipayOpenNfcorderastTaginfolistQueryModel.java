package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询线圈信息
 *
 * @author auto create
 * @since 1.0, 2026-04-27 16:22:49
 */
public class AlipayOpenNfcorderastTaginfolistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2737532967362977855L;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 不传则默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 不传默认为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
