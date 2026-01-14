package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌文件
 *
 * @author auto create
 * @since 1.0, 2025-12-08 10:10:35
 */
public class BrandFileInfoOpenApi extends AlipayObject {

	private static final long serialVersionUID = 4474721243898446889L;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 使用alipay.open.brand.auth.create品牌认证接口，传
授权材料证明文件时，如果是一级授权只传一级授权材料，如果是二级授权需要传一级、二级授权材料，以此类推，文件类型fileType=层级，比如fileType=L1，参考auth_level
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 证件的有效结束时间
	 */
	@ApiField("valid_end")
	private Date validEnd;

	/**
	 * 证件的有效开始时间
	 */
	@ApiField("valid_start")
	private Date validStart;

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

	public Date getValidEnd() {
		return this.validEnd;
	}
	public void setValidEnd(Date validEnd) {
		this.validEnd = validEnd;
	}

	public Date getValidStart() {
		return this.validStart;
	}
	public void setValidStart(Date validStart) {
		this.validStart = validStart;
	}

}
