package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.affinitycard.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-02 15:42:55
 */
public class AlipayPcreditHuabeiAffinitycardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8429718128494633228L;

	/** 
	 * 可用额度，单位：元，精确到小数点后2位
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 用户联名卡关闭原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/** 
	 * 用户联名卡关闭类型，用于区分主动关闭还是被动关闭
	 */
	@ApiField("close_type")
	private String closeType;

	/** 
	 * 用户是否开通花呗联名卡，true：表示当前用户已开通花呗联名卡，返回相关额度信息，false：表示用户未开通花呗联名卡，不返回相关额度信息。
	 */
	@ApiField("opened")
	private Boolean opened;

	/** 
	 * 还款日，08表示每月8号，10表示每月10号
	 */
	@ApiField("repay_date")
	private String repayDate;

	/** 
	 * 总额度，单位：元，精确到小数点后2位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 如果入参中传入产品账户号或者用户已开通花呗联名卡，返回联名卡产品账户号
	 */
	@ApiField("user_prod_account_no")
	private String userProdAccountNo;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}
	public String getCloseReason( ) {
		return this.closeReason;
	}

	public void setCloseType(String closeType) {
		this.closeType = closeType;
	}
	public String getCloseType( ) {
		return this.closeType;
	}

	public void setOpened(Boolean opened) {
		this.opened = opened;
	}
	public Boolean getOpened( ) {
		return this.opened;
	}

	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}
	public String getRepayDate( ) {
		return this.repayDate;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setUserProdAccountNo(String userProdAccountNo) {
		this.userProdAccountNo = userProdAccountNo;
	}
	public String getUserProdAccountNo( ) {
		return this.userProdAccountNo;
	}

}
