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
 * @since 1.0, 2023-05-05 06:09:03
 */
public class KoubeiSalesKbassetStuffQrcodereturnSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7412216542828991556L;

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
