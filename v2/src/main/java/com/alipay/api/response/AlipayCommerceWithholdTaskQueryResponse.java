package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WithholdTradeDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withhold.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-12 16:22:23
 */
public class AlipayCommerceWithholdTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3857692467361619357L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 代扣任务ID
	 */
	@ApiField("withhold_no")
	private String withholdNo;

	/** 
	 * 扣款交易列表
	 */
	@ApiListField("withhold_trades")
	@ApiField("withhold_trade_d_t_o")
	private List<WithholdTradeDTO> withholdTrades;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setWithholdNo(String withholdNo) {
		this.withholdNo = withholdNo;
	}
	public String getWithholdNo( ) {
		return this.withholdNo;
	}

	public void setWithholdTrades(List<WithholdTradeDTO> withholdTrades) {
		this.withholdTrades = withholdTrades;
	}
	public List<WithholdTradeDTO> getWithholdTrades( ) {
		return this.withholdTrades;
	}

}
