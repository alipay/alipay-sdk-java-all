package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商机业务流水号查询
 *
 * @author auto create
 * @since 1.0, 2025-03-25 12:49:37
 */
public class AlipayCommerceOperationOpportunityBizQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6533294159524956975L;

	/**
	 * 业务申请编号。业务自定义，保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
