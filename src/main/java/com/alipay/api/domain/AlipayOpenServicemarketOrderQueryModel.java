package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于服务商回查服务市场订单明细信息
 *
 * @author auto create
 * @since 1.0, 2019-07-30 18:07:32
 */
public class AlipayOpenServicemarketOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6268482136775284113L;

	/**
	 * 商户订单ID号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 从第几页开始查询
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
