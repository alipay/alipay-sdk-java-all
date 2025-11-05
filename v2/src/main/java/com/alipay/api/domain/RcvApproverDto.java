package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批流需要去重的人员
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:18:02
 */
public class RcvApproverDto extends AlipayObject {

	private static final long serialVersionUID = 2129169571418454842L;

	/**
	 * 资产管理员
	 */
	@ApiListField("asset_manager")
	@ApiField("string")
	private List<String> assetManager;

	/**
	 * 财务初审
	 */
	@ApiListField("financial_review")
	@ApiField("string")
	private List<String> financialReview;

	/**
	 * 财务复审
	 */
	@ApiListField("financial_super")
	@ApiField("string")
	private List<String> financialSuper;

	/**
	 * 实际需求方
	 */
	@ApiListField("requester")
	@ApiField("string")
	private List<String> requester;

	/**
	 * 需求方主管
	 */
	@ApiListField("requester_supervisor")
	@ApiField("string")
	private List<String> requesterSupervisor;

	/**
	 * 指定新资产管理员
	 */
	@ApiListField("specify_asset_manager")
	@ApiField("string")
	private List<String> specifyAssetManager;

	/**
	 * 指定新实际需求方
	 */
	@ApiListField("specify_requester")
	@ApiField("string")
	private List<String> specifyRequester;

	public List<String> getAssetManager() {
		return this.assetManager;
	}
	public void setAssetManager(List<String> assetManager) {
		this.assetManager = assetManager;
	}

	public List<String> getFinancialReview() {
		return this.financialReview;
	}
	public void setFinancialReview(List<String> financialReview) {
		this.financialReview = financialReview;
	}

	public List<String> getFinancialSuper() {
		return this.financialSuper;
	}
	public void setFinancialSuper(List<String> financialSuper) {
		this.financialSuper = financialSuper;
	}

	public List<String> getRequester() {
		return this.requester;
	}
	public void setRequester(List<String> requester) {
		this.requester = requester;
	}

	public List<String> getRequesterSupervisor() {
		return this.requesterSupervisor;
	}
	public void setRequesterSupervisor(List<String> requesterSupervisor) {
		this.requesterSupervisor = requesterSupervisor;
	}

	public List<String> getSpecifyAssetManager() {
		return this.specifyAssetManager;
	}
	public void setSpecifyAssetManager(List<String> specifyAssetManager) {
		this.specifyAssetManager = specifyAssetManager;
	}

	public List<String> getSpecifyRequester() {
		return this.specifyRequester;
	}
	public void setSpecifyRequester(List<String> specifyRequester) {
		this.specifyRequester = specifyRequester;
	}

}
