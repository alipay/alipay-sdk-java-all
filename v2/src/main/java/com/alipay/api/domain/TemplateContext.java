package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板上下文，即模板中定义的参数及参数值
 *
 * @author auto create
 * @since 1.0, 2019-10-23 17:03:59
 */
public class TemplateContext extends AlipayObject {

	private static final long serialVersionUID = 3762446333424139889L;

	/**
	 * 底部链接描述文字，如“查看详情”，最多能传8个汉字或16个英文字符，长度超出会报错
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 消息内容
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 模板的标题。 
如：您好，您已成功预约车辆。
	 */
	@ApiField("first")
	private TemplateKeyword first;

	/**
	 * 顶部色条的色值
	 */
	@ApiField("head_color")
	private String headColor;

	/**
	 * 消息备注。
如：请您及时到达修理厂哦！
	 */
	@ApiField("remark")
	private TemplateKeyword remark;

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

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public TemplateKeyword getFirst() {
		return this.first;
	}
	public void setFirst(TemplateKeyword first) {
		this.first = first;
	}

	public String getHeadColor() {
		return this.headColor;
	}
	public void setHeadColor(String headColor) {
		this.headColor = headColor;
	}

	public TemplateKeyword getRemark() {
		return this.remark;
	}
	public void setRemark(TemplateKeyword remark) {
		this.remark = remark;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
