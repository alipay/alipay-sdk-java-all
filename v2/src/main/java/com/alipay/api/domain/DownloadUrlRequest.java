package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取下载文件地址请求
 *
 * @author auto create
 * @since 1.0, 2023-07-27 15:25:49
 */
public class DownloadUrlRequest extends AlipayObject {

	private static final long serialVersionUID = 4693625863352513929L;

	/**
	 * 文件下载地址过期时间，单位为秒，传0表示长期有效。注意：非公开(public-read) acl的文件无法获取长期有效的下载地址
	 */
	@ApiField("expire")
	private Long expire;

	/**
	 * 文件ID(唯一)，文件的唯一索引ID，上传文件后系统会创建返回该文件的文件ID
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
