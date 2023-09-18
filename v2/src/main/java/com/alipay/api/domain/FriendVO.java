package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好友信息VO
 *
 * @author auto create
 * @since 1.0, 2023-03-28 15:19:11
 */
public class FriendVO extends AlipayObject {

	private static final long serialVersionUID = 2722984678441646239L;

	/**
	 * 好友open_id
	 */
	@ApiField("friend_openid")
	private String friendOpenid;

	/**
	 * 好友头像
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 好友关系，是否双向好友
	 */
	@ApiField("relation")
	private String relation;

	/**
	 * 好友昵称
	 */
	@ApiField("view_name")
	private String viewName;

	public String getFriendOpenid() {
		return this.friendOpenid;
	}
	public void setFriendOpenid(String friendOpenid) {
		this.friendOpenid = friendOpenid;
	}

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getRelation() {
		return this.relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getViewName() {
		return this.viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}
