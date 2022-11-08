package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可贷额度查询结果
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:42:15
 */
public class McaStoreLoanableDetail extends AlipayObject {

	private static final long serialVersionUID = 3322151956195595195L;

	/**
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/**
	 * 可贷额度
	 */
	@ApiField("loanableamt")
	private AmountWf loanableamt;

	/**
	 * 店铺id
	 */
	@ApiField("sellerid")
	private String sellerid;

	public Boolean getAdmit() {
		return this.admit;
	}
	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}

	public AmountWf getLoanableamt() {
		return this.loanableamt;
	}
	public void setLoanableamt(AmountWf loanableamt) {
		this.loanableamt = loanableamt;
	}

	public String getSellerid() {
		return this.sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

}
