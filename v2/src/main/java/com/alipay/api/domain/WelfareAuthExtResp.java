package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于返回给供应商的福利权益扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-04-29 19:08:09
 */
public class WelfareAuthExtResp extends AlipayObject {

	private static final long serialVersionUID = 2219646723715619198L;

	/**
	 * 该参数用来标识用户来源，是供应商不同的场景传入对应的来源，蚂蚁EAP会根据此来判断员工是否在权益范围内
	 */
	@ApiField("corp_group")
	private String corpGroup;

	public String getCorpGroup() {
		return this.corpGroup;
	}
	public void setCorpGroup(String corpGroup) {
		this.corpGroup = corpGroup;
	}

}
