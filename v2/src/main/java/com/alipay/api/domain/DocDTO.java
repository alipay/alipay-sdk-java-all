package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政策文件信息
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:14
 */
public class DocDTO extends AlipayObject {

	private static final long serialVersionUID = 3127981997514978966L;

	/**
	 * 城市编码，支持传多个（逗号分隔）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 政策文件id
	 */
	@ApiField("doc_file_id")
	private String docFileId;

	/**
	 * 描述文件基本信息的标题
	 */
	@ApiField("doc_title")
	private String docTitle;

	/**
	 * 表示文件类型
	 */
	@ApiField("doc_type")
	private String docType;

	/**
	 * 政策文档的唯一id
	 */
	@ApiField("out_doc_id")
	private String outDocId;

	/**
	 * 语料运行状态
	 */
	@ApiField("run_status")
	private String runStatus;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDocFileId() {
		return this.docFileId;
	}
	public void setDocFileId(String docFileId) {
		this.docFileId = docFileId;
	}

	public String getDocTitle() {
		return this.docTitle;
	}
	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}

	public String getDocType() {
		return this.docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getOutDocId() {
		return this.outDocId;
	}
	public void setOutDocId(String outDocId) {
		this.outDocId = outDocId;
	}

	public String getRunStatus() {
		return this.runStatus;
	}
	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

}
