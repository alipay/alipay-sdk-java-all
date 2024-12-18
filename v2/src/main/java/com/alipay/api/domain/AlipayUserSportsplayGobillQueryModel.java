package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户走路线流水
 *
 * @author auto create
 * @since 1.0, 2023-10-27 14:11:40
 */
public class AlipayUserSportsplayGobillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4691684698318923471L;

	/**
	 * 路线场景ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 路线id
	 */
	@ApiField("path_id")
	private String pathId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPathId() {
		return this.pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

}
