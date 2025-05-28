package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 版本详细信息
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:25:03
 */
public class ObArtifacOnlineVersionQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 4796345279793419641L;

	/**
	 * 制品id
	 */
	@ApiField("artifact_id")
	private String artifactId;

	/**
	 * 制品上线版本
	 */
	@ApiField("online_version")
	private String onlineVersion;

	public String getArtifactId() {
		return this.artifactId;
	}
	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getOnlineVersion() {
		return this.onlineVersion;
	}
	public void setOnlineVersion(String onlineVersion) {
		this.onlineVersion = onlineVersion;
	}

}
