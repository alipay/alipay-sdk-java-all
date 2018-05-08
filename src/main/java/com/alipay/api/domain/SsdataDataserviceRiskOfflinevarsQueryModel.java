package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离线变量查询
 *
 * @author auto create
 * @since 1.0, 2017-11-30 15:43:39
 */
public class SsdataDataserviceRiskOfflinevarsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5773153155151468225L;

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
