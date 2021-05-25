package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解冻余额宝资产
 *
 * @author auto create
 * @since 1.0, 2020-11-30 20:09:30
 */
public class AntfortuneYebAssetTradeUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 2228584785891297238L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 冻结码
	 */
	@ApiField("freeze_code")
	private String freezeCode;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFreezeCode() {
		return this.freezeCode;
	}
	public void setFreezeCode(String freezeCode) {
		this.freezeCode = freezeCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
