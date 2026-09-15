package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出租车leads信息上传
 *
 * @author auto create
 * @since 1.0, 2026-09-02 15:22:52
 */
public class AlipayCommerceTransportTaxiLeadsUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3379674543637561913L;

	/**
	 * null
	 */
	@ApiListField("leads_list")
	@ApiField("leads_import_item")
	private List<LeadsImportItem> leadsList;

	public List<LeadsImportItem> getLeadsList() {
		return this.leadsList;
	}
	public void setLeadsList(List<LeadsImportItem> leadsList) {
		this.leadsList = leadsList;
	}

}
