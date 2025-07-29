package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗免订阅服务通知发送接口
 *
 * @author auto create
 * @since 1.0, 2024-06-17 15:01:16
 */
public class AlipayCommerceMedicalNosubscribeMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 8372919142397479512L;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝uid
2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权;
其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 消息参数列表
	 */
	@ApiListField("msg_arg_list")
	@ApiField("medical_no_subscribe_msg_send_arg")
	private List<MedicalNoSubscribeMsgSendArg> msgArgList;

	/**
	 * 外部消息id
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 模板码，支付宝侧定义
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 证件号
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 用户证件类型
目前仅支持身份证
	 */
	@ApiField("user_card_type")
	private String userCardType;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public List<MedicalNoSubscribeMsgSendArg> getMsgArgList() {
		return this.msgArgList;
	}
	public void setMsgArgList(List<MedicalNoSubscribeMsgSendArg> msgArgList) {
		this.msgArgList = msgArgList;
	}

	public String getOutMsgId() {
		return this.outMsgId;
	}
	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
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
