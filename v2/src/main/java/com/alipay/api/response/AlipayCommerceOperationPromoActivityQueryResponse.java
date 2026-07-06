package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NfcDeviceActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 15:17:47
 */
public class AlipayCommerceOperationPromoActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7476131346486469453L;

	/** 
	 * null
	 */
	@ApiListField("device_act_info_list")
	@ApiField("nfc_device_activity_info")
	private List<NfcDeviceActivityInfo> deviceActInfoList;

	/** 
	 * 服务商侧的商户编号
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	public void setDeviceActInfoList(List<NfcDeviceActivityInfo> deviceActInfoList) {
		this.deviceActInfoList = deviceActInfoList;
	}
	public List<NfcDeviceActivityInfo> getDeviceActInfoList( ) {
		return this.deviceActInfoList;
	}

	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}
	public String getOutMerchantNo( ) {
		return this.outMerchantNo;
	}

}
