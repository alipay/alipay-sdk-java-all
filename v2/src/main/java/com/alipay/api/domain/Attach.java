package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件
 *
 * @author auto create
 * @since 1.0, 2021-09-30 15:01:44
 */
public class Attach extends AlipayObject {

	private static final long serialVersionUID = 3756817671186557283L;

	/**
	 * 法务中台文件filekey
	 */
	@ApiField("file_location")
	private String fileLocation;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	public String getFileLocation() {
		return this.fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
