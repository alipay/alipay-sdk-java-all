package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommonPrizeVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.card.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:50
 */
public class AlipayFundCouponWufuCardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7448934585256366899L;

	/** 
	 * 请求成功（未返回错误码时），该值不为空，为奖品列表信息；若该值为空，可联系五福排查
	 */
	@ApiListField("prize_list")
	@ApiField("common_prize_vo")
	private List<CommonPrizeVo> prizeList;

	public void setPrizeList(List<CommonPrizeVo> prizeList) {
		this.prizeList = prizeList;
	}
	public List<CommonPrizeVo> getPrizeList( ) {
		return this.prizeList;
	}

}
