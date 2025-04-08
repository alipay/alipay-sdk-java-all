package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投研知识库同步结果状态查询
 *
 * @author auto create
 * @since 1.0, 2024-01-18 17:06:20
 */
public class AntfortuneFinresearchKnowledgeStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3551374765325395679L;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
