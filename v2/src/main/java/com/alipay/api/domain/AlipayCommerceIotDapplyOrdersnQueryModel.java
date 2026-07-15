package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备申请单SN列表查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:18
 */
public class AlipayCommerceIotDapplyOrdersnQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8394752342531137157L;

	/**
	 * 设备申请单业务订单号
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
