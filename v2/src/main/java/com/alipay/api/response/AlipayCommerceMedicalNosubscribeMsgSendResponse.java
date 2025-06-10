package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.nosubscribe.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-17 15:27:03
 */
public class AlipayCommerceMedicalNosubscribeMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4268934951231368269L;

	/** 
	 * 支付宝消息id列表
	 */
	@ApiListField("msg_id_list")
	@ApiField("string")
	private List<String> msgIdList;

	/** 
	 * 外部商户消息唯一标识
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	public void setMsgIdList(List<String> msgIdList) {
		this.msgIdList = msgIdList;
	}
	public List<String> getMsgIdList( ) {
		return this.msgIdList;
	}

	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}
	public String getOutMsgId( ) {
		return this.outMsgId;
	}

}
