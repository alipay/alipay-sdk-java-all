package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券包购买咨询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 22:25:45
 */
public class AlipayMarketingActivityVoucherpackageConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5853654454968714971L;

	/**
	 * 券包id列表
	 */
	@ApiListField("voucher_package_id_list")
	@ApiField("string")
	private List<String> voucherPackageIdList;

	public List<String> getVoucherPackageIdList() {
		return this.voucherPackageIdList;
	}
	public void setVoucherPackageIdList(List<String> voucherPackageIdList) {
		this.voucherPackageIdList = voucherPackageIdList;
	}

}
