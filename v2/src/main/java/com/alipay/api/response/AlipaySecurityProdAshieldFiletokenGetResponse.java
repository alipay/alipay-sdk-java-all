package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FileTokenForUpload;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ashield.filetoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:18:41
 */
public class AlipaySecurityProdAshieldFiletokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3652882484913777393L;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 返回的具体对象
	 */
	@ApiField("res_data")
	private FileTokenForUpload resData;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResData(FileTokenForUpload resData) {
		this.resData = resData;
	}
	public FileTokenForUpload getResData( ) {
		return this.resData;
	}

}
