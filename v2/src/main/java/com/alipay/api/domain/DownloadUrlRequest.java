package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取下载文件地址请求
 *
 * @author auto create
 * @since 1.0, 2023-06-15 14:48:43
 */
public class DownloadUrlRequest extends AlipayObject {

	private static final long serialVersionUID = 5583761398181483425L;

	/**
	 * 文件下载地址过期时间，传0表示长期有效
	 */
	@ApiField("expire")
	private Long expire;

	/**
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	public Long getExpire() {
		return this.expire;
	}
	public void setExpire(Long expire) {
		this.expire = expire;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
