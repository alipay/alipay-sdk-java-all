package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MccQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.mcc.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AntMerchantExpandMccQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6669799887918552766L;

	/** 
	 * mcc查询信息结果列表
	 */
	@ApiListField("mcc_info_list")
	@ApiField("mcc_query_info")
	private List<MccQueryInfo> mccInfoList;

	public void setMccInfoList(List<MccQueryInfo> mccInfoList) {
		this.mccInfoList = mccInfoList;
	}
	public List<MccQueryInfo> getMccInfoList( ) {
		return this.mccInfoList;
	}

}
