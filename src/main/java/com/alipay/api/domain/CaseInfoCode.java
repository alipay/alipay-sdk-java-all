package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 案件欺诈相关情报代码
 *
 * @author auto create
 * @since 1.0, 2018-04-12 16:01:02
 */
public class CaseInfoCode extends AlipayObject {

	private static final long serialVersionUID = 2746286128216187612L;

	/**
	 * 情报代码，具体见《案件情报类型代码V1》
	 */
	@ApiField("info_code")
	private String infoCode;

	/**
	 * 情报描述信息
	 */
	@ApiField("info_code_desc")
	private String infoCodeDesc;

	public String getInfoCode() {
		return this.infoCode;
	}
	public void setInfoCode(String infoCode) {
		this.infoCode = infoCode;
	}

	public String getInfoCodeDesc() {
		return this.infoCodeDesc;
	}
	public void setInfoCodeDesc(String infoCodeDesc) {
		this.infoCodeDesc = infoCodeDesc;
	}

}
