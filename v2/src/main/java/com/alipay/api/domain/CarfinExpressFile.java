package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星河快递回传文件结构
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:30:49
 */
public class CarfinExpressFile extends AlipayObject {

	private static final long serialVersionUID = 5732551241413737158L;

	/**
	 * 支付宝开放平台文件AFTSID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件标签（文件类型下的细分）
	 */
	@ApiField("tag")
	private String tag;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
