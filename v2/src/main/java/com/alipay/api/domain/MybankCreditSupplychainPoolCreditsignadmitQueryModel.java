package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 池融资授信及签约准入查询
 *
 * @author auto create
 * @since 1.0, 2021-03-03 14:52:55
 */
public class MybankCreditSupplychainPoolCreditsignadmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1185439858997264197L;

	/**
	 * 客户支付宝登录号，在饿了么发薪贷场景是外包服务供应商的支付宝登录号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 渠道标签，固定值，待网商分配
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * 合作机构ipRoleId，比如饿了么ipRoleId
	 */
	@ApiField("data_org_ip_role_id")
	private String dataOrgIpRoleId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getDataOrgIpRoleId() {
		return this.dataOrgIpRoleId;
	}
	public void setDataOrgIpRoleId(String dataOrgIpRoleId) {
		this.dataOrgIpRoleId = dataOrgIpRoleId;
	}

}
