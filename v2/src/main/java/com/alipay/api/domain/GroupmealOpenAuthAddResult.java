package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团餐碰一下签约授权开通结果对象
 *
 * @author auto create
 * @since 1.0, 2026-03-17 11:42:44
 */
public class GroupmealOpenAuthAddResult extends AlipayObject {

	private static final long serialVersionUID = 8128646649645551618L;

	/**
	 * 团餐碰一下签约授权开通结果,true-开通成功；false-开通失败。
	 */
	@ApiField("add_openauth_result_status")
	private Boolean addOpenauthResultStatus;

	public Boolean getAddOpenauthResultStatus() {
		return this.addOpenauthResultStatus;
	}
	public void setAddOpenauthResultStatus(Boolean addOpenauthResultStatus) {
		this.addOpenauthResultStatus = addOpenauthResultStatus;
	}

}
