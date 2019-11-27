package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试复杂类型接口
 *
 * @author auto create
 * @since 1.0, 2018-12-17 19:52:36
 */
public class AlipayCommerceDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6495823529876827951L;

	/**
	 * 1
	 */
	@ApiField("arg_test")
	private SongxianTest argTest;

	public SongxianTest getArgTest() {
		return this.argTest;
	}
	public void setArgTest(SongxianTest argTest) {
		this.argTest = argTest;
	}

}
