package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试模型
 *
 * @author auto create
 * @since 1.0, 2019-09-11 17:07:26
 */
public class LtTestTwo extends AlipayObject {

	private static final long serialVersionUID = 6482854864896777448L;

	/**
	 * 1
	 */
	@ApiField("a_id")
	private String aId;

	/**
	 * 2
	 */
	@ApiField("b_id")
	private String bId;

	public String getaId() {
		return this.aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getbId() {
		return this.bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}

}
