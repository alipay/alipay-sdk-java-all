package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标的详情
 *
 * @author auto create
 * @since 1.0, 2024-04-18 15:45:53
 */
public class FinSymbolDetail extends AlipayObject {

	private static final long serialVersionUID = 2352423529991625351L;

	/**
	 * 标的编码
	 */
	@ApiField("symbol_code")
	private String symbolCode;

	/**
	 * 标的名称
	 */
	@ApiField("symbol_name")
	private String symbolName;

	public String getSymbolCode() {
		return this.symbolCode;
	}
	public void setSymbolCode(String symbolCode) {
		this.symbolCode = symbolCode;
	}

	public String getSymbolName() {
		return this.symbolName;
	}
	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

}
