package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除文件夹
 *
 * @author auto create
 * @since 1.0, 2024-06-03 12:13:37
 */
public class AlipayCloudCloudrunStorageDirectoryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1588361743366214957L;

	/**
	 * 要删除的文件名称
	 */
	@ApiField("dir_name")
	private String dirName;

	/**
	 * 环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 要删除的文件的路径
	 */
	@ApiField("path")
	private String path;

	public String getDirName() {
		return this.dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
