package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ProtocolPreviewVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.protocol.order.preview response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-02 18:00:13
 */
public class AlipayBossProdProtocolOrderPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 3744439553313587651L;

	/** 
	 * 协议预览结果
	 */
	@ApiField("protocol_preview_vo_list")
	private ProtocolPreviewVO protocolPreviewVoList;

	public void setProtocolPreviewVoList(ProtocolPreviewVO protocolPreviewVoList) {
		this.protocolPreviewVoList = protocolPreviewVoList;
	}
	public ProtocolPreviewVO getProtocolPreviewVoList( ) {
		return this.protocolPreviewVoList;
	}

}
