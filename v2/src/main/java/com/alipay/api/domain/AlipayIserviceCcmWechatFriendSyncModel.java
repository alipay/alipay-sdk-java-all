package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企微好友消息同步
 *
 * @author auto create
 * @since 1.0, 2025-08-12 15:59:49
 */
public class AlipayIserviceCcmWechatFriendSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6759586417244794784L;

	/**
	 * { "state":生成二维码时传的token, "followUserId":用户加的企微id, "externalUserId":用户微信号密文id, "name":客户微信昵称, "type":--1-个人微信用户，2-企业微信用户, "avatar":客户头像链接, "gender":0-未知，1-男性，2-女性 "remark":该企微员工对客户的备注, "description":该企微员工对客户的描述, "addWay":1-(客户)扫码，2-(企微员工)搜索手机号, "phoneNo":客户手机号, }
	 */
	@ApiField("data")
	private String data;

	/**
	 * envId
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 时间戳
	 */
	@ApiField("event_timestamp")
	private Long eventTimestamp;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * appId
	 */
	@ApiField("im_app_id")
	private String imAppId;

	/**
	 * source
	 */
	@ApiField("source")
	private String source;

	/**
	 * tntInst_id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * type
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public Long getEventTimestamp() {
		return this.eventTimestamp;
	}
	public void setEventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getImAppId() {
		return this.imAppId;
	}
	public void setImAppId(String imAppId) {
		this.imAppId = imAppId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
