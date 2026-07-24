package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阿福医生端站内信同步
 *
 * @author auto create
 * @since 1.0, 2026-06-30 16:42:55
 */
public class AlipayCommerceMedicalHdfMsgSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2844219182264149213L;

	/**
	 * 平台的appid
	 */
	@ApiField("msg_app_id")
	private String msgAppId;

	/**
	 * null
	 */
	@ApiListField("receiver_ids")
	@ApiField("string")
	private List<String> receiverIds;

	/**
	 * 模版参数
	 */
	@ApiField("template_args")
	private String templateArgs;

	/**
	 * PUSH模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getMsgAppId() {
		return this.msgAppId;
	}
	public void setMsgAppId(String msgAppId) {
		this.msgAppId = msgAppId;
	}

	public List<String> getReceiverIds() {
		return this.receiverIds;
	}
	public void setReceiverIds(List<String> receiverIds) {
		this.receiverIds = receiverIds;
	}

	public String getTemplateArgs() {
		return this.templateArgs;
	}
	public void setTemplateArgs(String templateArgs) {
		this.templateArgs = templateArgs;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
