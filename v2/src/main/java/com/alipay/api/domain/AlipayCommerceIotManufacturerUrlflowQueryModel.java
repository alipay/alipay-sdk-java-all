package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 厂商非sdk修改流水查询
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:28:23
 */
public class AlipayCommerceIotManufacturerUrlflowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1795981333729564414L;

	/**
	 * 流水号
	 */
	@ApiField("flow_no")
	private String flowNo;

	public String getFlowNo() {
		return this.flowNo;
	}
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}

}
