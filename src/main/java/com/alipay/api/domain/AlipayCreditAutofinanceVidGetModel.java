package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取汽车金融核身使用的ID
 *
 * @author auto create
 * @since 1.0, 2016-10-17 16:44:36
 */
public class AlipayCreditAutofinanceVidGetModel extends AlipayObject {

	private static final long serialVersionUID = 3127847575759821652L;

	/**
	 * 机构编号
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 支付宝账号数字ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 当前安装的支付宝钱包版本号
	 */
	@ApiField("version")
	private String version;

	public String getOrgcode() {
		return this.orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
