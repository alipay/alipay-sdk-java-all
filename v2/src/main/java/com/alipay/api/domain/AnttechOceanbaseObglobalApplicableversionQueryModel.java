package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询适用版本列表
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:25:03
 */
public class AnttechOceanbaseObglobalApplicableversionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8324754978391828214L;

	/**
	 * 版本名称
	 */
	@ApiField("query_applicable_version_request")
	private ObArtifactVersionQueryRequest queryApplicableVersionRequest;

	public ObArtifactVersionQueryRequest getQueryApplicableVersionRequest() {
		return this.queryApplicableVersionRequest;
	}
	public void setQueryApplicableVersionRequest(ObArtifactVersionQueryRequest queryApplicableVersionRequest) {
		this.queryApplicableVersionRequest = queryApplicableVersionRequest;
	}

}
