package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xinjian
 *
 * @author auto create
 * @since 1.0, 2023-12-13 09:34:43
 */
public class AlipaySecurityJhjtestaaTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4115496827969892835L;

	/**
	 * 撒旦撒旦
	 */
	@ApiField("ap_id")
	private String apId;

	/**
	 * 撒旦撒旦
	 */
	@ApiField("ap_open_id")
	private String apOpenId;

	/**
	 * 1
	 */
	@ApiField("complex_pri")
	private PriNestOther complexPri;

	public String getApId() {
		return this.apId;
	}
	public void setApId(String apId) {
		this.apId = apId;
	}

	public String getApOpenId() {
		return this.apOpenId;
	}
	public void setApOpenId(String apOpenId) {
		this.apOpenId = apOpenId;
	}

	public PriNestOther getComplexPri() {
		return this.complexPri;
	}
	public void setComplexPri(PriNestOther complexPri) {
		this.complexPri = complexPri;
	}

}
