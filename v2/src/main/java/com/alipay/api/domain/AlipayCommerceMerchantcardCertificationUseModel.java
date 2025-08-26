package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 先享后付批量核销使用
 *
 * @author auto create
 * @since 1.0, 2024-11-15 15:53:19
 */
public class AlipayCommerceMerchantcardCertificationUseModel extends AlipayObject {

	private static final long serialVersionUID = 8177498451794754269L;

	/**
	 * 核销信息
	 */
	@ApiListField("certificate_use_info_list")
	@ApiField("merchant_certificate_use_info")
	private List<MerchantCertificateUseInfo> certificateUseInfoList;

	/**
	 * 核销门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<MerchantCertificateUseInfo> getCertificateUseInfoList() {
		return this.certificateUseInfoList;
	}
	public void setCertificateUseInfoList(List<MerchantCertificateUseInfo> certificateUseInfoList) {
		this.certificateUseInfoList = certificateUseInfoList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
