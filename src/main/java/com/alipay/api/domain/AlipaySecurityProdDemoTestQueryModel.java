package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 仅测试
 *
 * @author auto create
 * @since 1.0, 2019-06-26 15:42:17
 */
public class AlipaySecurityProdDemoTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8176644316395538158L;

	/**
	 * miaoshu
	 */
	@ApiField("boxiu_two")
	private BoxiuTestDSTwo boxiuTwo;

	/**
	 * 测试多级数据结构
	 */
	@ApiField("multi_level_complicated_ds")
	private BoxiuTestDS multiLevelComplicatedDs;

	/**
	 * miaoshu
	 */
	@ApiListField("tel_test")
	@ApiField("asdf")
	private List<Asdf> telTest;

	public BoxiuTestDSTwo getBoxiuTwo() {
		return this.boxiuTwo;
	}
	public void setBoxiuTwo(BoxiuTestDSTwo boxiuTwo) {
		this.boxiuTwo = boxiuTwo;
	}

	public BoxiuTestDS getMultiLevelComplicatedDs() {
		return this.multiLevelComplicatedDs;
	}
	public void setMultiLevelComplicatedDs(BoxiuTestDS multiLevelComplicatedDs) {
		this.multiLevelComplicatedDs = multiLevelComplicatedDs;
	}

	public List<Asdf> getTelTest() {
		return this.telTest;
	}
	public void setTelTest(List<Asdf> telTest) {
		this.telTest = telTest;
	}

}
