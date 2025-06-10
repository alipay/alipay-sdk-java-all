package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AichatPushMsgVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.msg.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 10:57:07
 */
public class AlipayCloudCloudpromoMsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4473341397492793915L;

	/** 
	 * 消息列表
	 */
	@ApiListField("aichat_push_msgs")
	@ApiField("aichat_push_msg_v_o")
	private List<AichatPushMsgVO> aichatPushMsgs;

	public void setAichatPushMsgs(List<AichatPushMsgVO> aichatPushMsgs) {
		this.aichatPushMsgs = aichatPushMsgs;
	}
	public List<AichatPushMsgVO> getAichatPushMsgs( ) {
		return this.aichatPushMsgs;
	}

}
