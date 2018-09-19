package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 为服务窗合作伙伴（如YunOS），提供查询所有服务窗的菜单的功能
 *
 * @author auto create
 * @since 1.0, 2016-03-31 21:03:11
 */
public class AlipayOpenPublicPartnerMenuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1381517783364371765L;

	/**
	 * 服务窗id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
