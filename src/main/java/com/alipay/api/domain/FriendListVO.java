package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好友列表的模型对象
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:18:35
 */
public class FriendListVO extends AlipayObject {

	private static final long serialVersionUID = 4854197547954122571L;

	/**
	 * 头像的服务地址
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 是否双向好友
	 */
	@ApiField("real_friend")
	private Boolean realFriend;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 有可能包含emoji表情，业务方要注意编码
	 */
	@ApiField("view_name")
	private String viewName;

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Boolean getRealFriend() {
		return this.realFriend;
	}
	public void setRealFriend(Boolean realFriend) {
		this.realFriend = realFriend;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getViewName() {
		return this.viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}
