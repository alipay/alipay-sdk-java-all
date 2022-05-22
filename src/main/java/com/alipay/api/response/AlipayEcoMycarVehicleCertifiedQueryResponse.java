package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PlateNoCertDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.vehicle.certified.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-14 10:25:19
 */
public class AlipayEcoMycarVehicleCertifiedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3763718631336897684L;

	/** 
	 * 认证结果列表
	 */
	@ApiListField("cert_list")
	@ApiField("plate_no_cert_dto")
	private List<PlateNoCertDto> certList;

	public void setCertList(List<PlateNoCertDto> certList) {
		this.certList = certList;
	}
	public List<PlateNoCertDto> getCertList( ) {
		return this.certList;
	}

}
