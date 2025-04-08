package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.asset.batch.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-31 10:20:07
 */
public class AnttechNftAssetBatchDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8183737681332429665L;

	/** 
	 * 成功执行回收的nftid列表数据
	 */
	@ApiListField("success_nft_list")
	@ApiField("string")
	private List<String> successNftList;

	public void setSuccessNftList(List<String> successNftList) {
		this.successNftList = successNftList;
	}
	public List<String> getSuccessNftList( ) {
		return this.successNftList;
	}

}
