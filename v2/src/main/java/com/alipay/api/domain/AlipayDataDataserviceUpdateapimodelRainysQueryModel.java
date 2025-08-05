package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模型升级_数组
 *
 * @author auto create
 * @since 1.0, 2024-11-15 17:03:27
 */
public class AlipayDataDataserviceUpdateapimodelRainysQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4698714626937161624L;

	/**
	 * 123
	 */
	@ApiListField("array_tc_1")
	@ApiField("string")
	private List<String> arrayTc1;

	/**
	 * 存量数据修改
	 */
	@ApiField("rainy_test")
	private String rainyTest;

	public List<String> getArrayTc1() {
		return this.arrayTc1;
	}
	public void setArrayTc1(List<String> arrayTc1) {
		this.arrayTc1 = arrayTc1;
	}

	public String getRainyTest() {
		return this.rainyTest;
	}
	public void setRainyTest(String rainyTest) {
		this.rainyTest = rainyTest;
	}

}
