package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FloorVideo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.manualfloor.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-25 17:36:38
 */
public class AlipayMsaasMediarecogMmtcaftscvManualfloorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8524319459922352488L;

	/** 
	 * 人工层视频信息
	 */
	@ApiListField("floor_videos")
	@ApiField("floor_video")
	private List<FloorVideo> floorVideos;

	/** 
	 * 视频状态 0:正常视频  -1:异常视频
	 */
	@ApiField("video_code")
	private String videoCode;

	public void setFloorVideos(List<FloorVideo> floorVideos) {
		this.floorVideos = floorVideos;
	}
	public List<FloorVideo> getFloorVideos( ) {
		return this.floorVideos;
	}

	public void setVideoCode(String videoCode) {
		this.videoCode = videoCode;
	}
	public String getVideoCode( ) {
		return this.videoCode;
	}

}
