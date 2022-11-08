package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * po累计预提余额详情
 *
 * @author auto create
 * @since 1.0, 2021-12-16 16:34:40
 */
public class PoCumAccruedBalanceAmtDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 3732182116132254652L;

	/**
	 * 累计预提金额
	 */
	@ApiField("cum_accrued_balance_amt")
	private Long cumAccruedBalanceAmt;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * po key (id)
	 */
	@ApiField("po_key")
	private Long poKey;

	/**
	 * po行号
	 */
	@ApiField("po_line_no")
	private String poLineNo;

	/**
	 * PO单号
	 */
	@ApiField("po_no")
	private String poNo;

	public Long getCumAccruedBalanceAmt() {
		return this.cumAccruedBalanceAmt;
	}
	public void setCumAccruedBalanceAmt(Long cumAccruedBalanceAmt) {
		this.cumAccruedBalanceAmt = cumAccruedBalanceAmt;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getPoKey() {
		return this.poKey;
	}
	public void setPoKey(Long poKey) {
		this.poKey = poKey;
	}

	public String getPoLineNo() {
		return this.poLineNo;
	}
	public void setPoLineNo(String poLineNo) {
		this.poLineNo = poLineNo;
	}

	public String getPoNo() {
		return this.poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

}
