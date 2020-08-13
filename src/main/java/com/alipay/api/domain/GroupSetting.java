package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 建群时的群设置
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class GroupSetting extends AlipayObject {

	private static final long serialVersionUID = 5474141529735177859L;

	/**
	 * 群名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 是否开放群成员邀请
	 */
	@ApiField("is_openinv")
	private Boolean isOpeninv;

	/**
	 * 群公告
	 */
	@ApiField("public_notice")
	private String publicNotice;

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Boolean getIsOpeninv() {
		return this.isOpeninv;
	}
	public void setIsOpeninv(Boolean isOpeninv) {
		this.isOpeninv = isOpeninv;
	}

	public String getPublicNotice() {
		return this.publicNotice;
	}
	public void setPublicNotice(String publicNotice) {
		this.publicNotice = publicNotice;
	}

}
