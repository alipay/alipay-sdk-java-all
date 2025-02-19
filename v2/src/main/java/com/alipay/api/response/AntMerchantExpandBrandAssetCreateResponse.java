package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.brand.asset.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-01 11:41:55
 */
public class AntMerchantExpandBrandAssetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6589183532429851851L;

	/** 
	 * 操作失败的资产ID集合
	 */
	@ApiListField("fail_asset_ids")
	@ApiField("string")
	private List<String> failAssetIds;

	/** 
	 * 失败原因
	 */
	@ApiField("fail_msg")
	private String failMsg;

	/** 
	 * 操作结果，全部资产操作成功返回true，有一个资产失败则返回false，失败资产和原因见fail_asset_ids和fail_msg
	 */
	@ApiField("result")
	private Boolean result;

	public void setFailAssetIds(List<String> failAssetIds) {
		this.failAssetIds = failAssetIds;
	}
	public List<String> getFailAssetIds( ) {
		return this.failAssetIds;
	}

	public void setFailMsg(String failMsg) {
		this.failMsg = failMsg;
	}
	public String getFailMsg( ) {
		return this.failMsg;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
