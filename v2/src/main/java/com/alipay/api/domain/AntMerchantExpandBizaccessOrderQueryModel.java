package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通进度主动查询
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:58:25
 */
public class AntMerchantExpandBizaccessOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7599235538243327662L;

	/**
	 * 表示服务商代商户开通业务申请单的主单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户id
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
