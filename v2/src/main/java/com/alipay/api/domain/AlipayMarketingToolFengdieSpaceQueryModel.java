package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询云凤蝶空间详情
 *
 * @author auto create
 * @since 1.0, 2021-06-25 21:52:51
 */
public class AlipayMarketingToolFengdieSpaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2721466881829942347L;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲查询的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
