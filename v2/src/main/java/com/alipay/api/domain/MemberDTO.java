package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 成员用户信息
 *
 * @author auto create
 * @since 1.0, 2023-05-23 11:57:08
 */
public class MemberDTO extends AlipayObject {

	private static final long serialVersionUID = 6672888216128282955L;

	/**
	 * 实体角色id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 会员名
	 */
	@ApiField("unique_name")
	private String uniqueName;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getUniqueName() {
		return this.uniqueName;
	}
	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}

}
