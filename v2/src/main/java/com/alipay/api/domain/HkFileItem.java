package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件传输复杂类型
 *
 * @author auto create
 * @since 1.0, 2026-10-21 20:02:54
 */
public class HkFileItem extends AlipayObject {

	private static final long serialVersionUID = 1655246597632337842L;

	/**
	 * 文件类别:医疗收据/医疗报告等
	 */
	@ApiField("doc_type")
	private String docType;

	/**
	 * Base64格式的文件内容
	 */
	@ApiField("file_content")
	private String fileContent;

	/**
	 * 由合作伙伴分配的唯一文件标识
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件合并顺序
	 */
	@ApiField("file_index")
	private Long fileIndex;

	/**
	 * 原始文件名,以.pdf结尾且不含路径字符
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 合作伙伴提供的可选hash(64字符hex)
	 */
	@ApiField("file_sha_256")
	private String fileSha256;

	/**
	 * 预期PDF字节大小
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 文件类型,必须为pdf
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * URL格式的文件内容
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 是否由医院提交的原始件(Yes/No)
	 */
	@ApiField("original_copy_indicator")
	private String originalCopyIndicator;

	public String getDocType() {
		return this.docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getFileContent() {
		return this.fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Long getFileIndex() {
		return this.fileIndex;
	}
	public void setFileIndex(Long fileIndex) {
		this.fileIndex = fileIndex;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSha256() {
		return this.fileSha256;
	}
	public void setFileSha256(String fileSha256) {
		this.fileSha256 = fileSha256;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getOriginalCopyIndicator() {
		return this.originalCopyIndicator;
	}
	public void setOriginalCopyIndicator(String originalCopyIndicator) {
		this.originalCopyIndicator = originalCopyIndicator;
	}

}
