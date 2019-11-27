package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 徐伟波测试专用
 *
 * @author auto create
 * @since 1.0, 2018-04-18 11:06:28
 */
public class AlipayBossFncXwbtestRetModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4463956828133129486L;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
