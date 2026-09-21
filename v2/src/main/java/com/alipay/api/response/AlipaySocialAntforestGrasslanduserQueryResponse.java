package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.grasslanduser.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 15:22:25
 */
public class AlipaySocialAntforestGrasslanduserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5167954667897382949L;

	/** 
	 * 开通 true
	 */
	@ApiField("open_status")
	private Boolean openStatus;

	/** 
	 * 神奇草原证书数量
	 */
	@ApiField("total_grassland_cert_num")
	private Long totalGrasslandCertNum;

	public void setOpenStatus(Boolean openStatus) {
		this.openStatus = openStatus;
	}
	public Boolean getOpenStatus( ) {
		return this.openStatus;
	}

	public void setTotalGrasslandCertNum(Long totalGrasslandCertNum) {
		this.totalGrasslandCertNum = totalGrasslandCertNum;
	}
	public Long getTotalGrasslandCertNum( ) {
		return this.totalGrasslandCertNum;
	}

}
