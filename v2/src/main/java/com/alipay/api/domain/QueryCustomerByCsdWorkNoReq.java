package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求参数
 *
 * @author auto create
 * @since 1.0, 2026-06-23 14:42:57
 */
public class QueryCustomerByCsdWorkNoReq extends AlipayObject {

	private static final long serialVersionUID = 6529924754675574783L;

	/**
	 * csd工号
	 */
	@ApiField("csd_work_no")
	private String csdWorkNo;

	public String getCsdWorkNo() {
		return this.csdWorkNo;
	}
	public void setCsdWorkNo(String csdWorkNo) {
		this.csdWorkNo = csdWorkNo;
	}

}
