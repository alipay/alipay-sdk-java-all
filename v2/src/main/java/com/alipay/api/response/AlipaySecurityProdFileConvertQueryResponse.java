package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.file.convert.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 13:52:21
 */
public class AlipaySecurityProdFileConvertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3813746295585311343L;

	/** 
	 * pdf完整文件地址
	 */
	@ApiField("pdf_presigned_url")
	private String pdfPresignedUrl;

	/** 
	 * true表示异步任务结束，false表示未结束
	 */
	@ApiField("task_result")
	private Boolean taskResult;

	public void setPdfPresignedUrl(String pdfPresignedUrl) {
		this.pdfPresignedUrl = pdfPresignedUrl;
	}
	public String getPdfPresignedUrl( ) {
		return this.pdfPresignedUrl;
	}

	public void setTaskResult(Boolean taskResult) {
		this.taskResult = taskResult;
	}
	public Boolean getTaskResult( ) {
		return this.taskResult;
	}

}
