package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾内容识别
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:05:35
 */
public class SsdataDataserviceRiskContentVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8774895895588671362L;

	/**
	 * 需要识别的文本，不要包含特殊字符以及双引号等可能引起json格式化错误问题的字符
	 */
	@ApiField("content")
	private String content;

	/**
	 * 风险类型，0-垃圾广告，1-暴恐政， 2-涉黄， 3-涉毒，4-涉赌
	 */
	@ApiField("risk_type")
	private String riskType;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
