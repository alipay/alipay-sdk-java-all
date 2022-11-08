package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 牛客笔试报告变更回调请求体
 *
 * @author auto create
 * @since 1.0, 2022-06-06 10:52:56
 */
public class NiukeExamReportCallbackRequest extends AlipayObject {

	private static final long serialVersionUID = 2692341136948527111L;

	/**
	 * 报告文件的扩展名
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 报告文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 唯一id，即应聘id
	 */
	@ApiField("key")
	private String key;

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
