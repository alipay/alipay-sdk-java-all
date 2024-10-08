package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人工审核的风控信息
 *
 * @author auto create
 * @since 1.0, 2024-06-06 12:00:01
 */
public class RentManualRiskDetail extends AlipayObject {

	private static final long serialVersionUID = 1611379313272844484L;

	/**
	 * 人工审核的判断依据和备注信息
	 */
	@ApiField("judge")
	private String judge;

	/**
	 * 是否审核通过
	 */
	@ApiField("pass")
	private Boolean pass;

	public String getJudge() {
		return this.judge;
	}
	public void setJudge(String judge) {
		this.judge = judge;
	}

	public Boolean getPass() {
		return this.pass;
	}
	public void setPass(Boolean pass) {
		this.pass = pass;
	}

}
