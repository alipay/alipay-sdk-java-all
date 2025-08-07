package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险场景生活号消息发送服务
 *
 * @author auto create
 * @since 1.0, 2024-03-20 11:18:30
 */
public class AlipayInsSceneLifemssageSingleSendModel extends AlipayObject {

	private static final long serialVersionUID = 7864134124821116352L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 生活号ID
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 推送模板上下文
	 */
	@ApiField("push_context")
	private String pushContext;

	/**
	 * 模板消息上下文
	 */
	@ApiField("template_context")
	private String templateContext;

	/**
	 * 生活号模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 发送到的用户ID
	 */
	@ApiField("to_open_id")
	private String toOpenId;

	/**
	 * 发送到的用户ID
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPushContext() {
		return this.pushContext;
	}
	public void setPushContext(String pushContext) {
		this.pushContext = pushContext;
	}

	public String getTemplateContext() {
		return this.templateContext;
	}
	public void setTemplateContext(String templateContext) {
		this.templateContext = templateContext;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getToOpenId() {
		return this.toOpenId;
	}
	public void setToOpenId(String toOpenId) {
		this.toOpenId = toOpenId;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
