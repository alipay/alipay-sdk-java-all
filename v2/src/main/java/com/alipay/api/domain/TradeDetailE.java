package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易补充信息
 *
 * @author auto create
 * @since 1.0, 2026-07-26 15:24:37
 */
public class TradeDetailE extends AlipayObject {

	private static final long serialVersionUID = 7657258973846395796L;

	/**
	 * 扣款信息
	 */
	@ApiField("deduction_info")
	private DeductionInfoE deductionInfo;

	/**
	 * 合并信息
	 */
	@ApiField("merge_info")
	private MergeInfoE mergeInfo;

	/**
	 * 拆分信息
	 */
	@ApiField("split_info")
	private SplitInfoE splitInfo;

	public DeductionInfoE getDeductionInfo() {
		return this.deductionInfo;
	}
	public void setDeductionInfo(DeductionInfoE deductionInfo) {
		this.deductionInfo = deductionInfo;
	}

	public MergeInfoE getMergeInfo() {
		return this.mergeInfo;
	}
	public void setMergeInfo(MergeInfoE mergeInfo) {
		this.mergeInfo = mergeInfo;
	}

	public SplitInfoE getSplitInfo() {
		return this.splitInfo;
	}
	public void setSplitInfo(SplitInfoE splitInfo) {
		this.splitInfo = splitInfo;
	}

}
