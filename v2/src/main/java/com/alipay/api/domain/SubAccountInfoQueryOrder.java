package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户信息查询请求
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:17:42
 */
public class SubAccountInfoQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 4569597818728237613L;

	/**
	 * 开户申请时获取到的受理单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

}
