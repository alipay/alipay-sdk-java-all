package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 期数维度贴息比例，key为期数361224，value为折扣比例
 *
 * @author auto create
 * @since 1.0, 2025-07-25 09:43:37
 */
public class FqNumChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 8751296686393944378L;

	/**
	 * 分期数
	 */
	@ApiField("term")
	private String term;

	public String getTerm() {
		return this.term;
	}
	public void setTerm(String term) {
		this.term = term;
	}

}
