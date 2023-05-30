package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * patch类型接口测试
 *
 * @author auto create
 * @since 1.0, 2022-12-13 14:57:53
 */
public class AlipayOpenOperationOpenbizmockPatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5537426931396492456L;

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
