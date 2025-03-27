package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台完结线下交易投诉工单
 *
 * @author auto create
 * @since 1.0, 2023-01-12 10:57:16
 */
public class AlipayMerchantComplainGovernmentFinishModel extends AlipayObject {

	private static final long serialVersionUID = 7247589192631949441L;

	/**
	 * 支付宝侧投诉工单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	/**
	 * 平台完结时的结案陈词
	 */
	@ApiField("finish_memo")
	private String finishMemo;

	/**
	 * 处理该笔投诉的政府单位
	 */
	@ApiField("government_agency")
	private String governmentAgency;

	public String getComplainEventId() {
		return this.complainEventId;
	}
	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
	}

	public String getFinishMemo() {
		return this.finishMemo;
	}
	public void setFinishMemo(String finishMemo) {
		this.finishMemo = finishMemo;
	}

	public String getGovernmentAgency() {
		return this.governmentAgency;
	}
	public void setGovernmentAgency(String governmentAgency) {
		this.governmentAgency = governmentAgency;
	}

}
