package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件信息对象
 *
 * @author auto create
 * @since 1.0, 2021-05-07 20:39:26
 */
public class FileInfo extends AlipayObject {

	private static final long serialVersionUID = 6659487876676726273L;

	/**
	 * 文件类型，唯一值，枚举。 VIDEO=视频;VOICE=语音;PICTURE=图片;TEXT=文本
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 业务素材类型（例如：INTERACTIVE代表交互稿）
	 */
	@ApiField("file_biz_type")
	private String fileBizType;

	/**
	 * 文件地址url
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getFileBizType() {
		return this.fileBizType;
	}
	public void setFileBizType(String fileBizType) {
		this.fileBizType = fileBizType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
