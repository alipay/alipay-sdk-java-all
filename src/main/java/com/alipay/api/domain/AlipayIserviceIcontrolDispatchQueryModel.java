package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客服智能调度查询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-26 21:01:13
 */
public class AlipayIserviceIcontrolDispatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6518817346634156216L;

	/**
	 * 业务类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 问题级别
	 */
	@ApiField("question_level")
	private String questionLevel;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getQuestionLevel() {
		return this.questionLevel;
	}
	public void setQuestionLevel(String questionLevel) {
		this.questionLevel = questionLevel;
	}

}
