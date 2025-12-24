package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境商户基础模型
 *
 * @author auto create
 * @since 1.0, 2021-08-18 10:31:37
 */
public class BaseCrossborderMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 4637841195579588667L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 组织名称，如：支付宝（中国）网络技术有限公司
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 如支付宝统一社会信用代码：91310115768225450T
	 */
	@ApiField("uscc")
	private String uscc;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
