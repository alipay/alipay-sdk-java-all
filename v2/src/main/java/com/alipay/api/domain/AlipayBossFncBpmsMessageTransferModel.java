package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpms消息转发
 *
 * @author auto create
 * @since 1.0, 2024-06-25 14:22:28
 */
public class AlipayBossFncBpmsMessageTransferModel extends AlipayObject {

	private static final long serialVersionUID = 7451269286855244672L;

	/**
	 * bpms消息内容
	 */
	@ApiField("bpms_message_dto")
	private BpmsMessageDTO bpmsMessageDto;

	public BpmsMessageDTO getBpmsMessageDto() {
		return this.bpmsMessageDto;
	}
	public void setBpmsMessageDto(BpmsMessageDTO bpmsMessageDto) {
		this.bpmsMessageDto = bpmsMessageDto;
	}

}
