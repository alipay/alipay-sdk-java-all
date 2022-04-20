package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商中心三方合作员工登录
 *
 * @author auto create
 * @since 1.0, 2018-06-07 15:34:59
 */
public class AlipayOpenOperationPartnerLoginCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3395415443723222897L;

	/**
	 * 三方合作服务商的员工支付宝UID，要求唯一。需要三方员工通过授权操作提供。
	 */
	@ApiField("staff_user_id")
	private String staffUserId;

	public String getStaffUserId() {
		return this.staffUserId;
	}
	public void setStaffUserId(String staffUserId) {
		this.staffUserId = staffUserId;
	}

}
