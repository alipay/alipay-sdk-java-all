package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡操作员信息
 *
 * @author auto create
 * @since 1.0, 2021-08-17 15:11:13
 */
public class MemberCardOperator extends AlipayObject {

	private static final long serialVersionUID = 5877874598439729521L;

	/**
	 * self: 商家的账号id
spcenter_isv: 服务商平台isv账号
custom: 服务商自有账号体系的账号
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * self：商家
spcenter_isv：服务商平台isv账号
custom：自主对接
	 */
	@ApiField("op_type")
	private String opType;

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

}
