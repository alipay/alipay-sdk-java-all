package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线圈设置
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:57:46
 */
public class AlipayOfflineProviderExpoCoilSetModel extends AlipayObject {

	private static final long serialVersionUID = 5634623183132223889L;

	/**
	 * 线圈类型
	 */
	@ApiField("coil_type")
	private String coilType;

	/**
	 * 用户open id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页面自定义参数，不能包含中文字符，中文字符请用UTF-8格式进行URLEncoder.encode
	 */
	@ApiField("page_params")
	private String pageParams;

	/**
	 * 线圈id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getCoilType() {
		return this.coilType;
	}
	public void setCoilType(String coilType) {
		this.coilType = coilType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageParams() {
		return this.pageParams;
	}
	public void setPageParams(String pageParams) {
		this.pageParams = pageParams;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
