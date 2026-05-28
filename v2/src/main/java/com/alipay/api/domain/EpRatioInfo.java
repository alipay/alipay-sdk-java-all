package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业持股信息
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:15:02
 */
public class EpRatioInfo extends AlipayObject {

	private static final long serialVersionUID = 3496421963635742728L;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("crn")
	private String crn;

	/**
	 * 集团名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 持股比例
	 */
	@ApiField("ratio")
	private String ratio;

	public String getCrn() {
		return this.crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

}
