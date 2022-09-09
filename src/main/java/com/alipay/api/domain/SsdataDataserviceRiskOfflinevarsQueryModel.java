package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离线变量查询
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:06:52
 */
public class SsdataDataserviceRiskOfflinevarsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1656673396138593147L;

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
