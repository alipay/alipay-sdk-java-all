package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:02:43
 */
public class AntSignFile extends AlipayObject {

	private static final long serialVersionUID = 7495939752773836697L;

	/**
	 * 内部TR接入传入：非蚂蚁内网域名，提前联系技术对接负责人添加域名白名单。与fileKey二选一，推荐接入oss，传递fileKey
	 */
	@ApiField("file_http_url")
	private String fileHttpUrl;

	/**
	 * 单次请求文件唯一id，与CaSystemSignFileRequest中的fileId对应
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 推荐使用目录：ESIGN/你的应用名/日期/随机数/你的文件名 例：ESIGN/cif/20230801/201212112/aa.pdf。保证每次请求的fileKey不同，不同请求用同一个fileKey存在文件覆盖问题！！！
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	public String getFileHttpUrl() {
		return this.fileHttpUrl;
	}
	public void setFileHttpUrl(String fileHttpUrl) {
		this.fileHttpUrl = fileHttpUrl;
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

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
