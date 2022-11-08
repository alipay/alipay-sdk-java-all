package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 3c租赁网商委托代扣签约结果查询
 *
 * @author auto create
 * @since 1.0, 2022-09-29 13:43:33
 */
public class MybankCreditLoanapplyFinleaseSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3339963221325851396L;

	/**
	 * 事件类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 商家ipid
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
