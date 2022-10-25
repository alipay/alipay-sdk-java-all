package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommonPrizeModelVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.live.accept response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-14 17:25:17
 */
public class AlipayFundCouponWufuLiveAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 4799935322719646141L;

	/** 
	 * 奖品列表信息，prized=true时取第一个
	 */
	@ApiListField("prize_list")
	@ApiField("common_prize_model_vo")
	private List<CommonPrizeModelVo> prizeList;

	/** 
	 * 是否中奖
	 */
	@ApiField("prized")
	private Boolean prized;

	public void setPrizeList(List<CommonPrizeModelVo> prizeList) {
		this.prizeList = prizeList;
	}
	public List<CommonPrizeModelVo> getPrizeList( ) {
		return this.prizeList;
	}

	public void setPrized(Boolean prized) {
		this.prized = prized;
	}
	public Boolean getPrized( ) {
		return this.prized;
	}

}
