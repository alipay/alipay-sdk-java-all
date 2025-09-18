package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发放组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:54
 */
public class BenefitActionResponseComponent extends AlipayObject {

	private static final long serialVersionUID = 7295339539182688832L;

	/**
	 * 内容
	 */
	@ApiField("content")
	private BenefitActionContent content;

	public BenefitActionContent getContent() {
		return this.content;
	}
	public void setContent(BenefitActionContent content) {
		this.content = content;
	}

}
