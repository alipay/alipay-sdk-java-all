package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 池融资委托放款支付查询
 *
 * @author auto create
 * @since 1.0, 2020-09-15 10:33:59
 */
public class AnttechBlockchainFinancePfPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4762341532657583379L;

	/**
	 * 业务参考号
	 */
	@ApiField("buss_refr_no")
	private String bussRefrNo;

	/**
	 * 支用标识
	 */
	@ApiField("financing_id")
	private String financingId;

	/**
	 * 平台标识
	 */
	@ApiField("platform_id")
	private String platformId;

	public String getBussRefrNo() {
		return this.bussRefrNo;
	}
	public void setBussRefrNo(String bussRefrNo) {
		this.bussRefrNo = bussRefrNo;
	}

	public String getFinancingId() {
		return this.financingId;
	}
	public void setFinancingId(String financingId) {
		this.financingId = financingId;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
