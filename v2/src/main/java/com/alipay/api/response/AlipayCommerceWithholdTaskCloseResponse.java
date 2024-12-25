package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withhold.task.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-23 16:42:37
 */
public class AlipayCommerceWithholdTaskCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3364684962266935644L;

	/** 
	 * 代扣任务ID
	 */
	@ApiField("withhold_no")
	private String withholdNo;

	public void setWithholdNo(String withholdNo) {
		this.withholdNo = withholdNo;
	}
	public String getWithholdNo( ) {
		return this.withholdNo;
	}

}
