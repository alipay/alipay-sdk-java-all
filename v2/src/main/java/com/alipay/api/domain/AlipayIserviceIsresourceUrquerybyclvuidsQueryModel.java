package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据clvuserids查询用户资源信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:00:31
 */
public class AlipayIserviceIsresourceUrquerybyclvuidsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6327679842251984782L;

	/**
	 * 旧平台userid列表
	 */
	@ApiListField("clv_user_ids")
	@ApiField("string")
	private List<String> clvUserIds;

	public List<String> getClvUserIds() {
		return this.clvUserIds;
	}
	public void setClvUserIds(List<String> clvUserIds) {
		this.clvUserIds = clvUserIds;
	}

}
