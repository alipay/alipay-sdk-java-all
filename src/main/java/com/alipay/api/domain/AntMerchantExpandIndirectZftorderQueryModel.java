package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通商户入驻进度查询
 *
 * @author auto create
 * @since 1.0, 2020-04-26 19:15:44
 */
public class AntMerchantExpandIndirectZftorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1438155127783954689L;

	/**
	 * 进件申请时的外部商户id，与order_id二选一必填
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 进件接口返回的申请单id。与external_id二选一必填。若都传以order_id的查询为准。
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
