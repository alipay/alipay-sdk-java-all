package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建凤蝶H5应用
 *
 * @author auto create
 * @since 1.0, 2021-01-06 16:28:05
 */
public class AlipayMarketingToolFengdieActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8692429418253943354L;

	/**
	 * H5应用初始化数据
	 */
	@ApiField("activity")
	private FengdieActivityCreateData activity;

	/**
	 * 凤蝶模板包唯一id，通过<a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.tool.fengdie.template.query">alipay.marketing.tool.fengdie.template.query</a>接口中获取。
	 */
	@ApiField("template_id")
	private Long templateId;

	public FengdieActivityCreateData getActivity() {
		return this.activity;
	}
	public void setActivity(FengdieActivityCreateData activity) {
		this.activity = activity;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
