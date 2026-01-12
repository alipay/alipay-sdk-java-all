package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新版uid直转openid
 *
 * @author auto create
 * @since 1.0, 2023-12-28 10:22:49
 */
public class AlipayOpenAppOpenidUidtoopenidBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4344834713971716992L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
