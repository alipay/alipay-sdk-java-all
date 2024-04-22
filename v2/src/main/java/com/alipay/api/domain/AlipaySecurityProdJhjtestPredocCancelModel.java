package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文档链路测试
 *
 * @author auto create
 * @since 1.0, 2024-04-19 15:00:06
 */
public class AlipaySecurityProdJhjtestPredocCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7641225859324438223L;

	/**
	 * 11111
	 */
	@ApiField("com_a")
	private JhjtestDoc comA;

	/**
	 * 添加不在迭代内的开发中2.0复杂类型，
	 */
	@ApiField("com_c")
	private JhjTestNew comC;

	/**
	 * 基础描述修改缓存11
	 */
	@ApiField("test_a")
	private String testA;

	public JhjtestDoc getComA() {
		return this.comA;
	}
	public void setComA(JhjtestDoc comA) {
		this.comA = comA;
	}

	public JhjTestNew getComC() {
		return this.comC;
	}
	public void setComC(JhjTestNew comC) {
		this.comC = comC;
	}

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

}
