package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertMissionQueryResponse;
import com.alipay.api.domain.KbAdvertProcessMissionResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.mission.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionMissionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2335884424911874974L;

	/** 
	 * 分佣任务信息
该列表中的任务为已经创建成功的任务，并处于EFFECTIVE或者INVALID状态
	 */
	@ApiListField("data")
	@ApiField("kb_advert_mission_query_response")
	private List<KbAdvertMissionQueryResponse> data;

	/** 
	 * 创建处理中任务信息
1、只有待确认的任务（服务商代创建任务），才会出现在该列表中，如果已经确认，则在任务列表data中 
2、处理中任务只返回任务状态，以及identify（用于查找任务）
3、由于未创建任务，因此不分配任务ID
	 */
	@ApiField("processing_data")
	private KbAdvertProcessMissionResponse processingData;

	public void setData(List<KbAdvertMissionQueryResponse> data) {
		this.data = data;
	}
	public List<KbAdvertMissionQueryResponse> getData( ) {
		return this.data;
	}

	public void setProcessingData(KbAdvertProcessMissionResponse processingData) {
		this.processingData = processingData;
	}
	public KbAdvertProcessMissionResponse getProcessingData( ) {
		return this.processingData;
	}

}
