package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险大脑数据查询
 *
 * @author auto create
 * @since 1.0, 2018-07-18 21:11:08
 */
public class AlipaySecurityRiskOfflinevarsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7586156325325798126L;

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
