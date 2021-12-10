package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物业小区业主信息上传
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:31:01
 */
public class AlipayEcoCplifeResidentinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8811965671999613126L;

	/**
	 * 请求流水号，由商户自定义，在商户系统内唯一标示一次业务请求。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 请求上传的住户信息列表，单次至多上传200条住户信息.
	 */
	@ApiListField("resident_info")
	@ApiField("cplife_resident_info")
	private List<CplifeResidentInfo> residentInfo;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public List<CplifeResidentInfo> getResidentInfo() {
		return this.residentInfo;
	}
	public void setResidentInfo(List<CplifeResidentInfo> residentInfo) {
		this.residentInfo = residentInfo;
	}

}
