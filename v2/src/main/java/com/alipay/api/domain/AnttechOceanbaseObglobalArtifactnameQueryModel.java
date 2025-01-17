package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据制品项目名称查询制品名称
 *
 * @author auto create
 * @since 1.0, 2023-11-07 16:26:57
 */
public class AnttechOceanbaseObglobalArtifactnameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7524329767453444638L;

	/**
	 * 制品平台上打包制品归属的项目名
	 */
	@ApiField("query_artifact_name_request")
	private String queryArtifactNameRequest;

	public String getQueryArtifactNameRequest() {
		return this.queryArtifactNameRequest;
	}
	public void setQueryArtifactNameRequest(String queryArtifactNameRequest) {
		this.queryArtifactNameRequest = queryArtifactNameRequest;
	}

}
