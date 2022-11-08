package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财富内容域直播近实时分段结果保存回调接口
 *
 * @author auto create
 * @since 1.0, 2022-04-06 21:32:36
 */
public class AntfortuneContentCommunitySegmentRealtimeSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2473523137181488347L;

	/**
	 * 直播id
	 */
	@ApiField("live_id")
	private String liveId;

	/**
	 * 请求的时间戳
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 分段内容
{
    "liveId":"",
    "segments":[
        {
            "id":"1",
            "title":"看点标题",
            "content":"看点内容xxx",
            "effectScore":0.9,
            "startTime":"123",
            "endTime":"345",
            "startTimestamp":"1648721395052",
            "endTimestamp":"1648721495052"
        }
    ]
}
	 */
	@ApiField("segment_info")
	private String segmentInfo;

	public String getLiveId() {
		return this.liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getSegmentInfo() {
		return this.segmentInfo;
	}
	public void setSegmentInfo(String segmentInfo) {
		this.segmentInfo = segmentInfo;
	}

}
