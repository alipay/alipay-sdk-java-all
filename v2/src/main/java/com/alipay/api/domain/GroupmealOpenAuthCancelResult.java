package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下团餐批量解约授权开通结果对象
 *
 * @author auto create
 * @since 1.0, 2026-03-16 19:22:43
 */
public class GroupmealOpenAuthCancelResult extends AlipayObject {

	private static final long serialVersionUID = 2875263499942668819L;

	/**
	 * 团餐碰一下批量解约授权结果,true-解约成功；false-解约失败。
	 */
	@ApiField("cancel_openauth_result_status")
	private Boolean cancelOpenauthResultStatus;

	public Boolean getCancelOpenauthResultStatus() {
		return this.cancelOpenauthResultStatus;
	}
	public void setCancelOpenauthResultStatus(Boolean cancelOpenauthResultStatus) {
		this.cancelOpenauthResultStatus = cancelOpenauthResultStatus;
	}

}
