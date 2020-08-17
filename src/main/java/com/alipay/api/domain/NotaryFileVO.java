package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约文件对象信息
 *
 * @author auto create
 * @since 1.0, 2020-03-25 15:57:56
 */
public class NotaryFileVO extends AlipayObject {

	private static final long serialVersionUID = 3265339791836789185L;

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

}
