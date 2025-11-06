package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询OB制品信息列表
 *
 * @author auto create
 * @since 1.0, 2025-06-19 15:44:02
 */
public class AnttechOceanbaseObglobalArtifactlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2714111966561942575L;

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
