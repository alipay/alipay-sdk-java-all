package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预受理文件信息
 *
 * @author auto create
 * @since 1.0, 2025-09-17 17:37:24
 */
public class CarfinMortgagePreApproveFile extends AlipayObject {

	private static final long serialVersionUID = 6391713954137944694L;

	/**
	 * 文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 文件标签
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 传输版本，不同的版本文件位置、加密处理、压缩处理等可能不同。
当前版本为1，后续更新时会进行通知。
	 */
	@ApiField("transfer_version")
	private String transferVersion;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTransferVersion() {
		return this.transferVersion;
	}
	public void setTransferVersion(String transferVersion) {
		this.transferVersion = transferVersion;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
