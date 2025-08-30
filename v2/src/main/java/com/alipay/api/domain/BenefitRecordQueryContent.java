package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益流水查询内容
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRecordQueryContent extends AlipayObject {

	private static final long serialVersionUID = 8621289366792511362L;

	/**
	 * 权益订单信息
	 */
	@ApiListField("play_luck_draw_order_infos")
	@ApiField("benefit_order_info")
	private List<BenefitOrderInfo> playLuckDrawOrderInfos;

	public List<BenefitOrderInfo> getPlayLuckDrawOrderInfos() {
		return this.playLuckDrawOrderInfos;
	}
	public void setPlayLuckDrawOrderInfos(List<BenefitOrderInfo> playLuckDrawOrderInfos) {
		this.playLuckDrawOrderInfos = playLuckDrawOrderInfos;
	}

}
