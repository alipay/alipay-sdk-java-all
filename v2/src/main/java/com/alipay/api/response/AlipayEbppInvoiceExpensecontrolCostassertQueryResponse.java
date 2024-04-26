package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExpenseAssetInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.costassert.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 21:01:48
 */
public class AlipayEbppInvoiceExpensecontrolCostassertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8718551553676199194L;

	/** 
	 * 消耗资产明细列表
	 */
	@ApiListField("asset_list")
	@ApiField("expense_asset_info")
	private List<ExpenseAssetInfo> assetList;

	public void setAssetList(List<ExpenseAssetInfo> assetList) {
		this.assetList = assetList;
	}
	public List<ExpenseAssetInfo> getAssetList( ) {
		return this.assetList;
	}

}
