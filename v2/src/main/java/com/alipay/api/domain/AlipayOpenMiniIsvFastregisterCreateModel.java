package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV代创建试用小程序
 *
 * @author auto create
 * @since 1.0, 2023-03-01 09:51:33
 */
public class AlipayOpenMiniIsvFastregisterCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1747698267733564366L;

	/**
	 * 小程序名称，昵称半自动设定，强制后缀“的试用小程序”。且该参数会进行关键字检查，如果命中品牌关键字则会报错。
如遇到品牌大客户要用试用小程序，建议用户先换个名字，认证后再修改成品牌名。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 授权确认成功后回调h5链接或小程序页面
	 */
	@ApiField("auth_notify_url")
	private String authNotifyUrl;

	/**
	 * 开发者外部订单号，通过开发者账号+外部订单号做业务幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户uid
	 */
	@ApiField("uid")
	private String uid;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAuthNotifyUrl() {
		return this.authNotifyUrl;
	}
	public void setAuthNotifyUrl(String authNotifyUrl) {
		this.authNotifyUrl = authNotifyUrl;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
