package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.anomalydetection.bai.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:45:33
 */
public class AlipayDataIotdataAnomalydetectionBaiVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8413543319665981694L;

	/** 
	 * 结果为json字串，表示异常的详细信息，例如货物异常是新增和消失区域在图像上的坐标值
	 */
	@ApiField("event_detail")
	private String eventDetail;

	/** 
	 * 算法检测到的异常类型，0表示无异常
	 */
	@ApiField("event_type")
	private Long eventType;

	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}
	public String getEventDetail( ) {
		return this.eventDetail;
	}

	public void setEventType(Long eventType) {
		this.eventType = eventType;
	}
	public Long getEventType( ) {
		return this.eventType;
	}

}
