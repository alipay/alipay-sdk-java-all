package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 错误码测试
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:08:14
 */
public class AlipaySecurityDataSchemaapiRainytestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8394582776936387236L;

	/**
	 * test
	 */
	@ApiField("demo_body")
	private String demoBody;

	/**
	 * test
	 */
	@ApiField("demo_path")
	private String demoPath;

	/**
	 * null
	 */
	@ApiListField("demo_query")
	@ApiField("string")
	private List<String> demoQuery;

	/**
	 * 测试
	 */
	@ApiField("test")
	private UserInfoDemo test;

	public String getDemoBody() {
		return this.demoBody;
	}
	public void setDemoBody(String demoBody) {
		this.demoBody = demoBody;
	}

	public String getDemoPath() {
		return this.demoPath;
	}
	public void setDemoPath(String demoPath) {
		this.demoPath = demoPath;
	}

	public List<String> getDemoQuery() {
		return this.demoQuery;
	}
	public void setDemoQuery(List<String> demoQuery) {
		this.demoQuery = demoQuery;
	}

	public UserInfoDemo getTest() {
		return this.test;
	}
	public void setTest(UserInfoDemo test) {
		this.test = test;
	}

}
