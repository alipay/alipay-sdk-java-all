package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NbCompletionChunk;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.nextbuilder.agent.completion.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 11:02:26
 */
public class AlipayCloudNextbuilderAgentCompletionGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5769416343164961597L;

	/** 
	 * 返回结果消息体内的具体内容
	 */
	@ApiField("data")
	private NbCompletionChunk data;

	/** 
	 * 消息体返回的类型;
当event类型为 message 时，请解析 data以获取详细信息；当 event 类型为 error 时，请解析data 以获取错误信息；当 event 类型为 ping 时，仅用于请求保持，无需处理；当 event 类型为 end 时，表示所有内容已经完成返回，不会再有后续的包，调用方请关闭链接；
	 */
	@ApiField("event")
	private String event;

	/** 
	 * 标注返回的流式结构序号
	 */
	@ApiField("id")
	private Long id;

	public void setData(NbCompletionChunk data) {
		this.data = data;
	}
	public NbCompletionChunk getData( ) {
		return this.data;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent( ) {
		return this.event;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
