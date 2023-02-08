package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签约文件列表
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class SignDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3368692599696545466L;

	/**
	 * 待签约数据编号，由外部系统定义，用于数据关联
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 待签约数据名称，支持GBK编码字符
	 */
	@ApiField("data_name")
	private String dataName;

	/**
	 * 代签名数据类型
'DATA'   //数据原文
'FILE'    //文档索引，通过OSS空间交换
'TEMPLATE'   //文档模板
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 当data_type=FILE时，制定文档类型。
'html'  //html格式文档
'pdf'   //pdf格式文档
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * OSS空间中存储的文件Id
	 */
	@ApiField("oss_file_id")
	private String ossFileId;

	/**
	 * 文档预览地址信息
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 文档签章列表，参考FileSignatrue
	 */
	@ApiListField("signature_list")
	@ApiField("file_signature")
	private List<FileSignature> signatureList;

	/**
	 * 文档原文内容，当data_type=DATA时必传。
	 */
	@ApiField("source_data")
	private String sourceData;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataName() {
		return this.dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getOssFileId() {
		return this.ossFileId;
	}
	public void setOssFileId(String ossFileId) {
		this.ossFileId = ossFileId;
	}

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public List<FileSignature> getSignatureList() {
		return this.signatureList;
	}
	public void setSignatureList(List<FileSignature> signatureList) {
		this.signatureList = signatureList;
	}

	public String getSourceData() {
		return this.sourceData;
	}
	public void setSourceData(String sourceData) {
		this.sourceData = sourceData;
	}

}
