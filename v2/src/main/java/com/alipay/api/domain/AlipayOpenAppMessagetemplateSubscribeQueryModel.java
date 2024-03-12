package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板订阅关系查询
 *
 * @author auto create
 * @since 1.0, 2023-08-23 19:23:17
 */
public class AlipayOpenAppMessagetemplateSubscribeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5579982679264574748L;

	/**
	 * 支付宝openId，用于支付宝用户在当前应用下的用户标识。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 消息模板id，可以填写多个，最多不超过3个。模板id需要保持同一个应用主体，并且展示在同一个订阅组件中的模板id。
模板id获取详情参见<a href="https://opendocs.alipay.com/mini/01rnqx">模板消息</a>。
	 */
	@ApiListField("template_id_list")
	@ApiField("string")
	private List<String> templateIdList;

	/**
	 * 订阅消息模板用户的支付宝唯一标识，2088开头。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getTemplateIdList() {
		return this.templateIdList;
	}
	public void setTemplateIdList(List<String> templateIdList) {
		this.templateIdList = templateIdList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
