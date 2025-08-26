package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DentalArchivesShopStaff;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.shopstaff.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-05 19:57:35
 */
public class AlipayCommerceMedicalCommercialShopstaffBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1646843285439612364L;

	/** 
	 * 门店店员列表
	 */
	@ApiListField("staffs")
	@ApiField("dental_archives_shop_staff")
	private List<DentalArchivesShopStaff> staffs;

	public void setStaffs(List<DentalArchivesShopStaff> staffs) {
		this.staffs = staffs;
	}
	public List<DentalArchivesShopStaff> getStaffs( ) {
		return this.staffs;
	}

}
