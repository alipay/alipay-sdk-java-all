package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板订阅关系模型
 *
 * @author auto create
 * @since 1.0, 2023-08-23 19:23:17
 */
public class SubscribeRelation extends AlipayObject {

	private static final long serialVersionUID = 2125716128372863549L;

	/**
	 * 订阅保持状态，即用户勾选“总是保持以上选择，不再询问”选项时勾选的订阅状态。说明：若用户“总是保持以上选择，不再询问”选项，且选择订阅消息。下次触发消息订阅组件时，支付宝将自动发起一次静默订阅（不再拉起订阅组件，无需用户手动订阅）。
	 */
	@ApiField("keep_state")
	private String keepState;

	/**
	 * 模板是否展示在订阅组件中
	 */
	@ApiField("show")
	private Boolean show;

	/**
	 * 订阅状态
	 */
	@ApiField("subscribe_state")
	private String subscribeState;

	/**
	 * 消息模板的订阅类型
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
