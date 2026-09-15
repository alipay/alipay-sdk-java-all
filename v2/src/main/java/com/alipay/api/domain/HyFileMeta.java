package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-31 16:07:53
 */
public class HyFileMeta extends AlipayObject {

	private static final long serialVersionUID = 7227368985171457919L;

	/**
	 * 文件url
	 */
	@ApiField("afts_file_url")
	private String aftsFileUrl;

	/**
	 * 视频码率，单位 kb/s
	 */
	@ApiField("bitrate")
	private Long bitrate;

	/**
	 * 编码器名称
	 */
	@ApiField("codec_long_name")
	private String codecLongName;

	/**
	 * 视频编码格式
	 */
	@ApiField("codec_name")
	private String codecName;

	/**
	 * 创建时间时间戳
	 */
	@ApiField("create_time")
	private Long createTime;

	/**
	 * 视频/音频时常，秒
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 文件是否被加密存储
	 */
	@ApiField("encrypt")
	private Boolean encrypt;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件数据类型
	 */
	@ApiField("file_type")
	private Long fileType;

	/**
	 * 文件后缀名
	 */
	@ApiField("format_name")
	private String formatName;

	/**
	 * 单位：pt
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 文件md5
	 */
	@ApiField("md5")
	private String md5;

	/**
	 * 单位：byte
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 视频总帧数
	 */
	@ApiField("total_frames")
	private Long totalFrames;

	/**
	 * git总帧数
	 */
	@ApiField("total_gif_frames")
	private Long totalGifFrames;

	/**
	 * 单位：pt
	 */
	@ApiField("width")
	private Long width;

	public String getAftsFileUrl() {
		return this.aftsFileUrl;
	}
	public void setAftsFileUrl(String aftsFileUrl) {
		this.aftsFileUrl = aftsFileUrl;
	}

	public Long getBitrate() {
		return this.bitrate;
	}
	public void setBitrate(Long bitrate) {
		this.bitrate = bitrate;
	}

	public String getCodecLongName() {
		return this.codecLongName;
	}
	public void setCodecLongName(String codecLongName) {
		this.codecLongName = codecLongName;
	}

	public String getCodecName() {
		return this.codecName;
	}
	public void setCodecName(String codecName) {
		this.codecName = codecName;
	}

	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Boolean getEncrypt() {
		return this.encrypt;
	}
	public void setEncrypt(Boolean encrypt) {
		this.encrypt = encrypt;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFileType() {
		return this.fileType;
	}
	public void setFileType(Long fileType) {
		this.fileType = fileType;
	}

	public String getFormatName() {
		return this.formatName;
	}
	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public String getMd5() {
		return this.md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public Long getTotalFrames() {
		return this.totalFrames;
	}
	public void setTotalFrames(Long totalFrames) {
		this.totalFrames = totalFrames;
	}

	public Long getTotalGifFrames() {
		return this.totalGifFrames;
	}
	public void setTotalGifFrames(Long totalGifFrames) {
		this.totalGifFrames = totalGifFrames;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
