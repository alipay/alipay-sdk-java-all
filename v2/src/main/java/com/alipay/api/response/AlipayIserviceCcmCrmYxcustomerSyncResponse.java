package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.YxContactInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.yxcustomer.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-23 09:47:40
 */
public class AlipayIserviceCcmCrmYxcustomerSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2197965745743653963L;

	/** 
	 * 客户联系方式列表，至少会有1个
	 */
	@ApiField("contact_info_list")
	private YxContactInfo contactInfoList;

	/** 
	 * 客户记录的ID
	 */
	@ApiField("data_id")
	private Long dataId;

	public void setContactInfoList(YxContactInfo contactInfoList) {
		this.contactInfoList = contactInfoList;
	}
	public YxContactInfo getContactInfoList( ) {
		return this.contactInfoList;
	}

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}
	public Long getDataId( ) {
		return this.dataId;
	}

}
