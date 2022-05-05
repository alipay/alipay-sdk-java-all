package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于服务商回查服务市场订单明细信息
 *
 * @author auto create
 * @since 1.0, 2021-08-24 11:50:25
 */
public class AlipayOpenServicemarketOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7689918216216891297L;

	/**
	 * 订购服务订单ID，通过支付宝发送的 https://opendocs.alipay.com/apis/api_3/alipay.open.servicemarket.order.notify(服务市场商户确认订购通知) 通知获取。
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 查询开始页码，1 为第一页。
	 */
	@ApiField("start_page")
	private String startPage;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public String getStartPage() {
		return this.startPage;
	}
	public void setStartPage(String startPage) {
		this.startPage = startPage;
	}

}
