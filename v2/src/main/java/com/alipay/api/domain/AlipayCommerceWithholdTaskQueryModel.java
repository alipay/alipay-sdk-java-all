package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务查询
 *
 * @author auto create
 * @since 1.0, 2024-12-12 16:21:36
 */
public class AlipayCommerceWithholdTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5548848679213141517L;

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
