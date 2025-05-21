package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.msg.unified.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-24 11:06:09
 */
public class AlipayCommerceMedicalMsgUnifiedSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5123146745652786645L;

	/** 
	 * 支付宝消息id列表
	 */
	@ApiListField("msg_id_list")
	@ApiField("string")
	private List<String> msgIdList;

	/** 
	 * 订单
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setMsgIdList(List<String> msgIdList) {
		this.msgIdList = msgIdList;
	}
	public List<String> getMsgIdList( ) {
		return this.msgIdList;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
