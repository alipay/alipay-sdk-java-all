package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.aqdualchannel.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 17:22:44
 */
public class AlipayCommerceMedicalAqdualchannelMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5599756365926587227L;

	/** 
	 * null
	 */
	@ApiListField("msg_id_list")
	@ApiField("string")
	private List<String> msgIdList;

	/** 
	 * 商户订单id
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
