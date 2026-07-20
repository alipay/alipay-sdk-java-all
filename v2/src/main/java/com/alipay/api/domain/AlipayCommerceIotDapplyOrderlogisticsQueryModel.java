package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备申请单物流轨迹信息查询
 *
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:16
 */
public class AlipayCommerceIotDapplyOrderlogisticsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7482444241347218286L;

	/**
	 * 设备申请业务订单号
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
