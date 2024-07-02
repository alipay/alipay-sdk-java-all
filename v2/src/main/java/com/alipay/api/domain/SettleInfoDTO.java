package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 描述结算信息，json格式
 *
 * @author auto create
 * @since 1.0, 2023-03-06 17:54:02
 */
public class SettleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5385137877761941949L;

	/**
	 * 结算详细信息，json数组，目前只支持一条。
	 */
	@ApiListField("settle_detail_infos")
	@ApiField("settle_detail_info_d_t_o")
	private List<SettleDetailInfoDTO> settleDetailInfos;

	/**
	 * 该笔订单的超期自动确认结算时间，到达期限后，将自动确认结算。此字段只在签约账期结算模式时有效。取值范围：1d～365d。d-天。 该参数数值不接受小数点。
	 */
	@ApiField("settle_period_time")
	private String settlePeriodTime;

	public List<SettleDetailInfoDTO> getSettleDetailInfos() {
		return this.settleDetailInfos;
	}
	public void setSettleDetailInfos(List<SettleDetailInfoDTO> settleDetailInfos) {
		this.settleDetailInfos = settleDetailInfos;
	}

	public String getSettlePeriodTime() {
		return this.settlePeriodTime;
	}
	public void setSettlePeriodTime(String settlePeriodTime) {
		this.settlePeriodTime = settlePeriodTime;
	}

}
