package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.affinitycard.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-11 16:57:32
 */
public class AlipayPcreditHuabeiAffinitycardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2321692844511484763L;

	/** 
	 * 可用额度，单位：元，精确到小数点后2位
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 用户是否开通花呗联名卡，true：表示当前用户已开通花呗联名卡，返回相关额度信息，false：表示用户未开通花呗联名卡，不返回相关额度信息。
	 */
	@ApiField("opened")
	private Boolean opened;

	/** 
	 * 还款日，08-每月8号，10-每月10号。
	 */
	@ApiField("repay_date")
	private String repayDate;

	/** 
	 * 总额度，单位：元，精确到小数点后2位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
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

}
