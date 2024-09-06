package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * idtype测试接口，包含复杂参数
 *
 * @author auto create
 * @since 1.0, 2023-02-15 14:51:09
 */
public class AlipayOpenAppIdtypetestallOpenidbizmockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8391212947593333357L;

	/**
	 * ID_TYPE
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 1
	 */
	@ApiField("id_type_list")
	private String idTypeList;

	/**
	 * 1
	 */
	@ApiField("list_id_type")
	private String listIdType;

	/**
	 * 1
	 */
	@ApiField("list_open_id")
	private String listOpenId;

	/**
	 * 1
	 */
	@ApiField("list_user_id")
	private String listUserId;

	/**
	 * openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * 用户信息
	 */
	@ApiField("user_detail")
	private IdTypeUserDetail userDetail;

	/**
	 * 1
	 */
	@ApiListField("user_detail_list")
	@ApiField("id_type_user_detail")
	private List<IdTypeUserDetail> userDetailList;

	/**
	 * uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 1
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdTypeList() {
		return this.idTypeList;
	}
	public void setIdTypeList(String idTypeList) {
		this.idTypeList = idTypeList;
	}

	public String getListIdType() {
		return this.listIdType;
	}
	public void setListIdType(String listIdType) {
		this.listIdType = listIdType;
	}

	public String getListOpenId() {
		return this.listOpenId;
	}
	public void setListOpenId(String listOpenId) {
		this.listOpenId = listOpenId;
	}

	public String getListUserId() {
		return this.listUserId;
	}
	public void setListUserId(String listUserId) {
		this.listUserId = listUserId;
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

	public IdTypeUserDetail getUserDetail() {
		return this.userDetail;
	}
	public void setUserDetail(IdTypeUserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public List<IdTypeUserDetail> getUserDetailList() {
		return this.userDetailList;
	}
	public void setUserDetailList(List<IdTypeUserDetail> userDetailList) {
		this.userDetailList = userDetailList;
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
