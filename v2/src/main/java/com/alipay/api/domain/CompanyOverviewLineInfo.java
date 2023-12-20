package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁企业信用一分钟知企业，行文本模型
 *
 * @author auto create
 * @since 1.0, 2021-10-13 11:17:39
 */
public class CompanyOverviewLineInfo extends AlipayObject {

	private static final long serialVersionUID = 6649725179375573476L;

	/**
	 * 行文本。企业某个维度的描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 高亮文本列表
	 */
	@ApiListField("high_light_model_list")
	@ApiField("company_overview_high_light")
	private List<CompanyOverviewHighLight> highLightModelList;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<CompanyOverviewHighLight> getHighLightModelList() {
		return this.highLightModelList;
	}
	public void setHighLightModelList(List<CompanyOverviewHighLight> highLightModelList) {
		this.highLightModelList = highLightModelList;
	}

}
