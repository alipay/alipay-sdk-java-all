package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阿福医生端PUSH同步
 *
 * @author auto create
 * @since 1.0, 2026-06-30 16:42:55
 */
public class AlipayCommerceMedicalHdfPushSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3749347792535149594L;

	/**
	 * PUSH消息控制
	 */
	@ApiField("health_msg_class")
	private String healthMsgClass;

	/**
	 * PUSH平台的appid
	 */
	@ApiField("push_app_id")
	private String pushAppId;

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

	public String getHealthMsgClass() {
		return this.healthMsgClass;
	}
	public void setHealthMsgClass(String healthMsgClass) {
		this.healthMsgClass = healthMsgClass;
	}

	public String getPushAppId() {
		return this.pushAppId;
	}
	public void setPushAppId(String pushAppId) {
		this.pushAppId = pushAppId;
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
