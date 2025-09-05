package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obccontract.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 17:02:37
 */
public class AnttechOceanbaseObccontractCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6317821533868222199L;

	/** 
	 * 文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/** 
	 * 用印流水号
	 */
	@ApiField("seal_request_id")
	private String sealRequestId;

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

	public void setSealRequestId(String sealRequestId) {
		this.sealRequestId = sealRequestId;
	}
	public String getSealRequestId( ) {
		return this.sealRequestId;
	}

}
