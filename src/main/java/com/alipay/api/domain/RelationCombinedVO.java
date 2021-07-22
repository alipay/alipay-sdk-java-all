package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组合关系模型对象
 *
 * @author auto create
 * @since 1.0, 2017-08-18 16:52:40
 */
public class RelationCombinedVO extends AlipayObject {

	private static final long serialVersionUID = 6422196555641817264L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private ExtraInfoVO extInfo;

	/**
	 * 支付宝头像
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 是否支付宝双向好友
	 */
	@ApiField("real_friend")
	private Boolean realFriend;

	/**
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 有可能包含emoji表情，业务方要注意编码
	 */
	@ApiField("view_name")
	private String viewName;

	public ExtraInfoVO getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ExtraInfoVO extInfo) {
		this.extInfo = extInfo;
	}

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
