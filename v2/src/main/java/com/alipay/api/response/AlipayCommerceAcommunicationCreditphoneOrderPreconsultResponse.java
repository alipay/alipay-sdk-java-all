package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsultChannelResponse;
import com.alipay.api.domain.ConsultRefuseResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.order.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-21 11:12:04
 */
public class AlipayCommerceAcommunicationCreditphoneOrderPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2548858599225538892L;

	/** 
	 * 渠道列表
	 */
	@ApiListField("channel_list")
	@ApiField("consult_channel_response")
	private List<ConsultChannelResponse> channelList;

	/** 
	 * 咨询是否通过
	 */
	@ApiField("pass")
	private Boolean pass;

	/** 
	 * 拒绝列表
	 */
	@ApiListField("refuse_list")
	@ApiField("consult_refuse_response")
	private List<ConsultRefuseResponse> refuseList;

	public void setChannelList(List<ConsultChannelResponse> channelList) {
		this.channelList = channelList;
	}
	public List<ConsultChannelResponse> getChannelList( ) {
		return this.channelList;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

	public void setRefuseList(List<ConsultRefuseResponse> refuseList) {
		this.refuseList = refuseList;
	}
	public List<ConsultRefuseResponse> getRefuseList( ) {
		return this.refuseList;
	}

}
