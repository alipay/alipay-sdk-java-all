package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子签应用，文件信息
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:28
 */
public class AntlescenterFileDTO extends AlipayObject {

	private static final long serialVersionUID = 4278984222192577432L;

	/**
	 * 文件日期
	 */
	@ApiField("file_date")
	private Date fileDate;

	/**
	 * 文件hash
	 */
	@ApiField("file_hash")
	private String fileHash;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件key
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 文件md5摘要值
	 */
	@ApiField("file_md_5")
	private String fileMd5;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件页数，页
	 */
	@ApiField("file_pages")
	private Long filePages;

	/**
	 * 文件大小,B
	 */
	@ApiField("file_size")
	private String fileSize;

	/**
	 * 文件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 印章用印信息
	 */
	@ApiListField("selected_seal_position_list")
	@ApiField("selected_seal_position")
	private List<SelectedSealPosition> selectedSealPositionList;

	/**
	 * 骑缝章用印信息
	 */
	@ApiListField("signed_cross_results")
	@ApiField("signed_cross_result")
	private List<SignedCrossResult> signedCrossResults;

	public Date getFileDate() {
		return this.fileDate;
	}
	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileHash() {
		return this.fileHash;
	}
	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getFileMd5() {
		return this.fileMd5;
	}
	public void setFileMd5(String fileMd5) {
		this.fileMd5 = fileMd5;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFilePages() {
		return this.filePages;
	}
	public void setFilePages(Long filePages) {
		this.filePages = filePages;
	}

	public String getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public List<SelectedSealPosition> getSelectedSealPositionList() {
		return this.selectedSealPositionList;
	}
	public void setSelectedSealPositionList(List<SelectedSealPosition> selectedSealPositionList) {
		this.selectedSealPositionList = selectedSealPositionList;
	}

	public List<SignedCrossResult> getSignedCrossResults() {
		return this.signedCrossResults;
	}
	public void setSignedCrossResults(List<SignedCrossResult> signedCrossResults) {
		this.signedCrossResults = signedCrossResults;
	}

}
