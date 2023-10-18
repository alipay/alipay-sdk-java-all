package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建解决方案主单
 *
 * @author auto create
 * @since 1.0, 2023-06-21 13:50:01
 */
public class AlipayOpenSpIsvSignauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3552566322873826652L;

	/**
	 * 代运营授权场景信息
	 */
	@ApiListField("isv_auth_scene_infos")
	@ApiField("isv_auth_scene_info")
	private List<IsvAuthSceneInfo> isvAuthSceneInfos;

	/**
	 * 商户登录账号
支持手机号和邮箱账号；不支持pid
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	/**
	 * 1表示需要，0表示不需要
不传参数默认是需要（1）
是否创建三方应用授权子任务，也就是是否需要给三方应用授权
	 */
	@ApiField("need_app_auth")
	private String needAppAuth;

	/**
	 * 签约单号
可通过alipay.open.agent.confirm接口获取签约单号
	 */
	@ApiField("sign_order_no")
	private String signOrderNo;

	public List<IsvAuthSceneInfo> getIsvAuthSceneInfos() {
		return this.isvAuthSceneInfos;
	}
	public void setIsvAuthSceneInfos(List<IsvAuthSceneInfo> isvAuthSceneInfos) {
		this.isvAuthSceneInfos = isvAuthSceneInfos;
	}

	public String getMerchantLogonId() {
		return this.merchantLogonId;
	}
	public void setMerchantLogonId(String merchantLogonId) {
		this.merchantLogonId = merchantLogonId;
	}

	public String getNeedAppAuth() {
		return this.needAppAuth;
	}
	public void setNeedAppAuth(String needAppAuth) {
		this.needAppAuth = needAppAuth;
	}

	public String getSignOrderNo() {
		return this.signOrderNo;
	}
	public void setSignOrderNo(String signOrderNo) {
		this.signOrderNo = signOrderNo;
	}

}
