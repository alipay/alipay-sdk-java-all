package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OB制品版本查询
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:25:03
 */
public class ObArtifactVersionQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 8267699422153185839L;

	/**
	 * 制品名称
	 */
	@ApiField("artifact_name")
	private String artifactName;

	public String getArtifactName() {
		return this.artifactName;
	}
	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}

}
