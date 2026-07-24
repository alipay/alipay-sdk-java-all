package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TransportInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifecreation.transport.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 00:05:54
 */
public class AlipaySocialBaseLifecreationTransportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7586817246984153137L;

	/** 
	 * 创作搬运信息列表
	 */
	@ApiListField("transport_infos")
	@ApiField("transport_info")
	private List<TransportInfo> transportInfos;

	public void setTransportInfos(List<TransportInfo> transportInfos) {
		this.transportInfos = transportInfos;
	}
	public List<TransportInfo> getTransportInfos( ) {
		return this.transportInfos;
	}

}
