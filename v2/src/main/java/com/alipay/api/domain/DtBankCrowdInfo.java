package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群信息
 *
 * @author auto create
 * @since 1.0, 2024-03-28 14:05:06
 */
public class DtBankCrowdInfo extends AlipayObject {

	private static final long serialVersionUID = 4264358711198847416L;

	/**
	 * 人群编码
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

}
