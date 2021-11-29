package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码申请
 *
 * @author auto create
 * @since 1.0, 2021-09-08 16:56:29
 */
public class AlipayCommerceEducateTuitioncodeApplySendModel extends AlipayObject {

	private static final long serialVersionUID = 8684773713156547882L;

	/**
	 * 投诉地址
	 */
	@ApiField("complain_url")
	private String complainUrl;

	/**
	 * 外部申请单号
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 场景类型："normal"-经典类型；"driving"-驾校场景。默认为经典类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 商户账户
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 返佣pid
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getComplainUrl() {
		return this.complainUrl;
	}
	public void setComplainUrl(String complainUrl) {
		this.complainUrl = complainUrl;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
