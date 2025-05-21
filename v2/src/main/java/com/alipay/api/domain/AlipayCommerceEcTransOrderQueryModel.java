package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账订单查询
 *
 * @author auto create
 * @since 1.0, 2024-12-31 15:07:22
 */
public class AlipayCommerceEcTransOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7618677645675726912L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 支付宝转账单
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 转账时的外呼商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
