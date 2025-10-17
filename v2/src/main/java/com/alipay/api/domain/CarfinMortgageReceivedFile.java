package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星河从抵押/车务服务商接收到的文件
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:29:22
 */
public class CarfinMortgageReceivedFile extends AlipayObject {

	private static final long serialVersionUID = 1164736126242893164L;

	/**
	 * 文件在开放平台的aftsId
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件标签，文件类型下更细致的分类
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 传输版本，不同的版本文件位置、加密处理、压缩处理等可能不同。
当前版本为1，后续更新时会进行通知
	 */
	@ApiField("transfer_version")
	private String transferVersion;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
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
