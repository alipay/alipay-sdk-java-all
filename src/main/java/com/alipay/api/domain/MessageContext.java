package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息主体上下文
 *
 * @author auto create
 * @since 1.0, 2019-11-15 17:54:07
 */
public class MessageContext extends AlipayObject {

	private static final long serialVersionUID = 4412655514559448615L;

	/**
	 * 底部链接描述文字，如“查看详情”，最多能传8个汉字或16个英文字符，长度超出会报错
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 模板中占位符的值及文字颜色
	 */
	@ApiField("first")
	private MessageTemplateKeyword first;

	/**
	 * 顶部色条的色值
	 */
	@ApiField("head_color")
	private String headColor;

	/**
	 * 模板中占位符的值及文字颜色
	 */
	@ApiField("keyword_1")
	private MessageTemplateKeyword keyword1;

	/**
	 * 模板中占位符的值及文字颜色
	 */
	@ApiField("keyword_2")
	private MessageTemplateKeyword keyword2;

	/**
	 * 模板中占位符的值及文字颜色
	 */
	@ApiField("remark")
	private MessageTemplateKeyword remark;

	/**
	 * 点击消息后承接页的地址
	 */
	@ApiField("url")
	private String url;

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public MessageTemplateKeyword getFirst() {
		return this.first;
	}
	public void setFirst(MessageTemplateKeyword first) {
		this.first = first;
	}

	public String getHeadColor() {
		return this.headColor;
	}
	public void setHeadColor(String headColor) {
		this.headColor = headColor;
	}

	public MessageTemplateKeyword getKeyword1() {
		return this.keyword1;
	}
	public void setKeyword1(MessageTemplateKeyword keyword1) {
		this.keyword1 = keyword1;
	}

	public MessageTemplateKeyword getKeyword2() {
		return this.keyword2;
	}
	public void setKeyword2(MessageTemplateKeyword keyword2) {
		this.keyword2 = keyword2;
	}

	public MessageTemplateKeyword getRemark() {
		return this.remark;
	}
	public void setRemark(MessageTemplateKeyword remark) {
		this.remark = remark;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
