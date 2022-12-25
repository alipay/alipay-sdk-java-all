package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 10:18:40
 */
public class KoubeiContentContentinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7574118992731989759L;

	/** 
	 * 内容id,由内容创建成功后返回。存在返回结果实体类中的data字段内。
	 */
	@ApiField("data")
	private String data;

	/** 
	 * traceId,全链路Id.
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
