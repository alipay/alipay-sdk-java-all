package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建申请单
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:05:16
 */
public class AlipayOpenSpNcoilopenOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2121357166535927667L;

	/**
	 * 快递发送方式，有普通快递和顺丰快递
	 */
	@ApiField("delivery_plan")
	private String deliveryPlan;

	/**
	 * 订单描述
	 */
	@ApiField("order_describe")
	private String orderDescribe;

	/**
	 * 返佣pid，非必要不要添加，如需要，联系产品负责人
	 */
	@ApiField("rebate_pid")
	private String rebatePid;

	/**
	 * 流水id，通过调用alipay.open.sp.ncoilopen.reference.create接口返回值中获取reference_id
	 */
	@ApiField("reference_id")
	private String referenceId;

	public String getDeliveryPlan() {
		return this.deliveryPlan;
	}
	public void setDeliveryPlan(String deliveryPlan) {
		this.deliveryPlan = deliveryPlan;
	}

	public String getOrderDescribe() {
		return this.orderDescribe;
	}
	public void setOrderDescribe(String orderDescribe) {
		this.orderDescribe = orderDescribe;
	}

	public String getRebatePid() {
		return this.rebatePid;
	}
	public void setRebatePid(String rebatePid) {
		this.rebatePid = rebatePid;
	}

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

}
