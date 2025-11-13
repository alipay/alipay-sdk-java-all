package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同签约方DTO
 *
 * @author auto create
 * @since 1.0, 2024-12-23 11:33:45
 */
public class OpenApiPartnerSaDTO extends AlipayObject {

	private static final long serialVersionUID = 7174933658787726363L;

	/**
	 * 关键字索引
	 */
	@ApiField("keyword_index")
	private String keywordIndex;

	/**
	 * 公司主体号
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 公司主体id
	 */
	@ApiField("ou_id")
	private String ouId;

	/**
	 * 签约主体名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	public String getKeywordIndex() {
		return this.keywordIndex;
	}
	public void setKeywordIndex(String keywordIndex) {
		this.keywordIndex = keywordIndex;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getOuId() {
		return this.ouId;
	}
	public void setOuId(String ouId) {
		this.ouId = ouId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
