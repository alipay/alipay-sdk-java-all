package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试put类型接口
 *
 * @author auto create
 * @since 1.0, 2022-12-27 15:36:54
 */
public class AlipayOpenOperationOpenbizmockPutQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2161912976485495317L;

	/**
	 * test
	 */
	@ApiField("b_query")
	private String bQuery;

	/**
	 * test
	 */
	@ApiField("c_body")
	private String cBody;

	public String getbQuery() {
		return this.bQuery;
	}
	public void setbQuery(String bQuery) {
		this.bQuery = bQuery;
	}

	public String getcBody() {
		return this.cBody;
	}
	public void setcBody(String cBody) {
		this.cBody = cBody;
	}

}
