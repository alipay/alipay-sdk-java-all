package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AQ双通道消息发送
 *
 * @author auto create
 * @since 1.0, 2025-11-14 17:22:44
 */
public class AlipayCommerceMedicalAqdualchannelMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 4677641618275132653L;

	/**
	 * 支付宝uid，2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝uid，2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("alipay_user_open_id")
	private String alipayUserOpenId;

	/**
	 * 安诊儿消息发送配置
	 */
	@ApiField("azr_msg_send")
	private Boolean azrMsgSend;

	/**
	 * 扩展属性
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息内容
	 */
	@ApiField("msg_context")
	private String msgContext;

	/**
	 * 订单创建时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("msg_create_time")
	private Date msgCreateTime;

	/**
	 * 订单修改时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("msg_modified_time")
	private Date msgModifiedTime;

	/**
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 商户订单id，保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 模板码，支付宝侧定义
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 用户证件号
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 用户证件类型
	 */
	@ApiField("user_card_type")
	private String userCardType;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAlipayUserOpenId() {
		return this.alipayUserOpenId;
	}
	public void setAlipayUserOpenId(String alipayUserOpenId) {
		this.alipayUserOpenId = alipayUserOpenId;
	}

	public Boolean getAzrMsgSend() {
		return this.azrMsgSend;
	}
	public void setAzrMsgSend(Boolean azrMsgSend) {
		this.azrMsgSend = azrMsgSend;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMsgContext() {
		return this.msgContext;
	}
	public void setMsgContext(String msgContext) {
		this.msgContext = msgContext;
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

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUserCardNo() {
		return this.userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCardType() {
		return this.userCardType;
	}
	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}

}
