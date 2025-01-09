package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 校园消息用户授权查询
 *
 * @author auto create
 * @since 1.0, 2025-01-02 15:07:52
 */
public class AlipayCommerceEducateYouthEdumessageauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5131283153653691985L;

	/**
	 * 业务类型，用于区分不同业务场景
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 消息发送者AppId
	 */
	@ApiField("from_app_id")
	private String fromAppId;

	/**
	 * 学校内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 消息类型(最多三个)
	 */
	@ApiListField("msg_enum_list")
	@ApiField("string")
	private List<String> msgEnumList;

	/**
	 * 消息接收者openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 消息接收者UID
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getFromAppId() {
		return this.fromAppId;
	}
	public void setFromAppId(String fromAppId) {
		this.fromAppId = fromAppId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public List<String> getMsgEnumList() {
		return this.msgEnumList;
	}
	public void setMsgEnumList(List<String> msgEnumList) {
		this.msgEnumList = msgEnumList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
