package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询推荐医生的埋点数据
 *
 * @author auto create
 * @since 1.0, 2025-10-15 14:40:17
 */
public class AlipayCommerceMedicalDoctorScmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8766842176162694263L;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 医生id列表
	 */
	@ApiListField("doctor_id_list")
	@ApiField("string")
	private List<String> doctorIdList;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public List<String> getDoctorIdList() {
		return this.doctorIdList;
	}
	public void setDoctorIdList(List<String> doctorIdList) {
		this.doctorIdList = doctorIdList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
