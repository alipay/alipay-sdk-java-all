package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问答模型，包含问题和回答
 *
 * @author auto create
 * @since 1.0, 2025-02-24 15:08:24
 */
public class FaqModel extends AlipayObject {

	private static final long serialVersionUID = 2842683722251261315L;

	/**
	 * 回答
	 */
	@ApiField("column_a")
	private String columnA;

	/**
	 * 问题
	 */
	@ApiField("column_q")
	private String columnQ;

	public String getColumnA() {
		return this.columnA;
	}
	public void setColumnA(String columnA) {
		this.columnA = columnA;
	}

	public String getColumnQ() {
		return this.columnQ;
	}
	public void setColumnQ(String columnQ) {
		this.columnQ = columnQ;
	}

}
