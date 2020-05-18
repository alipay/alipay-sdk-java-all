package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.file.output.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-14 20:40:33
 */
public class AlipayEbppInvoiceFileOutputQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7462653547126247396L;

	/** 
	 * 发票文件内容,需要先base64解码，获取原始byte[]类型文件流
	 */
	@ApiField("invoice_file_content")
	private String invoiceFileContent;

	public void setInvoiceFileContent(String invoiceFileContent) {
		this.invoiceFileContent = invoiceFileContent;
	}
	public String getInvoiceFileContent( ) {
		return this.invoiceFileContent;
	}

}
