package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QipanMerchantCrowd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowd.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-17 20:31:37
 */
public class AlipayMerchantQipanCrowdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5347925932453117433L;

	/** 
	 * 商家人群信息
	 */
	@ApiField("crowd_info")
	private QipanMerchantCrowd crowdInfo;

	public void setCrowdInfo(QipanMerchantCrowd crowdInfo) {
		this.crowdInfo = crowdInfo;
	}
	public QipanMerchantCrowd getCrowdInfo( ) {
		return this.crowdInfo;
	}

}
