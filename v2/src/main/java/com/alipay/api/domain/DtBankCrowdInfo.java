package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群信息
 *
 * @author auto create
 * @since 1.0, 2023-06-20 18:17:40
 */
public class DtBankCrowdInfo extends AlipayObject {

	private static final long serialVersionUID = 4714948982767134456L;

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
