package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对象存储获取文件下载地址
 *
 * @author auto create
 * @since 1.0, 2023-06-15 14:48:43
 */
public class AlipayCloudCloudrunObjectstorageDownloadurlGetModel extends AlipayObject {

	private static final long serialVersionUID = 4884226327982926915L;

	/**
	 * 环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 欲获取的文件列表
	 */
	@ApiListField("file_list")
	@ApiField("download_url_request")
	private List<DownloadUrlRequest> fileList;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public List<DownloadUrlRequest> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<DownloadUrlRequest> fileList) {
		this.fileList = fileList;
	}

}
