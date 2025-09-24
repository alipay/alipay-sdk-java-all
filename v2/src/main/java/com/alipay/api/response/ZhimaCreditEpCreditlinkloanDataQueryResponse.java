package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlinkloan.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:16:45
 */
public class ZhimaCreditEpCreditlinkloanDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6249138643634567398L;

	/** 
	 * 查询到的的数据信息，是JSON结构，其key值和入参中的collect_data_type对应，例如 {"ELEME_RISK_ADMISSION":{"passStatus":1,"epList":[{"epName":"A","epCertNo":"001A","operatorName":"张三"},{"epName":"B","epCertNo":"001B","operatorName":"张三"}]}}
	 */
	@ApiField("collect_data_content")
	private String collectDataContent;

	/** 
	 * 商户单号，正常调用返回的数据和入参中的商户单号保持一致
	 */
	@ApiField("merchant_biz_no")
	private String merchantBizNo;

	public void setCollectDataContent(String collectDataContent) {
		this.collectDataContent = collectDataContent;
	}
	public String getCollectDataContent( ) {
		return this.collectDataContent;
	}

	public void setMerchantBizNo(String merchantBizNo) {
		this.merchantBizNo = merchantBizNo;
	}
	public String getMerchantBizNo( ) {
		return this.merchantBizNo;
	}

}
