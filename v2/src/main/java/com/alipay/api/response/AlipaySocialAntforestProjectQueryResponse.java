package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.project.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 15:34:00
 */
public class AlipaySocialAntforestProjectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3235441275871844736L;

	/** 
	 * 请联系接口开发人员咨询相关参数
	 */
	@ApiListField("projects")
	@ApiField("string")
	private List<String> projects;

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public List<String> getProjects( ) {
		return this.projects;
	}

}
