package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业就医短信消息发送
 *
 * @author auto create
 * @since 1.0, 2025-07-03 21:04:53
 */
public class AlipayCommerceMedicalMsgTextSendModel extends AlipayObject {

	private static final long serialVersionUID = 3453459243354587693L;

	/**
	 * 支付宝uid 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务主体，可选值如下（可增加）：
● agent_text：智能体短信
	 */
	@ApiField("biz_principal")
	private String bizPrincipal;

	/**
	 * 消息内容中的变量数据 <a href="https://message.alipay.com/allMessage">消息运营平台</a> 中查看具体数据
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * 消息的产生时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("msg_create_time")
	private Date msgCreateTime;

	/**
	 * 消息的修改时间，格式yyyy-MM-dd HH:mm:ss
如果不传，默认和消息产生时间相同
	 */
	@ApiField("msg_modified_time")
	private Date msgModifiedTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 医院对应的orgId
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 外部业务id请保持唯一，调用方自生成
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发送短信的手机号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 消息模板id 支付宝侧定义
<a href="https://message.alipay.com/allMessage"> 消息运营平台</a> 中你配置的模板的消息id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizPrincipal() {
		return this.bizPrincipal;
	}
	public void setBizPrincipal(String bizPrincipal) {
		this.bizPrincipal = bizPrincipal;
	}

	public String getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Date getMsgCreateTime() {
		return this.msgCreateTime;
	}
	public void setMsgCreateTime(Date msgCreateTime) {
		this.msgCreateTime = msgCreateTime;
	}

	public Date getMsgModifiedTime() {
		return this.msgModifiedTime;
	}
	public void setMsgModifiedTime(Date msgModifiedTime) {
		this.msgModifiedTime = msgModifiedTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
