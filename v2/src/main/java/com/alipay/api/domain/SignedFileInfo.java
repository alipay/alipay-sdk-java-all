package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已签名文件信息
 *
 * @author auto create
 * @since 1.0, 2017-08-08 10:42:59
 */
public class SignedFileInfo extends AlipayObject {

	private static final long serialVersionUID = 1824237845986743173L;

	/**
	 * 文档过期时间戳
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 数据名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
pdf //pdf文档
p7 //pkcs7签名文档
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件读取url地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 文档创建时间戳
	 */
	@ApiField("gmt_time")
	private Date gmtTime;

	/**
	 * 签约数据编号，由平台生成
	 */
	@ApiField("inner_data_id")
	private String innerDataId;

	/**
	 * 签约数据编号，由外部系统定义，用于数据关联
	 */
	@ApiField("out_data_id")
	private String outDataId;

	/**
	 * 文档签名结果
	 */
	@ApiField("signed_data")
	private String signedData;

	/**
	 * 资源文件类型
DATA //文件原文
FILE  //文件OSS索引
	 */
	@ApiField("source_type")
	private String sourceType;

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Date getGmtTime() {
		return this.gmtTime;
	}
	public void setGmtTime(Date gmtTime) {
		this.gmtTime = gmtTime;
	}

	public String getInnerDataId() {
		return this.innerDataId;
	}
	public void setInnerDataId(String innerDataId) {
		this.innerDataId = innerDataId;
	}

	public String getOutDataId() {
		return this.outDataId;
	}
	public void setOutDataId(String outDataId) {
		this.outDataId = outDataId;
	}

	public String getSignedData() {
		return this.signedData;
	}
	public void setSignedData(String signedData) {
		this.signedData = signedData;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
