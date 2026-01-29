package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话内容
 *
 * @author auto create
 * @since 1.0, 2025-05-07 15:29:40
 */
public class OpenChatContent extends AlipayObject {

	private static final long serialVersionUID = 8322811412932551322L;

	/**
	 * 响应包的次序号
	 */
	@ApiField("pack_no")
	private String packNo;

	/**
	 * 思维步骤编号
	 */
	@ApiField("step")
	private String step;

	/**
	 * 模板内容。当content_type=Thought时，可选
	 */
	@ApiField("template")
	private TemplateContent template;

	/**
	 * 文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 时间
	 */
	@ApiField("time")
	private String time;

	/**
	 * 思维链标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 模板code,
	 */
	@ApiField("tpl_code")
	private String tplCode;

	/**
	 * 模板数据
	 */
	@ApiField("tpl_data")
	private String tplData;

	/**
	 * 思维类型
	 */
	@ApiField("type")
	private String type;

	public String getPackNo() {
		return this.packNo;
	}
	public void setPackNo(String packNo) {
		this.packNo = packNo;
	}

	public String getStep() {
		return this.step;
	}
	public void setStep(String step) {
		this.step = step;
	}

	public TemplateContent getTemplate() {
		return this.template;
	}
	public void setTemplate(TemplateContent template) {
		this.template = template;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTplCode() {
		return this.tplCode;
	}
	public void setTplCode(String tplCode) {
		this.tplCode = tplCode;
	}

	public String getTplData() {
		return this.tplData;
	}
	public void setTplData(String tplData) {
		this.tplData = tplData;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
