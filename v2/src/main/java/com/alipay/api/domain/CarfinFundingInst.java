package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车金融出资机构
 *
 * @author auto create
 * @since 1.0, 2025-11-19 16:28:21
 */
public class CarfinFundingInst extends AlipayObject {

	private static final long serialVersionUID = 5416187243395761376L;

	/**
	 * 出资机构名称
	 */
	@ApiField("funding_inst_name")
	private String fundingInstName;

	/**
	 * 出资机构简称
	 */
	@ApiField("funding_inst_short_name")
	private String fundingInstShortName;

	/**
	 * 出资机构统一社会信用代码
	 */
	@ApiField("funding_inst_uscc")
	private String fundingInstUscc;

	public String getFundingInstName() {
		return this.fundingInstName;
	}
	public void setFundingInstName(String fundingInstName) {
		this.fundingInstName = fundingInstName;
	}

	public String getFundingInstShortName() {
		return this.fundingInstShortName;
	}
	public void setFundingInstShortName(String fundingInstShortName) {
		this.fundingInstShortName = fundingInstShortName;
	}

	public String getFundingInstUscc() {
		return this.fundingInstUscc;
	}
	public void setFundingInstUscc(String fundingInstUscc) {
		this.fundingInstUscc = fundingInstUscc;
	}

}
