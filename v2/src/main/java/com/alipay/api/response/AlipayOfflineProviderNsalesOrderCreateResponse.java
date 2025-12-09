package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.nsales.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:47:39
 */
public class AlipayOfflineProviderNsalesOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6697296848725539965L;

	/** 
	 * 绝对过期时间
	 */
	@ApiField("express_timeout")
	private Date expressTimeout;

	/** 
	 * 用户扫码下单链接
	 */
	@ApiField("order_url")
	private String orderUrl;

	/** 
	 * 卖进订单id
	 */
	@ApiField("sales_entry_order_id")
	private String salesEntryOrderId;

	/** 
	 * 卖进预订单id
	 */
	@ApiField("sales_entry_pre_order_id")
	private String salesEntryPreOrderId;

	public void setExpressTimeout(Date expressTimeout) {
		this.expressTimeout = expressTimeout;
	}
	public Date getExpressTimeout( ) {
		return this.expressTimeout;
	}

	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
	}
	public String getOrderUrl( ) {
		return this.orderUrl;
	}

	public void setSalesEntryOrderId(String salesEntryOrderId) {
		this.salesEntryOrderId = salesEntryOrderId;
	}
	public String getSalesEntryOrderId( ) {
		return this.salesEntryOrderId;
	}

	public void setSalesEntryPreOrderId(String salesEntryPreOrderId) {
		this.salesEntryPreOrderId = salesEntryPreOrderId;
	}
	public String getSalesEntryPreOrderId( ) {
		return this.salesEntryPreOrderId;
	}

}
