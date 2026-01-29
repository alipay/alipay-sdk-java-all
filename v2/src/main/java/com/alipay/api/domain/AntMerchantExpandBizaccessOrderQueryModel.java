package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通进度主动查询
 *
 * @author auto create
 * @since 1.0, 2025-07-03 20:37:32
 */
public class AntMerchantExpandBizaccessOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2212956967388177389L;

	/**
	 * 表示服务商代商户开通业务申请单的主单号（必填，本期仅支持使用order_id查询）
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户id（本期不支持使用pid查询）
	 */
	@ApiField("pid")
	private String pid;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
