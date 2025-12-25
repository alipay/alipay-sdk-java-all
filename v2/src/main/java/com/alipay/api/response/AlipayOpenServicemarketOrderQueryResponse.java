package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-27 16:15:20
 */
public class AlipayOpenServicemarketOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6328732358565454758L;

	/** 
	 * true：开启；false：关闭；需要同步校验commodity_id，如果没有查询到订购信息的话，忽略该字段返回值
	 */
	@ApiField("auto_upgrade")
	private Boolean autoUpgrade;

	/** 
	 * 订购服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/** 
	 * 当前查询页（本接口支持最多查询100条记录）
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 订单明细列表
	 */
	@ApiListField("order_items")
	@ApiField("order_item")
	private List<OrderItem> orderItems;

	/** 
	 * 用于区分同一个服务的不同版本
	 */
	@ApiField("specifications")
	private String specifications;

	/** 
	 * MERCHANT_ORDED（待服务商接单）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总记录数，例如1000条
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setAutoUpgrade(Boolean autoUpgrade) {
		this.autoUpgrade = autoUpgrade;
	}
	public Boolean getAutoUpgrade( ) {
		return this.autoUpgrade;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityId( ) {
		return this.commodityId;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public List<OrderItem> getOrderItems( ) {
		return this.orderItems;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getSpecifications( ) {
		return this.specifications;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
