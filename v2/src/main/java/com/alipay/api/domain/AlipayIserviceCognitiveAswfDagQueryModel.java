package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝AI工作流服务
 *
 * @author auto create
 * @since 1.0, 2018-08-30 11:32:49
 */
public class AlipayIserviceCognitiveAswfDagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4579985616798429218L;

	/**
	 * 业务唯一标识，不可空
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务的任务描述
	 */
	@ApiField("ctxs")
	private String ctxs;

	/**
	 * DAG模板ID，不可空
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 业务请求唯一id
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCtxs() {
		return this.ctxs;
	}
	public void setCtxs(String ctxs) {
		this.ctxs = ctxs;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
