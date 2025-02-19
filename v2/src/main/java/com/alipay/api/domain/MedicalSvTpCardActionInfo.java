package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗服务平台card行动点信息
 *
 * @author auto create
 * @since 1.0, 2016-11-16 15:16:21
 */
public class MedicalSvTpCardActionInfo extends AlipayObject {

	private static final long serialVersionUID = 3387186243993443116L;

	/**
	 * 模板消息中行动编码，动态参数信息
备注：行动点编码根据模板类型定义
	 */
	@ApiField("action_code")
	private String actionCode;

	/**
	 * 模板消息中行动名称,开发者自定义
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 模板消息中实际操作链接，开发者自定义
	 */
	@ApiField("action_url")
	private String actionUrl;

	public String getActionCode() {
		return this.actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

}
