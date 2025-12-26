package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询视频会议信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:05
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6443832549421484113L;

	/**
	 * 视频会议ID集合
	 */
	@ApiListField("video_conference_id_list")
	@ApiField("number")
	private List<Long> videoConferenceIdList;

	public List<Long> getVideoConferenceIdList() {
		return this.videoConferenceIdList;
	}
	public void setVideoConferenceIdList(List<Long> videoConferenceIdList) {
		this.videoConferenceIdList = videoConferenceIdList;
	}

}
