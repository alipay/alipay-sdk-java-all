package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保额选项
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:22:25
 */
public class InsOption extends AlipayObject {

	private static final long serialVersionUID = 4795412162883227288L;

	/**
	 * 保额key
	 */
	@ApiField("coverage")
	private String coverage;

	/**
	 * 保额value
	 */
	@ApiField("coverage_text")
	private String coverageText;

	public String getCoverage() {
		return this.coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getCoverageText() {
		return this.coverageText;
	}
	public void setCoverageText(String coverageText) {
		this.coverageText = coverageText;
	}

}
