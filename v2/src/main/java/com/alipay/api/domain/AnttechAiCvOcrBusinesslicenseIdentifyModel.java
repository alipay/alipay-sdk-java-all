package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI认知服务营业执照ocr服务
 *
 * @author auto create
 * @since 1.0, 2020-03-04 18:41:20
 */
public class AnttechAiCvOcrBusinesslicenseIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 4264954641978331938L;

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
