package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券模板创建
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:24
 */
public class AlipayOfflineMarketingVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4841721194913178464L;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 券码池编号。该值调用：alipay.offline.marketing.voucher.code.upload接口生成
	 */
	@ApiField("code_inventory_id")
	private String codeInventoryId;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发放规则信息
	 */
	@ApiField("get_rule")
	private GetRuleInfo getRule;

	/**
	 * 外部流水号.需商家自己生成并保证每次请求的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券模板信息
	 */
	@ApiField("voucher_info")
	private VoucherInfo voucherInfo;

	public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}
	public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

	public String getCodeInventoryId() {
		return this.codeInventoryId;
	}
	public void setCodeInventoryId(String codeInventoryId) {
		this.codeInventoryId = codeInventoryId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public GetRuleInfo getGetRule() {
		return this.getRule;
	}
	public void setGetRule(GetRuleInfo getRule) {
		this.getRule = getRule;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public VoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(VoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
