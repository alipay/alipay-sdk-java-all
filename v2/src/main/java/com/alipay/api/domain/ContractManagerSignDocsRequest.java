package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署文档
 *
 * @author auto create
 * @since 1.0, 2020-05-19 13:56:28
 */
public class ContractManagerSignDocsRequest extends AlipayObject {

	private static final long serialVersionUID = 8822622711237195189L;

	/**
	 * 签署文件fileId
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 签署文档文件
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 签署文档总页数
	 */
	@ApiField("total_page")
	private String totalPage;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTotalPage() {
		return this.totalPage;
	}
	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

}
