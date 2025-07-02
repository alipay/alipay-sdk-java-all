package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离境退税查询
 *
 * @author auto create
 * @since 1.0, 2025-06-01 09:47:19
 */
public class AlipayUserTaxRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2422947453879993415L;

	/**
	 * 退税申请单号
	 */
	@ApiField("refund_biz_no")
	private String refundBizNo;

	public String getRefundBizNo() {
		return this.refundBizNo;
	}
	public void setRefundBizNo(String refundBizNo) {
		this.refundBizNo = refundBizNo;
	}

}
