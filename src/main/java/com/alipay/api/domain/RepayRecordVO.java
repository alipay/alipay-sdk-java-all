package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款明细
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:44:45
 */
public class RepayRecordVO extends AlipayObject {

	private static final long serialVersionUID = 7588842516466229378L;

	/**
	 * 还款账户
	 */
	@ApiField("accountextno")
	private String accountextno;

	/**
	 * 还款金额
	 */
	@ApiField("repayamt")
	private AmountWf repayamt;

	/**
	 * 还款时间
	 */
	@ApiField("repaydate")
	private Long repaydate;

	/**
	 * 还款类型
	 */
	@ApiField("repaytype")
	private String repaytype;

	public String getAccountextno() {
		return this.accountextno;
	}
	public void setAccountextno(String accountextno) {
		this.accountextno = accountextno;
	}

	public AmountWf getRepayamt() {
		return this.repayamt;
	}
	public void setRepayamt(AmountWf repayamt) {
		this.repayamt = repayamt;
	}

	public Long getRepaydate() {
		return this.repaydate;
	}
	public void setRepaydate(Long repaydate) {
		this.repaydate = repaydate;
	}

	public String getRepaytype() {
		return this.repaytype;
	}
	public void setRepaytype(String repaytype) {
		this.repaytype = repaytype;
	}

}
