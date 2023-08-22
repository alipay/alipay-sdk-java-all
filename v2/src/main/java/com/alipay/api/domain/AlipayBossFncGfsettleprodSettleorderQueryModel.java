package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付分付款单查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:24:58
 */
public class AlipayBossFncGfsettleprodSettleorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7157155198568682751L;

	/**
	 * 应付结算单查询
	 */
	@ApiField("ap_settle_order_query_order")
	private ApSettleOrderQueryOrder apSettleOrderQueryOrder;

	public ApSettleOrderQueryOrder getApSettleOrderQueryOrder() {
		return this.apSettleOrderQueryOrder;
	}
	public void setApSettleOrderQueryOrder(ApSettleOrderQueryOrder apSettleOrderQueryOrder) {
		this.apSettleOrderQueryOrder = apSettleOrderQueryOrder;
	}

}
