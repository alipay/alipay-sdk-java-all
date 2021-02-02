package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户秩序咨询
 *
 * @author auto create
 * @since 1.0, 2020-08-25 20:45:02
 */
public class AlipayUserAccountOrderConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3646699318839373255L;

	/**
	 * 集团havana ID
	 */
	@ApiField("hid")
	private String hid;

	/**
	 * 登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getHid() {
		return this.hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
