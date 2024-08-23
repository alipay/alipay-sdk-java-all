package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户余额查询请求
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:14
 */
public class SubAccountBalanceQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 5854598733261272394L;

	/**
	 * 子户识别基本信息
	 */
	@ApiField("sub_account_base_info")
	private SubAccountBaseInfo subAccountBaseInfo;

	public SubAccountBaseInfo getSubAccountBaseInfo() {
		return this.subAccountBaseInfo;
	}
	public void setSubAccountBaseInfo(SubAccountBaseInfo subAccountBaseInfo) {
		this.subAccountBaseInfo = subAccountBaseInfo;
	}

}
