package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体查询
 *
 * @author auto create
 * @since 1.0, 2026-08-21 17:52:18
 */
public class AlipayTradeAgentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5587616373899615151L;

	/**
	 * 创建或修改接口使用的外部请求号。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
