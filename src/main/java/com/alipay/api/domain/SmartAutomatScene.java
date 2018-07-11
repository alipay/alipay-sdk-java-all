package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机场景信息
 *
 * @author auto create
 * @since 1.0, 2018-06-06 14:17:40
 */
public class SmartAutomatScene extends AlipayObject {

	private static final long serialVersionUID = 1896732971877252316L;

	/**
	 * 自助售货机一级场景
	 */
	@ApiField("level_1")
	private String level1;

	/**
	 * 自助售货机二级场景
	 */
	@ApiField("level_2")
	private String level2;

	public String getLevel1() {
		return this.level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}

	public String getLevel2() {
		return this.level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}

}
