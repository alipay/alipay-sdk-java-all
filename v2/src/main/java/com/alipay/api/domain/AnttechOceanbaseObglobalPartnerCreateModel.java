package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm创建合作伙伴
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:50:20
 */
public class AnttechOceanbaseObglobalPartnerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8234849564732654473L;

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
