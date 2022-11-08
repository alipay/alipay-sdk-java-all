package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请款相关要素
 *
 * @author auto create
 * @since 1.0, 2022-05-19 16:39:56
 */
public class AdvanceElementsDTO extends AlipayObject {

	private static final long serialVersionUID = 2451956378295978877L;

	/**
	 * 请款绑定支付宝内部账号
	 */
	@ApiField("advance_account_no")
	private String advanceAccountNo;

	/**
	 * 请款绑定支付宝账户类型,支持：ENTRUST_SUB_ACC托管子户，SUPERVISED_ACC资金监管账户。auto_advance=true时必填
	 */
	@ApiField("advance_account_type")
	private String advanceAccountType;

	/**
	 * 请款绑定支付宝主体id。auto_advance=true时必填
	 */
	@ApiField("advance_user_id")
	private String advanceUserId;

	/**
	 * 是否需要自动请款
	 */
	@ApiField("auto_advance")
	private String autoAdvance;

	public String getAdvanceAccountNo() {
		return this.advanceAccountNo;
	}
	public void setAdvanceAccountNo(String advanceAccountNo) {
		this.advanceAccountNo = advanceAccountNo;
	}

	public String getAdvanceAccountType() {
		return this.advanceAccountType;
	}
	public void setAdvanceAccountType(String advanceAccountType) {
		this.advanceAccountType = advanceAccountType;
	}

	public String getAdvanceUserId() {
		return this.advanceUserId;
	}
	public void setAdvanceUserId(String advanceUserId) {
		this.advanceUserId = advanceUserId;
	}

	public String getAutoAdvance() {
		return this.autoAdvance;
	}
	public void setAutoAdvance(String autoAdvance) {
		this.autoAdvance = autoAdvance;
	}

}
