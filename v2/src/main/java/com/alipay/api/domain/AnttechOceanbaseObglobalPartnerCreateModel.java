package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm创建合作伙伴
 *
 * @author auto create
 * @since 1.0, 2025-10-16 15:38:00
 */
public class AnttechOceanbaseObglobalPartnerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4145145756165716118L;

	/**
	 * 创建合作伙伴请求
	 */
	@ApiField("create_partner_request")
	private CreatePartnerRequest createPartnerRequest;

	public CreatePartnerRequest getCreatePartnerRequest() {
		return this.createPartnerRequest;
	}
	public void setCreatePartnerRequest(CreatePartnerRequest createPartnerRequest) {
		this.createPartnerRequest = createPartnerRequest;
	}

}
