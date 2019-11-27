package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.asset.card.query(卡资产订单查询)
 *
 * @author auto create
 * @since 1.0, 2019-02-25 15:44:49
 */
public class AlipayAssetAssetorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1251519351186245361L;

	/**
	 * 支付宝资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产平台类型卡/券
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 分页查询的当前页号,从1开始
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 分页查询的单页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getFundScence() {
		return this.fundScence;
	}
	public void setFundScence(String fundScence) {
		this.fundScence = fundScence;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
