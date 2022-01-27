package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 如果有创建AA收款，江湖救急等业务场景的话，创建批次后，可以调用此接口创建付款单
 *
 * @author auto create
 * @since 1.0, 2017-02-13 17:30:37
 */
public class AlipayFundTransBatchCreateorderModel extends AlipayObject {

	private static final long serialVersionUID = 3161897886443311598L;

	/**
	 * 批次编号：创建批次时生成的批次号；表示这笔付款是这个批次下面的一条明细
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 必须是map<String,String>的json串，长度限制为100
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 金额，单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款方userId
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 付款方userId
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * token；创建批次时和批次编号一起下发的token串
	 */
	@ApiField("token")
	private String token;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayeeId() {
		return this.payeeId;
	}
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayerId() {
		return this.payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getToken() {
		return this.token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
