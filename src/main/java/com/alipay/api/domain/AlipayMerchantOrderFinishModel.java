package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单完结接口
 *
 * @author auto create
 * @since 1.0, 2019-04-29 17:34:25
 */
public class AlipayMerchantOrderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 8211199213856568298L;

	/**
	 * 支付宝内部业务订单编号，可以从对应的消息同步接口或查询接口获取。例如租享生活业务从同步消息接口alipay.merchant.order.changed获取订单的order_id，订单创建成功后会有消息发出，消息中包含order_id和创建订单时的out_biz_no。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 本次完结补充金额。例如在租赁场景中，用户归还物品的时候如果损坏，商户可与用户沟通后传入需要从押金中扣除的金额，如果不需要扣款传入0，单位为元，精确到小数点后两位，取值范围[0,100000000]
	 */
	@ApiField("supplement_amount")
	private String supplementAmount;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSupplementAmount() {
		return this.supplementAmount;
	}
	public void setSupplementAmount(String supplementAmount) {
		this.supplementAmount = supplementAmount;
	}

}
