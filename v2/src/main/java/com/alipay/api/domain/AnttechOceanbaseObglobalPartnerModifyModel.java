package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm修改合作伙伴
 *
 * @author auto create
 * @since 1.0, 2026-01-07 18:34:47
 */
public class AnttechOceanbaseObglobalPartnerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6517268896393379891L;

	/**
	 * 修改合作伙伴请求
	 */
	@ApiField("update_partner_request")
	private UpdatePartnerRequest updatePartnerRequest;

	public UpdatePartnerRequest getUpdatePartnerRequest() {
		return this.updatePartnerRequest;
	}
	public void setUpdatePartnerRequest(UpdatePartnerRequest updatePartnerRequest) {
		this.updatePartnerRequest = updatePartnerRequest;
	}

}
