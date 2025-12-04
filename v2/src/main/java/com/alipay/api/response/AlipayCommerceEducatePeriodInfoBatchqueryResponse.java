package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduPeriodInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.period.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducatePeriodInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8188431245943568811L;

	/** 
	 * 课时列表
	 */
	@ApiListField("period_list")
	@ApiField("edu_period_info")
	private List<EduPeriodInfo> periodList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setPeriodList(List<EduPeriodInfo> periodList) {
		this.periodList = periodList;
	}
	public List<EduPeriodInfo> getPeriodList( ) {
		return this.periodList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
