package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户周期卡间连参数配置
 *
 * @author auto create
 * @since 1.0, 2024-08-12 18:52:47
 */
public class AlipayCommercePeriodcardIndirectconfigCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7212838496679936281L;

	/**
	 * 群组code
	 */
	@ApiField("group_code")
	private String groupCode;

	/**
	 * 群组信用服务id
	 */
	@ApiField("group_zm_service_id")
	private String groupZmServiceId;

	/**
	 * 接口消息通知appid
	 */
	@ApiField("notify_app_id")
	private String notifyAppId;

	/**
	 * 机构pid
	 */
	@ApiField("org_pid")
	private String orgPid;

	/**
	 * 扣款场景码
	 */
	@ApiField("sign_scene")
	private String signScene;

	public String getGroupCode() {
		return this.groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupZmServiceId() {
		return this.groupZmServiceId;
	}
	public void setGroupZmServiceId(String groupZmServiceId) {
		this.groupZmServiceId = groupZmServiceId;
	}

	public String getNotifyAppId() {
		return this.notifyAppId;
	}
	public void setNotifyAppId(String notifyAppId) {
		this.notifyAppId = notifyAppId;
	}

	public String getOrgPid() {
		return this.orgPid;
	}
	public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

}
