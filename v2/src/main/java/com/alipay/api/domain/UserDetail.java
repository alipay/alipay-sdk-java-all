package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * userid测试
 *
 * @author auto create
 * @since 1.0, 2023-07-28 17:40:40
 */
public class UserDetail extends AlipayObject {

	private static final long serialVersionUID = 5822621515645376566L;

	/**
	 * 1
	 */
	@ApiField("appid_one")
	private String appidOne;

	/**
	 * userid列表
	 */
	@ApiListField("list_open_id")
	@ApiField("string")
	private List<String> listOpenId;

	/**
	 * xxxx
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * xxxx
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * userid列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public String getAppidOne() {
		return this.appidOne;
	}
	public void setAppidOne(String appidOne) {
		this.appidOne = appidOne;
	}

	public List<String> getListOpenId() {
		return this.listOpenId;
	}
	public void setListOpenId(List<String> listOpenId) {
		this.listOpenId = listOpenId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
