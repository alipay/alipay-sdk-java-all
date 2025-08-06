package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 适用版本信息
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:25:03
 */
public class ApplicableVersionDTO extends AlipayObject {

	private static final long serialVersionUID = 6558219419258734585L;

	/**
	 * 其他版本List
	 */
	@ApiListField("other_online_versions")
	@ApiField("ob_artifac_online_version_query_response")
	private List<ObArtifacOnlineVersionQueryResponse> otherOnlineVersions;

	/**
	 * 标准上线版本List
	 */
	@ApiListField("standard_online_versions")
	@ApiField("ob_artifac_online_version_query_response")
	private List<ObArtifacOnlineVersionQueryResponse> standardOnlineVersions;

	public List<ObArtifacOnlineVersionQueryResponse> getOtherOnlineVersions() {
		return this.otherOnlineVersions;
	}
	public void setOtherOnlineVersions(List<ObArtifacOnlineVersionQueryResponse> otherOnlineVersions) {
		this.otherOnlineVersions = otherOnlineVersions;
	}

	public List<ObArtifacOnlineVersionQueryResponse> getStandardOnlineVersions() {
		return this.standardOnlineVersions;
	}
	public void setStandardOnlineVersions(List<ObArtifacOnlineVersionQueryResponse> standardOnlineVersions) {
		this.standardOnlineVersions = standardOnlineVersions;
	}

}
