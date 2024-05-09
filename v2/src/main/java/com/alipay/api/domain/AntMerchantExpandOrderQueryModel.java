package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户申请单查询
 *
 * @author auto create
 * @since 1.0, 2023-09-11 17:48:08
 */
public class AntMerchantExpandOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6729639644427893233L;

	/**
	 * 申请单 id。 1.蚂蚁门店管理场景：通过 <a href="https://opendocs.alipay.com/open/05afbc4a_ant.merchant.expand.shop.create?scene=common&pathHash=bf443b73"> ant.merchant.expand.shop.create</a>(蚂蚁店铺创建)接口进件时返回的order_id。 2.直付通二级商户进件场景：通过<a href="https://opendocs.alipay.com/open/028xr0?pathHash=c9ca6d68">ant.merchant.expand.indirect.zft.create</a>(直付通二级商户创建)接口进件时返回的order_id。 
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
