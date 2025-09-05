package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 制品项目DTO
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:26:31
 */
public class ArtifactProjectNameDTO extends AlipayObject {

	private static final long serialVersionUID = 1182845752989719553L;

	/**
	 * 制品项目列表
	 */
	@ApiListField("artifact_project_name_list")
	@ApiField("string")
	private List<String> artifactProjectNameList;

	public List<String> getArtifactProjectNameList() {
		return this.artifactProjectNameList;
	}
	public void setArtifactProjectNameList(List<String> artifactProjectNameList) {
		this.artifactProjectNameList = artifactProjectNameList;
	}

}
