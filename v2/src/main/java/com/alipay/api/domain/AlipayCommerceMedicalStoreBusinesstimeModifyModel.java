package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新门店营业时间
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:37
 */
public class AlipayCommerceMedicalStoreBusinesstimeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2337859954687775431L;

	/**
	 * 门店营业时间
	 */
	@ApiListField("business_dates")
	@ApiField("business_date_d_t_o")
	private List<BusinessDateDTO> businessDates;

	/**
	 * APP方门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<BusinessDateDTO> getBusinessDates() {
		return this.businessDates;
	}
	public void setBusinessDates(List<BusinessDateDTO> businessDates) {
		this.businessDates = businessDates;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
