package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券修改
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:33
 */
public class AlipayOfflineMarketingVoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1596283937226945358L;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发放次数限制
	 */
	@ApiField("get_count_limit")
	private PeriodInfo getCountLimit;

	/**
	 * 外部流水号.需商家自己生成并保证每次请求的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券信息
	 */
	@ApiField("voucher_info")
	private VoucherModifyInfo voucherInfo;

	public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}
	public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public PeriodInfo getGetCountLimit() {
		return this.getCountLimit;
	}
	public void setGetCountLimit(PeriodInfo getCountLimit) {
		this.getCountLimit = getCountLimit;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public VoucherModifyInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(VoucherModifyInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
