package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询回单下载
 *
 * @author auto create
 * @since 1.0, 2026-06-29 12:32:55
 */
public class AlipayIserviceBillEreceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4744335912751719544L;

	/**
	 * 回单文件ID。由申请电子章回单接口返回。
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
