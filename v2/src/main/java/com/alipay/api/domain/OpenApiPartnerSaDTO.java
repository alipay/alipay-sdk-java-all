package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同签约方DTO
 *
 * @author auto create
 * @since 1.0, 2023-11-06 14:17:23
 */
public class OpenApiPartnerSaDTO extends AlipayObject {

	private static final long serialVersionUID = 8343682937413534181L;

	/**
	 * 公司主体号
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 签约主体名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
