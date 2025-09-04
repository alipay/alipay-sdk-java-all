package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款分类金额
 *
 * @author auto create
 * @since 1.0, 2017-10-30 11:35:46
 */
public class LoanMoneyTypeAmt extends AlipayObject {

	private static final long serialVersionUID = 3498828665951156722L;

	/**
	 * 费用
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 正常利息金额
	 */
	@ApiField("intr")
	private String intr;

	/**
	 * 滞纳金
	 */
	@ApiField("ovd_fine")
	private String ovdFine;

	/**
	 * 逾期利息金额
	 */
	@ApiField("ovd_int")
	private String ovdInt;

	/**
	 * 逾期利息罚息
	 */
	@ApiField("ovd_int_pny")
	private String ovdIntPny;

	/**
	 * 逾期本金金额
	 */
	@ApiField("ovd_prin")
	private String ovdPrin;

	/**
	 * 逾期本金罚息
	 */
	@ApiField("ovd_prin_pny")
	private String ovdPrinPny;

	/**
	 * 正常本金金额
	 */
	@ApiField("prin")
	private String prin;

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getIntr() {
		return this.intr;
	}
	public void setIntr(String intr) {
		this.intr = intr;
	}

	public String getOvdFine() {
		return this.ovdFine;
	}
	public void setOvdFine(String ovdFine) {
		this.ovdFine = ovdFine;
	}

	public String getOvdInt() {
		return this.ovdInt;
	}
	public void setOvdInt(String ovdInt) {
		this.ovdInt = ovdInt;
	}

	public String getOvdIntPny() {
		return this.ovdIntPny;
	}
	public void setOvdIntPny(String ovdIntPny) {
		this.ovdIntPny = ovdIntPny;
	}

	public String getOvdPrin() {
		return this.ovdPrin;
	}
	public void setOvdPrin(String ovdPrin) {
		this.ovdPrin = ovdPrin;
	}

	public String getOvdPrinPny() {
		return this.ovdPrinPny;
	}
	public void setOvdPrinPny(String ovdPrinPny) {
		this.ovdPrinPny = ovdPrinPny;
	}

	public String getPrin() {
		return this.prin;
	}
	public void setPrin(String prin) {
		this.prin = prin;
	}

}
