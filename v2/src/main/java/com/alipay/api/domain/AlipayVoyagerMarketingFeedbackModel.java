package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * voyager营销活动投放反馈接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:17
 */
public class AlipayVoyagerMarketingFeedbackModel extends AlipayObject {

	private static final long serialVersionUID = 2215234816427965723L;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 环境信息
	 */
	@ApiField("env_info")
	private VoyagerEnvInfo envInfo;

	/**
	 * 请求端的最后点击的埋点信息
	 */
	@ApiField("last_spm")
	private String lastSpm;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * null
	 */
	@ApiListField("record_list")
	@ApiField("voyager_feedback_record")
	private List<VoyagerFeedbackRecord> recordList;

	/**
	 * 请求端源埋点信息
	 */
	@ApiField("src_spm")
	private String srcSpm;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public VoyagerEnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(VoyagerEnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public String getLastSpm() {
		return this.lastSpm;
	}
	public void setLastSpm(String lastSpm) {
		this.lastSpm = lastSpm;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<VoyagerFeedbackRecord> getRecordList() {
		return this.recordList;
	}
	public void setRecordList(List<VoyagerFeedbackRecord> recordList) {
		this.recordList = recordList;
	}

	public String getSrcSpm() {
		return this.srcSpm;
	}
	public void setSrcSpm(String srcSpm) {
		this.srcSpm = srcSpm;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
