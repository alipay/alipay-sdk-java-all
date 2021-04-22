package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通商户入驻进度查询
 *
 * @author auto create
 * @since 1.0, 2020-08-27 15:51:48
 */
public class AntMerchantExpandIndirectZftorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6228173654524194183L;

	/**
	 * 进件申请时的外部商户id，与order_id二选一必填
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 申请单id。通过 ant.merchant.expand.indirect.zft.create(直付通二级商户创建)接口返回。与 external_id 二选一必填，若同时传入将以 order_id 为准进行查询。
	 */
	@ApiField("order_id")
	private String orderId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
