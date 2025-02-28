package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同文件信息
 *
 * @author auto create
 * @since 1.0, 2020-11-04 15:26:37
 */
public class ContractFileVO extends AlipayObject {

	private static final long serialVersionUID = 4357243993327181367L;

	/**
	 * 文件地址
	 */
	@ApiField("file_addr")
	private String fileAddr;

	/**
	 * 文件名称
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
