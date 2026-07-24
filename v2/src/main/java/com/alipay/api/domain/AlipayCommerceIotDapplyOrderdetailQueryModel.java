package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备申请单详情查询
 *
 * @author auto create
 * @since 1.0, 2026-07-03 15:29:14
 */
public class AlipayCommerceIotDapplyOrderdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3141539284916173915L;

	/**
	 * 设备申请业务订单号（业务唯一键）
	 */
	@ApiField("order_biz_id")
	private String orderBizId;

	public String getOrderBizId() {
		return this.orderBizId;
	}
	public void setOrderBizId(String orderBizId) {
		this.orderBizId = orderBizId;
	}

}
