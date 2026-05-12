package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动查询
 *
 * @author auto create
 * @since 1.0, 2026-04-29 15:17:47
 */
public class AlipayCommerceOperationPromoActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7497493783736521927L;

	/**
	 * null
	 */
	@ApiListField("device_list")
	@ApiField("nfc_device_info")
	private List<NfcDeviceInfo> deviceList;

	/**
	 * 服务商侧的商户编号
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	public List<NfcDeviceInfo> getDeviceList() {
		return this.deviceList;
	}
	public void setDeviceList(List<NfcDeviceInfo> deviceList) {
		this.deviceList = deviceList;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

}
