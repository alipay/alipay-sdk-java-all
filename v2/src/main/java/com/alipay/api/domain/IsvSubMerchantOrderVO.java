package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商待开通子单
 *
 * @author auto create
 * @since 1.0, 2025-04-15 22:36:18
 */
public class IsvSubMerchantOrderVO extends AlipayObject {

	private static final long serialVersionUID = 5475894722334721623L;

	/**
	 * 主申请单id
	 */
	@ApiField("m_order_id")
	private String mOrderId;

	/**
	 * 子单状态
	 */
	@ApiField("sub_order_status")
	private String subOrderStatus;

	/**
	 * 子单类型
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

	public String getmOrderId() {
		return this.mOrderId;
	}
	public void setmOrderId(String mOrderId) {
		this.mOrderId = mOrderId;
	}

	public String getSubOrderStatus() {
		return this.subOrderStatus;
	}
	public void setSubOrderStatus(String subOrderStatus) {
		this.subOrderStatus = subOrderStatus;
	}

	public String getSubOrderType() {
		return this.subOrderType;
	}
	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

}
