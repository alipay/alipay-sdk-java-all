package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据项目名模糊搜索项目名
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:26:31
 */
public class AnttechOceanbaseObglobalArtifactQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8621399154479665338L;

	/**
	 * 制品项目名称
	 */
	@ApiField("query_artifact_project_names_request")
	private String queryArtifactProjectNamesRequest;

	public String getQueryArtifactProjectNamesRequest() {
		return this.queryArtifactProjectNamesRequest;
	}
	public void setQueryArtifactProjectNamesRequest(String queryArtifactProjectNamesRequest) {
		this.queryArtifactProjectNamesRequest = queryArtifactProjectNamesRequest;
	}

}
