package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI认知服务增值税发票ocr识别
 *
 * @author auto create
 * @since 1.0, 2020-06-05 16:19:30
 */
public class AnttechAiCvOcrVatinvoiceIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 5125177234844284528L;

	/**
	 * 目前只支持pdf、jpg两种file_type的识别能力，根据具体传入的发票的格式传入正确的值
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件二进制内容 + base64
	 */
	@ApiField("image_raw")
	private String imageRaw;

	/**
	 * 图片下载url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 服务调用来源(需要咨询服务提供方)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getImageRaw() {
		return this.imageRaw;
	}
	public void setImageRaw(String imageRaw) {
		this.imageRaw = imageRaw;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
