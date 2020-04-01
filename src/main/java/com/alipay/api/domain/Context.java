package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板上下文，即模板中定义的参数及参数值
 *
 * @author auto create
 * @since 1.0, 2019-09-12 12:10:55
 */
public class Context extends AlipayObject {

	private static final long serialVersionUID = 1522414124898945123L;

	/**
	 * 底部链接描述文字，如“查看详情”，最多能传8个汉字或16个英文字符，长度超出会报错
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("first")
	private Keyword first;

	/**
	 * 顶部色条的色值
	 */
	@ApiField("head_color")
	private String headColor;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword1")
	private Keyword keyword1;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword2")
	private Keyword keyword2;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("remark")
	private Keyword remark;

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

	public Keyword getFirst() {
		return this.first;
	}
	public void setFirst(Keyword first) {
		this.first = first;
	}

	public String getHeadColor() {
		return this.headColor;
	}
	public void setHeadColor(String headColor) {
		this.headColor = headColor;
	}

	public Keyword getKeyword1() {
		return this.keyword1;
	}
	public void setKeyword1(Keyword keyword1) {
		this.keyword1 = keyword1;
	}

	public Keyword getKeyword2() {
		return this.keyword2;
	}
	public void setKeyword2(Keyword keyword2) {
		this.keyword2 = keyword2;
	}

	public Keyword getRemark() {
		return this.remark;
	}
	public void setRemark(Keyword remark) {
		this.remark = remark;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
