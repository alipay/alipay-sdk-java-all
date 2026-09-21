package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 诊断信息
 *
 * @author auto create
 * @since 1.0, 2026-09-14 14:13:01
 */
public class DiagnosisInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6176773324272398228L;

	/**
	 * 诊断内容
	 */
	@ApiField("diacrisis")
	private String diacrisis;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getDiacrisis() {
		return this.diacrisis;
	}
	public void setDiacrisis(String diacrisis) {
		this.diacrisis = diacrisis;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
