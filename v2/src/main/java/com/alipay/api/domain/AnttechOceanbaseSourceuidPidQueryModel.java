package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据source_uid查询pid
 *
 * @author auto create
 * @since 1.0, 2026-07-28 16:15:46
 */
public class AnttechOceanbaseSourceuidPidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2177666338969581669L;

	/**
	 * 请求参数模型
	 */
	@ApiField("source_uid_pid_query_request")
	private SourceUidPidQueryRequest sourceUidPidQueryRequest;

	public SourceUidPidQueryRequest getSourceUidPidQueryRequest() {
		return this.sourceUidPidQueryRequest;
	}
	public void setSourceUidPidQueryRequest(SourceUidPidQueryRequest sourceUidPidQueryRequest) {
		this.sourceUidPidQueryRequest = sourceUidPidQueryRequest;
	}

}
