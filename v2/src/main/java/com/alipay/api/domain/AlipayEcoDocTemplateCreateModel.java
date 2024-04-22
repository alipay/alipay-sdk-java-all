package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建合同模板（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-03-28 00:10:12
 */
public class AlipayEcoDocTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3684858192769285348L;

	/**
	 * 模版文件的md5值。示例代码参见 <a href="https://opendocs.alipay.com/mini/00arl2#%E5%88%9B%E5%BB%BA%E5%90%88%E5%90%8C%E6%A8%A1%E6%9D%BF">创建合同模板</a>
	 */
	@ApiField("content_md_5")
	private String contentMd5;

	/**
	 * 目标文件的MIME类型。示例代码参见 <a href="https://opendocs.alipay.com/mini/00arl2#%E5%88%9B%E5%BB%BA%E5%90%88%E5%90%8C%E6%A8%A1%E6%9D%BF">创建合同模板</a>
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
	 */
	@ApiField("convert_to_pdf")
	private String convertToPdf;

	/**
	 * 文件名称，必须带上文件扩展名如 .pdf、.doc、.docx，否则会导致后续发起流程校验异常。
	 */
	@ApiField("file_name")
	private String fileName;

	public String getContentMd5() {
		return this.contentMd5;
	}
	public void setContentMd5(String contentMd5) {
		this.contentMd5 = contentMd5;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getConvertToPdf() {
		return this.convertToPdf;
	}
	public void setConvertToPdf(String convertToPdf) {
		this.convertToPdf = convertToPdf;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
