package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PortraitsDataTgiVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.commoninsight.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:42:02
 */
public class AlipayMerchantQipanCommoninsightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8831866612355287189L;

	/** 
	 * 人群洞察分析数据，包含高tgi显著性特征
	 */
	@ApiField("portraits_data_tgi")
	private PortraitsDataTgiVO portraitsDataTgi;

	public void setPortraitsDataTgi(PortraitsDataTgiVO portraitsDataTgi) {
		this.portraitsDataTgi = portraitsDataTgi;
	}
	public PortraitsDataTgiVO getPortraitsDataTgi( ) {
		return this.portraitsDataTgi;
	}

}
