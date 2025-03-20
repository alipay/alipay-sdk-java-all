package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * idType测试复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-03-07 18:58:09
 */
public class IdTypeUserDetail extends AlipayObject {

	private static final long serialVersionUID = 1476117812368994627L;

	/**
	 * 1
	 */
	@ApiField("expect_id_type_1")
	private String expectIdType1;

	/**
	 * 1
	 */
	@ApiField("expect_id_type_2")
	private String expectIdType2;

	/**
	 * 1
	 */
	@ApiField("expect_id_type_3")
	private String expectIdType3;

	/**
	 * 1
	 */
	@ApiField("expect_list_string_open_id")
	private String expectListStringOpenId;

	/**
	 * 1
	 */
	@ApiField("expect_list_string_user_id")
	private String expectListStringUserId;

	/**
	 * 1
	 */
	@ApiField("expect_open_id")
	private String expectOpenId;

	/**
	 * 1
	 */
	@ApiListField("expect_open_id_list")
	@ApiField("string")
	private List<String> expectOpenIdList;

	/**
	 * 1
	 */
	@ApiField("expect_user_id")
	private String expectUserId;

	/**
	 * 1
	 */
	@ApiListField("expect_user_id_list")
	@ApiField("string")
	private List<String> expectUserIdList;

	/**
	 * idType
	 */
	@ApiField("id_type_1")
	private String idType1;

	/**
	 * idType
	 */
	@ApiField("id_type_2")
	private String idType2;

	/**
	 * idType
	 */
	@ApiField("id_type_3")
	private String idType3;

	/**
	 * openId列表转义
	 */
	@ApiField("list_string_open_id")
	private String listStringOpenId;

	/**
	 * 用户id列表转义
	 */
	@ApiField("list_string_user_id")
	private String listStringUserId;

	/**
	 * openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * openId列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public String getExpectIdType1() {
		return this.expectIdType1;
	}
	public void setExpectIdType1(String expectIdType1) {
		this.expectIdType1 = expectIdType1;
	}

	public String getExpectIdType2() {
		return this.expectIdType2;
	}
	public void setExpectIdType2(String expectIdType2) {
		this.expectIdType2 = expectIdType2;
	}

	public String getExpectIdType3() {
		return this.expectIdType3;
	}
	public void setExpectIdType3(String expectIdType3) {
		this.expectIdType3 = expectIdType3;
	}

	public String getExpectListStringOpenId() {
		return this.expectListStringOpenId;
	}
	public void setExpectListStringOpenId(String expectListStringOpenId) {
		this.expectListStringOpenId = expectListStringOpenId;
	}

	public String getExpectListStringUserId() {
		return this.expectListStringUserId;
	}
	public void setExpectListStringUserId(String expectListStringUserId) {
		this.expectListStringUserId = expectListStringUserId;
	}

	public String getExpectOpenId() {
		return this.expectOpenId;
	}
	public void setExpectOpenId(String expectOpenId) {
		this.expectOpenId = expectOpenId;
	}

	public List<String> getExpectOpenIdList() {
		return this.expectOpenIdList;
	}
	public void setExpectOpenIdList(List<String> expectOpenIdList) {
		this.expectOpenIdList = expectOpenIdList;
	}

	public String getExpectUserId() {
		return this.expectUserId;
	}
	public void setExpectUserId(String expectUserId) {
		this.expectUserId = expectUserId;
	}

	public List<String> getExpectUserIdList() {
		return this.expectUserIdList;
	}
	public void setExpectUserIdList(List<String> expectUserIdList) {
		this.expectUserIdList = expectUserIdList;
	}

	public String getIdType1() {
		return this.idType1;
	}
	public void setIdType1(String idType1) {
		this.idType1 = idType1;
	}

	public String getIdType2() {
		return this.idType2;
	}
	public void setIdType2(String idType2) {
		this.idType2 = idType2;
	}

	public String getIdType3() {
		return this.idType3;
	}
	public void setIdType3(String idType3) {
		this.idType3 = idType3;
	}

	public String getListStringOpenId() {
		return this.listStringOpenId;
	}
	public void setListStringOpenId(String listStringOpenId) {
		this.listStringOpenId = listStringOpenId;
	}

	public String getListStringUserId() {
		return this.listStringUserId;
	}
	public void setListStringUserId(String listStringUserId) {
		this.listStringUserId = listStringUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
