package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约文件对象信息
 *
 * @author auto create
 * @since 1.0, 2020-11-04 15:25:58
 */
public class NotaryFileVO extends AlipayObject {

	private static final long serialVersionUID = 2233825547293923562L;

	/**
	 * 文件http地址
	 */
	@ApiField("file_addr")
	private String fileAddr;

	/**
	 * 合同名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 用于标识某个文件
	 */
	@ApiField("file_uniq_id")
	private String fileUniqId;

	public String getFileAddr() {
		return this.fileAddr;
	}
	public void setFileAddr(String fileAddr) {
		this.fileAddr = fileAddr;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUniqId() {
		return this.fileUniqId;
	}
	public void setFileUniqId(String fileUniqId) {
		this.fileUniqId = fileUniqId;
	}

}
