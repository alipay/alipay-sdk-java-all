package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件信息对象
 *
 * @author auto create
 * @since 1.0, 2023-08-17 19:57:18
 */
public class FileInfo extends AlipayObject {

	private static final long serialVersionUID = 2243123221873439151L;

	/**
	 * 用于多类目审核，支持多个传入，最长1024字符
	 */
	@ApiField("biz_label")
	private String bizLabel;

	/**
	 * 文件类型，唯一值。 枚举值只做参考，实际情况做具体沟通
VIDEO=视频;
VOICE=语音;
PICTURE/JPG/JPEG/PNG=图片;
TEXT=文本;
DOC, DOCX, XLS, XLSX, PPT, PPTX=MS Office
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 业务素材类型（例如：INTERACTIVE代表交互稿）
	 */
	@ApiField("file_biz_type")
	private String fileBizType;

	/**
	 * 文件地址url,图片大小推荐在10M以内
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 素材外部唯一标识用于风险匹配
	 */
	@ApiField("origin_file_id")
	private String originFileId;

	public String getBizLabel() {
		return this.bizLabel;
	}
	public void setBizLabel(String bizLabel) {
		this.bizLabel = bizLabel;
	}

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

	public String getOriginFileId() {
		return this.originFileId;
	}
	public void setOriginFileId(String originFileId) {
		this.originFileId = originFileId;
	}

}
