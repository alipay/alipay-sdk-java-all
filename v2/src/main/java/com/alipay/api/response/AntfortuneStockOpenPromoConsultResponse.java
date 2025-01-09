package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AwardedEquityVO;
import com.alipay.api.domain.PendingEquityVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.open.promo.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-15 17:01:45
 */
public class AntfortuneStockOpenPromoConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1888968283796367181L;

	/** 
	 * 已领权益集合
	 */
	@ApiListField("awarded_equity_list")
	@ApiField("awarded_equity_v_o")
	private List<AwardedEquityVO> awardedEquityList;

	/** 
	 * 待领权益集合
	 */
	@ApiListField("pending_equity_list")
	@ApiField("pending_equity_v_o")
	private List<PendingEquityVO> pendingEquityList;

	public void setAwardedEquityList(List<AwardedEquityVO> awardedEquityList) {
		this.awardedEquityList = awardedEquityList;
	}
	public List<AwardedEquityVO> getAwardedEquityList( ) {
		return this.awardedEquityList;
	}

	public void setPendingEquityList(List<PendingEquityVO> pendingEquityList) {
		this.pendingEquityList = pendingEquityList;
	}
	public List<PendingEquityVO> getPendingEquityList( ) {
		return this.pendingEquityList;
	}

}
