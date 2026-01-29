package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bizinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:07
 */
public class AlipayCommerceBizinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7454362658998765859L;

	/** 
	 * 商户侧资讯id
	 */
	@ApiField("biz_info_id")
	private String bizInfoId;

	/** 
	 * 主体单元id
	 */
	@ApiField("biz_unit_id")
	private String bizUnitId;

	/** 
	 * 资讯id
	 */
	@ApiField("info_id")
	private String infoId;

	/** 
	 * 安全审核状态
	 */
	@ApiField("sec_status")
	private String secStatus;

	public void setBizInfoId(String bizInfoId) {
		this.bizInfoId = bizInfoId;
	}
	public String getBizInfoId( ) {
		return this.bizInfoId;
	}

	public void setBizUnitId(String bizUnitId) {
		this.bizUnitId = bizUnitId;
	}
	public String getBizUnitId( ) {
		return this.bizUnitId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}
	public String getInfoId( ) {
		return this.infoId;
	}

	public void setSecStatus(String secStatus) {
		this.secStatus = secStatus;
	}
	public String getSecStatus( ) {
		return this.secStatus;
	}

}
