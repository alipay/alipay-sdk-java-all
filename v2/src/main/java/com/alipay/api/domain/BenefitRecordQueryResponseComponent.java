package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益流水查询组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRecordQueryResponseComponent extends AlipayObject {

	private static final long serialVersionUID = 6751955619712416122L;

	/**
	 * 权益流水查询内容
	 */
	@ApiField("content")
	private BenefitRecordQueryContent content;

	public BenefitRecordQueryContent getContent() {
		return this.content;
	}
	public void setContent(BenefitRecordQueryContent content) {
		this.content = content;
	}

}
