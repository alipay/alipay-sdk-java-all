package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品交易查询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-21 15:05:03
 */
public class KoubeiTradeItemorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5288275484318864267L;

	/**
	 * 口碑订单号，可通过 <a href="https://opendocs.alipay.com/apis/api_1/koubei.trade.itemorder.buy">koubei.trade.itemorder.buy</a>(口碑商品交易购买接口)获取。
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
