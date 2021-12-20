package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁iot进件申请单关联设备查询接口
 *
 * @author auto create
 * @since 1.0, 2021-09-07 14:27:15
 */
public class AlipayCommerceIotDapplyOrderdeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4355721275923366239L;

	/**
	 * 进件申请单号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

}
