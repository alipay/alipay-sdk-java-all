package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板订阅关系模型
 *
 * @author auto create
 * @since 1.0, 2020-12-23 20:31:45
 */
public class SubscribeRelation extends AlipayObject {

	private static final long serialVersionUID = 6277388762282747244L;

	/**
	 * 订阅保持状态，下次静默订阅的时的状态。0:保持订阅，1:保持拒绝订阅
	 */
	@ApiField("keep_state")
	private String keepState;

	/**
	 * 模板是否展示在订阅组件中。ture:订阅组件中展示查询的模板，false:订阅组件中不展示模板
	 */
	@ApiField("show")
	private Boolean show;

	/**
	 * 订阅状态。0:拒绝订阅，1:订阅
	 */
	@ApiField("subscribe_state")
	private String subscribeState;

	/**
	 * 消息模板的订阅类型。longterm:长期性订阅，onetime:一次性订阅
	 */
	@ApiField("subscribe_type")
	private String subscribeType;

	/**
	 * 消息模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getKeepState() {
		return this.keepState;
	}
	public void setKeepState(String keepState) {
		this.keepState = keepState;
	}

	public Boolean getShow() {
		return this.show;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getSubscribeState() {
		return this.subscribeState;
	}
	public void setSubscribeState(String subscribeState) {
		this.subscribeState = subscribeState;
	}

	public String getSubscribeType() {
		return this.subscribeType;
	}
	public void setSubscribeType(String subscribeType) {
		this.subscribeType = subscribeType;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
