package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询对象
 *
 * @author auto create
 * @since 1.0, 2024-12-06 11:27:20
 */
public class HeXiQueryVo extends AlipayObject {

	private static final long serialVersionUID = 5138149788252944286L;

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
