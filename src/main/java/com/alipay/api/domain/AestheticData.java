package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 存储图像美学评估结果的数据结构
 *
 * @author auto create
 * @since 1.0, 2019-09-02 16:44:30
 */
public class AestheticData extends AlipayObject {

	private static final long serialVersionUID = 4892975229825126155L;

	/**
	 * 返回执行信息，包括成功和错误
	 */
	@ApiField("message")
	private String message;

	/**
	 * 图片的美学评估得分
	 */
	@ApiField("score")
	private String score;

	/**
	 * 标识返回结果，0表示成功 1表示异常
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用于标识当次请求
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 图片url
	 */
	@ApiField("url")
	private String url;

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
