package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用一分钟知企业文本高亮模型。前端可以根据此字段高亮行文本部分文字。
 *
 * @author auto create
 * @since 1.0, 2021-10-13 11:17:39
 */
public class CompanyOverviewHighLight extends AlipayObject {

	private static final long serialVersionUID = 3681426874638343837L;

	/**
	 * 高亮文本。前端可以根据此字段内容高亮行文本中的部分文字。
	 */
	@ApiField("high_light_text")
	private String highLightText;

	public String getHighLightText() {
		return this.highLightText;
	}
	public void setHighLightText(String highLightText) {
		this.highLightText = highLightText;
	}

}
