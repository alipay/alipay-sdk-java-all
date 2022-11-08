package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于商业关系的异动门店收单信息
 *
 * @author auto create
 * @since 1.0, 2022-01-13 14:29:38
 */
public class BusinessRelationChangeMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 5889331541514284948L;

	/**
	 * 异动码，TRD_ADD_TOOL-标识机具新增，TRADE_DROP_ZERO-标识机具跌零
	 */
	@ApiField("change_code")
	private String changeCode;

	/**
	 * 商业关系门店收单描述
	 */
	@ApiField("ip_role_desc")
	private String ipRoleDesc;

	/**
	 * 商业关系门店收单编号，脱敏的pid信息
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 商业关系门店收单类型，PID/SMID
	 */
	@ApiField("ip_role_type")
	private String ipRoleType;

	public String getChangeCode() {
		return this.changeCode;
	}
	public void setChangeCode(String changeCode) {
		this.changeCode = changeCode;
	}

	public String getIpRoleDesc() {
		return this.ipRoleDesc;
	}
	public void setIpRoleDesc(String ipRoleDesc) {
		this.ipRoleDesc = ipRoleDesc;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIpRoleType() {
		return this.ipRoleType;
	}
	public void setIpRoleType(String ipRoleType) {
		this.ipRoleType = ipRoleType;
	}

}
