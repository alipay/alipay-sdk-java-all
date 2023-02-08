package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连天梭查询接口
 *
 * @author auto create
 * @since 1.0, 2022-04-20 17:52:00
 */
public class AntMerchantExpandIndirectTiansuoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3658862665947728911L;

	/**
	 * 间连商户入驻时填写的营业执照号
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

}
