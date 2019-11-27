package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商圈下载第三方活动对账单
 *
 * @author auto create
 * @since 1.0, 2018-03-29 11:32:53
 */
public class KoubeiMarketingThirdpartyBillGetModel extends AlipayObject {

	private static final long serialVersionUID = 6328598952387917126L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
