package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板订阅关系查询
 *
 * @author auto create
 * @since 1.0, 2020-12-23 20:31:44
 */
public class AlipayOpenAppMessagetemplateSubscribeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8761864435361817276L;

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
