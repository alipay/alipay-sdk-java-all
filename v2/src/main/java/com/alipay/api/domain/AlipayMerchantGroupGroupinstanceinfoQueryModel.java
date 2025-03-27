package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群详情查询
 *
 * @author auto create
 * @since 1.0, 2024-09-30 21:27:17
 */
public class AlipayMerchantGroupGroupinstanceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4775327681384174135L;

	/**
	 * 群id
	 */
	@ApiField("group_instance_id")
	private String groupInstanceId;

	/**
	 * 是否需要返回群成员
	 */
	@ApiField("need_member")
	private Boolean needMember;

	public String getGroupInstanceId() {
		return this.groupInstanceId;
	}
	public void setGroupInstanceId(String groupInstanceId) {
		this.groupInstanceId = groupInstanceId;
	}

	public Boolean getNeedMember() {
		return this.needMember;
	}
	public void setNeedMember(Boolean needMember) {
		this.needMember = needMember;
	}

}
