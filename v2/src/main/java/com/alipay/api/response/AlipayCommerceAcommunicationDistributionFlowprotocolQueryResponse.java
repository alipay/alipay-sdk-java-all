package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FlowProtocol;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.flowprotocol.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 14:22:04
 */
public class AlipayCommerceAcommunicationDistributionFlowprotocolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1644188736797846686L;

	/** 
	 * 协议列表
	 */
	@ApiListField("protocol_list")
	@ApiField("flow_protocol")
	private List<FlowProtocol> protocolList;

	/** 
	 * 协议流水号
	 */
	@ApiField("protocol_sequence_id")
	private String protocolSequenceId;

	public void setProtocolList(List<FlowProtocol> protocolList) {
		this.protocolList = protocolList;
	}
	public List<FlowProtocol> getProtocolList( ) {
		return this.protocolList;
	}

	public void setProtocolSequenceId(String protocolSequenceId) {
		this.protocolSequenceId = protocolSequenceId;
	}
	public String getProtocolSequenceId( ) {
		return this.protocolSequenceId;
	}

}
