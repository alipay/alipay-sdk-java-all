package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户申请单查询
 *
 * @author auto create
 * @since 1.0, 2020-11-23 21:23:38
 */
public class AntMerchantExpandOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8744661254986483659L;

	/**
	 * 申请单 id。
1.蚂蚁门店管理场景：通过ant.merchant.expand.shop.create(蚂蚁店铺创建)接口进件时返回的order_id。
2.直付通二级商户进件场景：通过ant.merchant.expand.indirect.zft.create(直付通二级商户创建)接口进件时返回的order_id。

	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
