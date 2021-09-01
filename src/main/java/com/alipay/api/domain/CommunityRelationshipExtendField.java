package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关系扩展字段
 *
 * @author auto create
 * @since 1.0, 2021-03-17 18:16:56
 */
public class CommunityRelationshipExtendField extends AlipayObject {

	private static final long serialVersionUID = 3431312437164489515L;

	/**
	 * 是否需要跳转外部链接查询户号，1-是，0-否。默认为否
	 */
	@ApiField("external_billkey_query_flag")
	private String externalBillkeyQueryFlag;

	public String getExternalBillkeyQueryFlag() {
		return this.externalBillkeyQueryFlag;
	}
	public void setExternalBillkeyQueryFlag(String externalBillkeyQueryFlag) {
		this.externalBillkeyQueryFlag = externalBillkeyQueryFlag;
	}

}
