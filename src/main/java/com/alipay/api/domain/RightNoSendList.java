package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赠险产品发放列表
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:46:26
 */
public class RightNoSendList extends AlipayObject {

	private static final long serialVersionUID = 4564993939721891778L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 赠险标志
	 */
	@ApiField("gift_prod_code")
	private String giftProdCode;

	/**
	 * 赠险产品码
	 */
	@ApiField("right_no")
	private String rightNo;

	/**
	 * 发放流水业务唯一编号
	 */
	@ApiField("send_flow_no")
	private String sendFlowNo;

	/**
	 * 本次发放保额
	 */
	@ApiField("send_sum_insured")
	private String sendSumInsured;

	/**
	 * 业务成功失败标记
	 */
	@ApiField("success")
	private Boolean success;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getGiftProdCode() {
		return this.giftProdCode;
	}
	public void setGiftProdCode(String giftProdCode) {
		this.giftProdCode = giftProdCode;
	}

	public String getRightNo() {
		return this.rightNo;
	}
	public void setRightNo(String rightNo) {
		this.rightNo = rightNo;
	}

	public String getSendFlowNo() {
		return this.sendFlowNo;
	}
	public void setSendFlowNo(String sendFlowNo) {
		this.sendFlowNo = sendFlowNo;
	}

	public String getSendSumInsured() {
		return this.sendSumInsured;
	}
	public void setSendSumInsured(String sendSumInsured) {
		this.sendSumInsured = sendSumInsured;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
