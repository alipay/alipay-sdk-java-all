package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndirectIsvInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.tiansuo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AntMerchantExpandIndirectTiansuoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7296548175715336175L;

	/** 
	 * 间连商户pid和对应名称信息
	 */
	@ApiListField("indirect_isv_info")
	@ApiField("indirect_isv_info")
	private List<IndirectIsvInfo> indirectIsvInfo;

	public void setIndirectIsvInfo(List<IndirectIsvInfo> indirectIsvInfo) {
		this.indirectIsvInfo = indirectIsvInfo;
	}
	public List<IndirectIsvInfo> getIndirectIsvInfo( ) {
		return this.indirectIsvInfo;
	}

}
