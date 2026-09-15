package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantJobInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.merchant.jobinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-08 14:17:54
 */
public class AlipayOfflineSmddMerchantJobinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8744265481468512486L;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("merchant_job_info")
	private List<MerchantJobInfo> dataList;

	public void setDataList(List<MerchantJobInfo> dataList) {
		this.dataList = dataList;
	}
	public List<MerchantJobInfo> getDataList( ) {
		return this.dataList;
	}

}
