package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账明细
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:37:49
 */
public class RoyaltyInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 7171964359474938716L;

	/**
	 * 分账错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 分账错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分账类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 分账状态
	 */
	@ApiField("state")
	private String state;

	/**
	 * 分账成功时该字段有值
	 */
	@ApiField("trans_finish_dt")
	private String transFinishDt;

	/**
	 * 分账转入账号
	 */
	@ApiField("trans_in")
	private String transIn;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getTransFinishDt() {
		return this.transFinishDt;
	}
	public void setTransFinishDt(String transFinishDt) {
		this.transFinishDt = transFinishDt;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

}
