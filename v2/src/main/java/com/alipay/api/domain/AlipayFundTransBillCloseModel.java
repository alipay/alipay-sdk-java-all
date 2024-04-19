package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝转账单据关闭接口
 *
 * @author auto create
 * @since 1.0, 2022-12-06 19:47:13
 */
public class AlipayFundTransBillCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2729638614165689838L;

	/**
	 * 支付宝转账单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getTransferNo() {
		return this.transferNo;
	}
	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
