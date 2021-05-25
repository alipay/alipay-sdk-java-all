package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险大脑数据查询
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:06:43
 */
public class AlipaySecurityRiskOfflinevarsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4685928797438421579L;

	/**
	 * 查询离线变量的主键
	 */
	@ApiField("rowkeys")
	private String rowkeys;

	public String getRowkeys() {
		return this.rowkeys;
	}
	public void setRowkeys(String rowkeys) {
		this.rowkeys = rowkeys;
	}

}
