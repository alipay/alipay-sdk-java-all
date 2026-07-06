package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康健管平台文件流OSS上传
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:57:45
 */
public class AlipayCommerceMedicalFileSteamUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2851116763121665136L;

	/**
	 * 业务流水号，对应支付宝SAAS订单ID
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 文件二进制流转换后的十六进制字符串
	 */
	@ApiField("file_content")
	private String fileContent;

	/**
	 * 文件编码
	 */
	@ApiField("file_no")
	private String fileNo;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getFileContent() {
		return this.fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getFileNo() {
		return this.fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
