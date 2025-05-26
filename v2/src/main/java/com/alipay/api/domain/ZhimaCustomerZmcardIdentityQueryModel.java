package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻证经营版身份信息查询
 *
 * @author auto create
 * @since 1.0, 2024-07-09 17:02:16
 */
public class ZhimaCustomerZmcardIdentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7397887377494866867L;

	/**
	 * 访客支付宝open_id，与guest_uid二选一
	 */
	@ApiField("guest_open_id")
	private String guestOpenId;

	/**
	 * 访客uid，如果是主态访问，与host_uid保持一致。如果不填，默认是客态访问；
	 */
	@ApiField("guest_uid")
	private String guestUid;

	/**
	 * 持证人支付宝openId，与host_uid二选一
	 */
	@ApiField("host_open_id")
	private String hostOpenId;

	/**
	 * 持证人支付宝uid
	 */
	@ApiField("host_uid")
	private String hostUid;

	/**
	 * 角色身份类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	public String getGuestOpenId() {
		return this.guestOpenId;
	}
	public void setGuestOpenId(String guestOpenId) {
		this.guestOpenId = guestOpenId;
	}

	public String getGuestUid() {
		return this.guestUid;
	}
	public void setGuestUid(String guestUid) {
		this.guestUid = guestUid;
	}

	public String getHostOpenId() {
		return this.hostOpenId;
	}
	public void setHostOpenId(String hostOpenId) {
		this.hostOpenId = hostOpenId;
	}

	public String getHostUid() {
		return this.hostUid;
	}
	public void setHostUid(String hostUid) {
		this.hostUid = hostUid;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
