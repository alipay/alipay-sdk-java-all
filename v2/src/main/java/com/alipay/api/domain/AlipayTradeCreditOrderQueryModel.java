package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付信用订单查询
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:04
 */
public class AlipayTradeCreditOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6312161322225488955L;

	/**
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

}
