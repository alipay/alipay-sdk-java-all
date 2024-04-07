package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泛金机构关键词识别
 *
 * @author auto create
 * @since 1.0, 2023-04-17 20:21:15
 */
public class AlipayFinancialnetAuthKeywordIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7364256227963946367L;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
