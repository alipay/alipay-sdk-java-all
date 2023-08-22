package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝AI通用图片信息抽取服务
 *
 * @author auto create
 * @since 1.0, 2018-08-30 11:33:04
 */
public class AlipayIserviceCognitiveImageRouteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2494735831394383989L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务请求详细内容
	 */
	@ApiListField("ctx")
	@ApiField("string")
	private List<String> ctx;

	/**
	 * 业务pv唯一id
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<String> getCtx() {
		return this.ctx;
	}
	public void setCtx(List<String> ctx) {
		this.ctx = ctx;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
