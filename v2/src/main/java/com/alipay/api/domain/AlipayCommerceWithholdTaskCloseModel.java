package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务取消
 *
 * @author auto create
 * @since 1.0, 2024-12-12 16:21:36
 */
public class AlipayCommerceWithholdTaskCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4631295987189445895L;

	/**
	 * 代扣任务ID
	 */
	@ApiField("withhold_no")
	private String withholdNo;

	public String getWithholdNo() {
		return this.withholdNo;
	}
	public void setWithholdNo(String withholdNo) {
		this.withholdNo = withholdNo;
	}

}
