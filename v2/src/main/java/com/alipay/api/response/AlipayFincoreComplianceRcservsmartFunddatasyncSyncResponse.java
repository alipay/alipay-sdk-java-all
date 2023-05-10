package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartFundDataSyncResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservsmart.funddatasync.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:21:56
 */
public class AlipayFincoreComplianceRcservsmartFunddatasyncSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7719239518331586335L;

	/** 
	 * 中欧基金数据同步返回体
	 */
	@ApiField("rcsmart_common_response")
	private RcSmartFundDataSyncResponse rcsmartCommonResponse;

	public void setRcsmartCommonResponse(RcSmartFundDataSyncResponse rcsmartCommonResponse) {
		this.rcsmartCommonResponse = rcsmartCommonResponse;
	}
	public RcSmartFundDataSyncResponse getRcsmartCommonResponse( ) {
		return this.rcsmartCommonResponse;
	}

}
