package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单文件上传至蚂蚁
 *
 * @author auto create
 * @since 1.0, 2019-10-23 21:29:52
 */
public class AlipayInsAutoAutoaftermarketAttachmentUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4185178325896473142L;

	/**
	 * 蚂蚁业务单号(上传修理厂附件时，该字段可为空
;上传维修中底漆照片时，传蚂蚁服务申请单号
)
	 */
	@ApiField("ant_biz_id")
	private String antBizId;

	/**
	 * CC_DEPOT_INFO_PICTURE("CC_DEPOT_INFO_PICTURE", "CC修理厂照片"),
CC_CONSUME_REPAIR_CAR("CC_CONSUME_REPAIR_CAR", "CC核销修车"),;
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("extra")
	private String extra;

	/**
	 * DEPOT_BANNER_PICTURE("DEPOT_BANNER_PICTURE", "修理厂广告图"),
DEPOT_THUMBNAIL_PICTURE("DEPOT_THUMBNAIL_PICTURE", "修理厂缩略图"),
REPAIRING_PICTURE("REPAIRING_PICTURE", "修理中影像"),
	 */
	@ApiField("file_biz_code")
	private String fileBizCode;

	/**
	 * 文件内容
	 */
	@ApiField("file_content")
	private String fileContent;

	/**
	 * 附件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * AFTS("AFTS", "阿凡提系统"),
OSS("OSS", "阿里云OSS");
	 */
	@ApiField("file_store_type")
	private String fileStoreType;

	/**
	 * IMAGE("IMAGE", "图片"),
VIDEO("VIDEO", "视频"),
AUDIO("AUDIO", "音频"),
OTHER("OTHER", "其他");
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 外部业务单号(上传修理厂附件信息时传修理厂id,
上传修理厂底漆照片时传商户服务申请单号)
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 文件路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 文件上传时间
	 */
	@ApiField("upload_time")
	private Date uploadTime;

	public String getAntBizId() {
		return this.antBizId;
	}
	public void setAntBizId(String antBizId) {
		this.antBizId = antBizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtra() {
		return this.extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getFileBizCode() {
		return this.fileBizCode;
	}
	public void setFileBizCode(String fileBizCode) {
		this.fileBizCode = fileBizCode;
	}

	public String getFileContent() {
		return this.fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileStoreType() {
		return this.fileStoreType;
	}
	public void setFileStoreType(String fileStoreType) {
		this.fileStoreType = fileStoreType;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

}
