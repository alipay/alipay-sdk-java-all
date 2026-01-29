package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YxContactInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.yxcustomer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-23 09:47:40
 */
public class AlipayIserviceCcmCrmYxcustomerModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7339445175228926316L;

	/** 
	 * 更新的联系人列表
	 */
	@ApiListField("contact_info_list")
	@ApiField("yx_contact_info")
	private List<YxContactInfo> contactInfoList;

	/** 
	 * 客户记录的ID
	 */
	@ApiField("data_id")
	private Long dataId;

	public void setContactInfoList(List<YxContactInfo> contactInfoList) {
		this.contactInfoList = contactInfoList;
	}
	public List<YxContactInfo> getContactInfoList( ) {
		return this.contactInfoList;
	}

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}
	public Long getDataId( ) {
		return this.dataId;
	}

}
