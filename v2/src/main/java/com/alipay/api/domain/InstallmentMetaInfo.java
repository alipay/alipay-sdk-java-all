package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期对象的元数据信息
 *
 * @author auto create
 * @since 1.0, 2022-12-20 14:16:09
 */
public class InstallmentMetaInfo extends AlipayObject {

	private static final long serialVersionUID = 4545215639974353938L;

	/**
	 * 结束期数，包含此值
	 */
	@ApiField("end_term")
	private Long endTerm;

	/**
	 * 开始期数，包含此值
	 */
	@ApiField("start_term")
	private Long startTerm;

	/**
	 * 分期值（如还款方式、利率等）
	 */
	@ApiField("value")
	private String value;

	public Long getEndTerm() {
		return this.endTerm;
	}
	public void setEndTerm(Long endTerm) {
		this.endTerm = endTerm;
	}

	public Long getStartTerm() {
		return this.startTerm;
	}
	public void setStartTerm(Long startTerm) {
		this.startTerm = startTerm;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
