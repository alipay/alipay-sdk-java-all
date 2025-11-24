package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链金融业务的应收账款发行结果信息
 *
 * @author auto create
 * @since 1.0, 2019-12-26 00:04:56
 */
public class FinanceReceivableResultInfo extends AlipayObject {

	private static final long serialVersionUID = 2795716751316424582L;

	/**
	 * 供应商确认接收上链交易hash
	 */
	@ApiField("accept_tx_hash")
	private String acceptTxHash;

	/**
	 * 资产发行提交时传入的内部资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 保理付款账户信息
	 */
	@ApiField("factoring_account_info")
	private FinanceBankAccountInfo factoringAccountInfo;

	/**
	 * 发行完成时间，UTC标准格式
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 资产发行预申请时，核心企业定义的应收账款编号
	 */
	@ApiField("out_asset_id")
	private String outAssetId;

	/**
	 * 保理机构登记审批上链交易hash
	 */
	@ApiField("review_tx_hash")
	private String reviewTxHash;

	/**
	 * 核心企业提交上链交易hash
	 */
	@ApiField("submit_tx_hash")
	private String submitTxHash;

	public String getAcceptTxHash() {
		return this.acceptTxHash;
	}
	public void setAcceptTxHash(String acceptTxHash) {
		this.acceptTxHash = acceptTxHash;
	}

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public FinanceBankAccountInfo getFactoringAccountInfo() {
		return this.factoringAccountInfo;
	}
	public void setFactoringAccountInfo(FinanceBankAccountInfo factoringAccountInfo) {
		this.factoringAccountInfo = factoringAccountInfo;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getOutAssetId() {
		return this.outAssetId;
	}
	public void setOutAssetId(String outAssetId) {
		this.outAssetId = outAssetId;
	}

	public String getReviewTxHash() {
		return this.reviewTxHash;
	}
	public void setReviewTxHash(String reviewTxHash) {
		this.reviewTxHash = reviewTxHash;
	}

	public String getSubmitTxHash() {
		return this.submitTxHash;
	}
	public void setSubmitTxHash(String submitTxHash) {
		this.submitTxHash = submitTxHash;
	}

}
