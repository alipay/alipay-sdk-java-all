package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请转账业务回单
 *
 * @author auto create
 * @since 1.0, 2024-03-26 17:41:17
 */
public class AlipayCommerceEcTransReceiptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7468617348978875194L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 支付宝转账单号
	 */
	@ApiField("order_no")
	private String orderNo;

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

}
