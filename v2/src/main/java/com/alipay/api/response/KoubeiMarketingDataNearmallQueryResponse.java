package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NearMallBo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.nearmall.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:04
 */
public class KoubeiMarketingDataNearmallQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7768315234639371822L;

	/** 
	 * 商圈信息
	 */
	@ApiListField("near_mall_bos")
	@ApiField("near_mall_bo")
	private List<NearMallBo> nearMallBos;

	public void setNearMallBos(List<NearMallBo> nearMallBos) {
		this.nearMallBos = nearMallBos;
	}
	public List<NearMallBo> getNearMallBos( ) {
		return this.nearMallBos;
	}

}
