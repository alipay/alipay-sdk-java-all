package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuotaControlMetric;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.feeitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-07 10:08:41
 */
public class AlipayCloudCloudbaseQuotacontrolFeeitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2167755188642154652L;

	/** 
	 * 额度指标列表
	 */
	@ApiListField("fee_items")
	@ApiField("quota_control_metric")
	private List<QuotaControlMetric> feeItems;

	public void setFeeItems(List<QuotaControlMetric> feeItems) {
		this.feeItems = feeItems;
	}
	public List<QuotaControlMetric> getFeeItems( ) {
		return this.feeItems;
	}

}
