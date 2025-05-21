package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商活动报名查询
 *
 * @author auto create
 * @since 1.0, 2024-08-28 14:42:53
 */
public class AlipayCommerceYuntaskRecruitenrolledinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1586493251341823578L;

	/**
	 * 零售商的pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}
