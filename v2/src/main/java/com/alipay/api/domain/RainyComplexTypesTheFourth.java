package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 复杂类型第四个，包括所有openid映射关系
 *
 * @author auto create
 * @since 1.0, 2024-12-16 19:23:27
 */
public class RainyComplexTypesTheFourth extends AlipayObject {

	private static final long serialVersionUID = 5653361725618235859L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("idtye_open_id")
	private String idtyeOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("idtype_user_id")
	private String idtypeUserId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiListField("json_open_id_json")
	@ApiField("string")
	private List<String> jsonOpenIdJson;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiListField("json_user_id")
	@ApiField("string")
	private List<String> jsonUserId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * openId-idType映射的idType字段
	 */
	@ApiField("tc_case")
	private String tcCase;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getIdtyeOpenId() {
		return this.idtyeOpenId;
	}
	public void setIdtyeOpenId(String idtyeOpenId) {
		this.idtyeOpenId = idtyeOpenId;
	}

	public String getIdtypeUserId() {
		return this.idtypeUserId;
	}
	public void setIdtypeUserId(String idtypeUserId) {
		this.idtypeUserId = idtypeUserId;
	}

	public List<String> getJsonOpenIdJson() {
		return this.jsonOpenIdJson;
	}
	public void setJsonOpenIdJson(List<String> jsonOpenIdJson) {
		this.jsonOpenIdJson = jsonOpenIdJson;
	}

	public List<String> getJsonUserId() {
		return this.jsonUserId;
	}
	public void setJsonUserId(List<String> jsonUserId) {
		this.jsonUserId = jsonUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTcCase() {
		return this.tcCase;
	}
	public void setTcCase(String tcCase) {
		this.tcCase = tcCase;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
