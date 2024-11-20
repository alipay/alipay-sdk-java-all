package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RetailPointPrizeInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.activity.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-05 15:47:21
 */
public class AlipayCommerceRetailActivityConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5232774946235725274L;

	/** 
	 * 积分奖品信息列表
	 */
	@ApiListField("point_prize_info")
	@ApiField("retail_point_prize_info_d_t_o")
	private List<RetailPointPrizeInfoDTO> pointPrizeInfo;

	public void setPointPrizeInfo(List<RetailPointPrizeInfoDTO> pointPrizeInfo) {
		this.pointPrizeInfo = pointPrizeInfo;
	}
	public List<RetailPointPrizeInfoDTO> getPointPrizeInfo( ) {
		return this.pointPrizeInfo;
	}

}
