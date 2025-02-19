package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询隐私小号
 *
 * @author auto create
 * @since 1.0, 2024-12-16 14:12:32
 */
public class AlipayIserviceItaskOutorderPrivacyphoneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1631991427446619817L;

	/**
	 * 机构侧工单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 蚂蚁侧工单号
	 */
	@ApiField("self_order_id")
	private String selfOrderId;

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getSelfOrderId() {
		return this.selfOrderId;
	}
	public void setSelfOrderId(String selfOrderId) {
		this.selfOrderId = selfOrderId;
	}

}
