package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息发送场景配置结构体
 *
 * @author auto create
 * @since 1.0, 2024-09-18 11:03:03
 */
public class MsgSceneDTO extends AlipayObject {

	private static final long serialVersionUID = 8679877193274448622L;

	/**
	 * 1.当biz_scene=INVITE_EMP_SIGN时，need_push、template_type和send_time为必填项
2.当biz_scene=EMP_SIGN_SUCCESS时，need_push、template_type和send_time非必填，默认need_push = false, template_type = COMMON，发送时间为即时发送（员工签约成功，立即推送）
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 是否需要push消息
	 */
	@ApiField("need_push")
	private Boolean needPush;

	/**
	 * 发送时间，格式，HHmm，其中mm只能是整分钟（00，10，20，30，40，50）
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 模板类型
	 */
	@ApiField("template_type")
	private String templateType;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Boolean getNeedPush() {
		return this.needPush;
	}
	public void setNeedPush(Boolean needPush) {
		this.needPush = needPush;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
