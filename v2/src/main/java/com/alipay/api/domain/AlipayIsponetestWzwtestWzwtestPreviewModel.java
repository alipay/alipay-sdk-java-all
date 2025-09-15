package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * manjiang测试接口
 *
 * @author auto create
 * @since 1.0, 2024-07-03 15:42:30
 */
public class AlipayIsponetestWzwtestWzwtestPreviewModel extends AlipayObject {

	private static final long serialVersionUID = 4559272819327315591L;

	/**
	 * number_d
	 */
	@ApiField("number_d")
	private Long numberD;

	/**
	 * 1
	 */
	@ApiField("s")
	private Long s;

	/**
	 * 1
	 */
	@ApiField("ss")
	private String ss;

	public Long getNumberD() {
		return this.numberD;
	}
	public void setNumberD(Long numberD) {
		this.numberD = numberD;
	}

	public Long getS() {
		return this.s;
	}
	public void setS(Long s) {
		this.s = s;
	}

	public String getSs() {
		return this.ss;
	}
	public void setSs(String ss) {
		this.ss = ss;
	}

}
