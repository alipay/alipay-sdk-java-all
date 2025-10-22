package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询对象
 *
 * @author auto create
 * @since 1.0, 2025-09-11 13:45:32
 */
public class HeXiQueryVo extends AlipayObject {

	private static final long serialVersionUID = 1845168878256153911L;

	/**
	 * db模式
	 */
	@ApiField("db_mode")
	private String dbMode;

	public String getDbMode() {
		return this.dbMode;
	}
	public void setDbMode(String dbMode) {
		this.dbMode = dbMode;
	}

}
