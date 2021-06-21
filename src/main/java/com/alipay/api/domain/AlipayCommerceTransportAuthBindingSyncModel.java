package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权绑定关系同步
 *
 * @author auto create
 * @since 1.0, 2021-06-08 19:05:12
 */
public class AlipayCommerceTransportAuthBindingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2842558245842346324L;

	/**
	 * 同步动作类型。取值bind、unbind。表示绑定和取消绑定
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权场景
	 */
	@ApiField("auth_scene")
	private String authScene;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
