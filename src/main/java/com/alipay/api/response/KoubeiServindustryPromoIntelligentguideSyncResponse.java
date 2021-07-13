package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvalidTradeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.promo.intelligentguide.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-13 17:20:34
 */
public class KoubeiServindustryPromoIntelligentguideSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7396586699571565532L;

	/** 
	 * 单次上传交易数据失败条数数量
	 */
	@ApiField("failure_count")
	private Long failureCount;

	/** 
	 * 非法交易列表，上传数据如果校验不通过，则放入该列表中返回给isv。如果全部通过，则该列表为空
	 */
	@ApiListField("invalid_trade_details")
	@ApiField("invalid_trade_detail")
	private List<InvalidTradeDetail> invalidTradeDetails;

	/** 
	 * 单次上传交易数据校验成功的数量
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setFailureCount(Long failureCount) {
		this.failureCount = failureCount;
	}
	public Long getFailureCount( ) {
		return this.failureCount;
	}

	public void setInvalidTradeDetails(List<InvalidTradeDetail> invalidTradeDetails) {
		this.invalidTradeDetails = invalidTradeDetails;
	}
	public List<InvalidTradeDetail> getInvalidTradeDetails( ) {
		return this.invalidTradeDetails;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
