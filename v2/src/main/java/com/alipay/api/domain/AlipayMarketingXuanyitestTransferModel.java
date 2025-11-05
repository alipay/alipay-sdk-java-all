package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源化测试4.0
 *
 * @author auto create
 * @since 1.0, 2023-10-24 13:59:10
 */
public class AlipayMarketingXuanyitestTransferModel extends AlipayObject {

	private static final long serialVersionUID = 6783215984835727312L;

	/**
	 * 测试的基础描述，描述中有test，不会被aku匹配
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

	/**
	 * 测试复杂类型描述
	 */
	@ApiListField("test_21")
	@ApiField("marketingtest")
	private List<Marketingtest> test21;

	/**
	 * sasasas
	 */
	@ApiField("test_22")
	private Marketingtestt test22;

	public List<String> getTest() {
		return this.test;
	}
	public void setTest(List<String> test) {
		this.test = test;
	}

	public List<Marketingtest> getTest21() {
		return this.test21;
	}
	public void setTest21(List<Marketingtest> test21) {
		this.test21 = test21;
	}

	public Marketingtestt getTest22() {
		return this.test22;
	}
	public void setTest22(Marketingtestt test22) {
		this.test22 = test22;
	}

}
