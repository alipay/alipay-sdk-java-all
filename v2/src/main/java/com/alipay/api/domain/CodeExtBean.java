package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 桌码拓展对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:16
 */
public class CodeExtBean extends AlipayObject {

	private static final long serialVersionUID = 4869243983484882857L;

	/**
	 * 渠道信息
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 码TOKEN
	 */
	@ApiField("code_token")
	private String codeToken;

	/**
	 * 码类型
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 桌号
	 */
	@ApiField("table_name")
	private String tableName;

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getCodeToken() {
		return this.codeToken;
	}
	public void setCodeToken(String codeToken) {
		this.codeToken = codeToken;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
