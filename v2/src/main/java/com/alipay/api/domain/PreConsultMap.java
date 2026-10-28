package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于承载Map类型的api参数
 *
 * @author auto create
 * @since 1.0, 2026-10-09 17:06:12
 */
public class PreConsultMap extends AlipayObject {

	private static final long serialVersionUID = 5887419956877439212L;

	/**
	 * v1等级下的花呗金返回比例
	 */
	@ApiField("v_1")
	private String v1;

	/**
	 * v2等级下的花呗金返回比例
	 */
	@ApiField("v_2")
	private String v2;

	/**
	 * v3等级下的花呗金返回比例
	 */
	@ApiField("v_3")
	private String v3;

	/**
	 * v4等级下的花呗金返回比例
	 */
	@ApiField("v_4")
	private String v4;

	public String getV1() {
		return this.v1;
	}
	public void setV1(String v1) {
		this.v1 = v1;
	}

	public String getV2() {
		return this.v2;
	}
	public void setV2(String v2) {
		this.v2 = v2;
	}

	public String getV3() {
		return this.v3;
	}
	public void setV3(String v3) {
		this.v3 = v3;
	}

	public String getV4() {
		return this.v4;
	}
	public void setV4(String v4) {
		this.v4 = v4;
	}

}
