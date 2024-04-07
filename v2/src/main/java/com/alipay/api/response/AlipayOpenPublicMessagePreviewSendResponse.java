package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MsgSendErrorData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.preview.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:32
 */
public class AlipayOpenPublicMessagePreviewSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4399319465958612516L;

	/** 
	 * 消息发送错误数据
	 */
	@ApiListField("error_datas")
	@ApiField("msg_send_error_data")
	private List<MsgSendErrorData> errorDatas;

	public void setErrorDatas(List<MsgSendErrorData> errorDatas) {
		this.errorDatas = errorDatas;
	}
	public List<MsgSendErrorData> getErrorDatas( ) {
		return this.errorDatas;
	}

}
