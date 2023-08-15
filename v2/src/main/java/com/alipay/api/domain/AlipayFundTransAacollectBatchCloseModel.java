package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停止AA收款批次
 *
 * @author auto create
 * @since 1.0, 2022-11-10 11:16:30
 */
public class AlipayFundTransAacollectBatchCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1556871211212124715L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 创建批次返回 的token
	 */
	@ApiField("batch_token")
	private String batchToken;

	/**
	 * 当前支付宝用户id
	 */
	@ApiField("current_user_id")
	private String currentUserId;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBatchToken() {
		return this.batchToken;
	}
	public void setBatchToken(String batchToken) {
		this.batchToken = batchToken;
	}

	public String getCurrentUserId() {
		return this.currentUserId;
	}
	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

}
