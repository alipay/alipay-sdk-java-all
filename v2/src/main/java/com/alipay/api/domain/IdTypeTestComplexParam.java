package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * idType测试复杂结构
 *
 * @author auto create
 * @since 1.0, 2023-03-02 18:18:40
 */
public class IdTypeTestComplexParam extends AlipayObject {

	private static final long serialVersionUID = 5331916753628297359L;

	/**
	 * idType
	 */
	@ApiField("a_id_type")
	private String aIdType;

	/**
	 * 用户openid
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * 用户uid
	 */
	@ApiField("a_user_id")
	private String aUserId;

	/**
	 * USER_ID
	 */
	@ApiField("b_id_type_list")
	private String bIdTypeList;

	/**
	 * 用户openId列表
	 */
	@ApiListField("b_open_id_list")
	@ApiField("string")
	private List<String> bOpenIdList;

	/**
	 * 用户uid列表
	 */
	@ApiListField("b_user_id_list")
	@ApiField("string")
	private List<String> bUserIdList;

	public String getaIdType() {
		return this.aIdType;
	}
	public void setaIdType(String aIdType) {
		this.aIdType = aIdType;
	}

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

	public String getaUserId() {
		return this.aUserId;
	}
	public void setaUserId(String aUserId) {
		this.aUserId = aUserId;
	}

	public String getbIdTypeList() {
		return this.bIdTypeList;
	}
	public void setbIdTypeList(String bIdTypeList) {
		this.bIdTypeList = bIdTypeList;
	}

	public List<String> getbOpenIdList() {
		return this.bOpenIdList;
	}
	public void setbOpenIdList(List<String> bOpenIdList) {
		this.bOpenIdList = bOpenIdList;
	}

	public List<String> getbUserIdList() {
		return this.bUserIdList;
	}
	public void setbUserIdList(List<String> bUserIdList) {
		this.bUserIdList = bUserIdList;
	}

}
