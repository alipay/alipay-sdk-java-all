package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessReturnQrcodeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.qrcodereturn.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:05
 */
public class KoubeiSalesKbassetStuffQrcodereturnSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8763917486416962992L;

	/** 
	 * 供应商回传码值被处理结果
	 */
	@ApiListField("return_qrcode_results")
	@ApiField("access_return_qrcode_result")
	private List<AccessReturnQrcodeResult> returnQrcodeResults;

	public void setReturnQrcodeResults(List<AccessReturnQrcodeResult> returnQrcodeResults) {
		this.returnQrcodeResults = returnQrcodeResults;
	}
	public List<AccessReturnQrcodeResult> getReturnQrcodeResults( ) {
		return this.returnQrcodeResults;
	}

}
