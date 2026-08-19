package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询OB制品信息列表
 *
 * @author auto create
 * @since 1.0, 2026-08-18 19:37:17
 */
public class AnttechOceanbaseObglobalArtifactlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6297292374779761346L;

	/**
	 * ob制品查询条件
	 */
	@ApiField("query_ob_artifact_list_request")
	private QueryObArtifactListRequest queryObArtifactListRequest;

	public QueryObArtifactListRequest getQueryObArtifactListRequest() {
		return this.queryObArtifactListRequest;
	}
	public void setQueryObArtifactListRequest(QueryObArtifactListRequest queryObArtifactListRequest) {
		this.queryObArtifactListRequest = queryObArtifactListRequest;
	}

}
