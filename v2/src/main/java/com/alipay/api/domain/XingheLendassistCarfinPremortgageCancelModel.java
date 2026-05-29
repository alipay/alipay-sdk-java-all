package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消预抵押来报
 *
 * @author auto create
 * @since 1.0, 2026-04-16 16:22:44
 */
public class XingheLendassistCarfinPremortgageCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8845238765276121417L;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 支用申请单号
	 */
	@ApiField("lend_apply_no")
	private String lendApplyNo;

	/**
	 * 抵押订单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 外部支用申请单号
	 */
	@ApiField("out_lend_apply_no")
	private String outLendApplyNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getLendApplyNo() {
		return this.lendApplyNo;
	}
	public void setLendApplyNo(String lendApplyNo) {
		this.lendApplyNo = lendApplyNo;
	}

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getOutLendApplyNo() {
		return this.outLendApplyNo;
	}
	public void setOutLendApplyNo(String outLendApplyNo) {
		this.outLendApplyNo = outLendApplyNo;
	}

}
