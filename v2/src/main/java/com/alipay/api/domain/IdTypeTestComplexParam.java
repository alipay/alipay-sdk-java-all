package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * idType测试复杂结构
 *
 * @author auto create
 * @since 1.0, 2023-03-07 19:19:22
 */
public class IdTypeTestComplexParam extends AlipayObject {

	private static final long serialVersionUID = 6153525749378121392L;

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

	/**
	 * 1
	 */
	@ApiField("expect_a_id_type")
	private String expectAIdType;

	/**
	 * 1
	 */
	@ApiField("expect_a_open_id")
	private String expectAOpenId;

	/**
	 * 1
	 */
	@ApiField("expect_a_user_id")
	private String expectAUserId;

	/**
	 * 1
	 */
	@ApiField("expect_b_id_type_list")
	private String expectBIdTypeList;

	/**
	 * 1
	 */
	@ApiListField("expect_b_open_id_list")
	@ApiField("string")
	private List<String> expectBOpenIdList;

	/**
	 * 1
	 */
	@ApiListField("expect_b_user_id_list")
	@ApiField("string")
	private List<String> expectBUserIdList;

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

	public String getExpectAIdType() {
		return this.expectAIdType;
	}
	public void setExpectAIdType(String expectAIdType) {
		this.expectAIdType = expectAIdType;
	}

	public String getExpectAOpenId() {
		return this.expectAOpenId;
	}
	public void setExpectAOpenId(String expectAOpenId) {
		this.expectAOpenId = expectAOpenId;
	}

	public String getExpectAUserId() {
		return this.expectAUserId;
	}
	public void setExpectAUserId(String expectAUserId) {
		this.expectAUserId = expectAUserId;
	}

	public String getExpectBIdTypeList() {
		return this.expectBIdTypeList;
	}
	public void setExpectBIdTypeList(String expectBIdTypeList) {
		this.expectBIdTypeList = expectBIdTypeList;
	}

	public List<String> getExpectBOpenIdList() {
		return this.expectBOpenIdList;
	}
	public void setExpectBOpenIdList(List<String> expectBOpenIdList) {
		this.expectBOpenIdList = expectBOpenIdList;
	}

	public List<String> getExpectBUserIdList() {
		return this.expectBUserIdList;
	}
	public void setExpectBUserIdList(List<String> expectBUserIdList) {
		this.expectBUserIdList = expectBUserIdList;
	}

}
