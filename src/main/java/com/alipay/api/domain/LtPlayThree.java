package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模型测试
 *
 * @author auto create
 * @since 1.0, 2019-11-12 17:41:05
 */
public class LtPlayThree extends AlipayObject {

	private static final long serialVersionUID = 5452454738159173567L;

	/**
	 * 111
	 */
	@ApiField("a_ids")
	private LtTestTwo aIds;

	public LtTestTwo getaIds() {
		return this.aIds;
	}
	public void setaIds(LtTestTwo aIds) {
		this.aIds = aIds;
	}

}
