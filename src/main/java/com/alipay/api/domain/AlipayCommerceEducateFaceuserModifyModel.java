package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一脸通行人脸扩展信息修改
 *
 * @author auto create
 * @since 1.0, 2022-08-22 19:37:22
 */
public class AlipayCommerceEducateFaceuserModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2374869482684982259L;

	/**
	 * 业务码。可选的场景码有：{TRAFFIC:出行行业，BUSINESS:企业行业，SCENIC:景区行业，COMMUNITY:社区行业}
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 人脸库id。
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 人脸库要修改的用户信息列表。（注意：当前人脸列表不宜过长，目前最大支持仅支持50）
	 */
	@ApiListField("user_list")
	@ApiField("tiny_face_user_info")
	private List<TinyFaceUserInfo> userList;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<TinyFaceUserInfo> getUserList() {
		return this.userList;
	}
	public void setUserList(List<TinyFaceUserInfo> userList) {
		this.userList = userList;
	}

}
