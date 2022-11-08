package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云文件详情查询
 *
 * @author auto create
 * @since 1.0, 2022-09-16 15:22:27
 */
public class AlipayOpenMiniCloudFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2652122869669622333L;

	/**
	 * 云环境ID,在云托管平台获取
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public String getCloudId() {
		return this.cloudId;
	}
	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
