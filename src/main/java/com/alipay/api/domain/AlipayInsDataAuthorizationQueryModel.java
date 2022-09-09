package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户授权信息
 *
 * @author auto create
 * @since 1.0, 2021-03-09 11:13:37
 */
public class AlipayInsDataAuthorizationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3371861437996924236L;

	/**
	 * 授权业务唯一单号
投保场景为保单号；理赔场景为报案号。
	 */
	@ApiField("auth_biz_no")
	private String authBizNo;

	/**
	 * 机构编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 授权场景码。枚举值：
1-投保，2-理赔
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAuthBizNo() {
		return this.authBizNo;
	}
	public void setAuthBizNo(String authBizNo) {
		this.authBizNo = authBizNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
