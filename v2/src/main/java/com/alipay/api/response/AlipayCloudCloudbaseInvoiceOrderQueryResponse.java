package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsumeOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.invoice.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-23 10:47:30
 */
public class AlipayCloudCloudbaseInvoiceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6747453435733114836L;

	/** 
	 * 消费订单列表
	 */
	@ApiListField("consume_orders")
	@ApiField("consume_order")
	private List<ConsumeOrder> consumeOrders;

	/** 
	 * 信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setConsumeOrders(List<ConsumeOrder> consumeOrders) {
		this.consumeOrders = consumeOrders;
	}
	public List<ConsumeOrder> getConsumeOrders( ) {
		return this.consumeOrders;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
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

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
