package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车辆备案
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:06
 */
public class AlipayCommerceTransportEtcenterpriseRegistercarApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4787517545546766393L;

	/**
	 * 备案车辆列表
	 */
	@ApiListField("car_infos")
	@ApiField("car_infos")
	private List<CarInfos> carInfos;

	/**
	 * 企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	public List<CarInfos> getCarInfos() {
		return this.carInfos;
	}
	public void setCarInfos(List<CarInfos> carInfos) {
		this.carInfos = carInfos;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

}
