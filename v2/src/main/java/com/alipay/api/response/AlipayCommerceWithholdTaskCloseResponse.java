package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withhold.task.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-12 16:21:37
 */
public class AlipayCommerceWithholdTaskCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3718548984996619982L;

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
