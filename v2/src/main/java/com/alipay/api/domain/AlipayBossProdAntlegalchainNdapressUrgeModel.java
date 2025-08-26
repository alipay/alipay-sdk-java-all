package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * MA上签催签
 *
 * @author auto create
 * @since 1.0, 2023-08-18 15:03:02
 */
public class AlipayBossProdAntlegalchainNdapressUrgeModel extends AlipayObject {

	private static final long serialVersionUID = 7546164237929466427L;

	/**
	 * 来源系统
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 协议编号,请注意过期协议，非签约中协议都是不能催签的
	 */
	@ApiField("instl_id")
	private Long instlId;

	/**
	 * 操作人的员工工号,请注意是对应协议发布人企业/组织/团队的员工工号
	 */
	@ApiField("opr_staff_id")
	private String oprStaffId;

	/**
	 * 协议签约人员工号集合,请注意是对应协议发布人企业/组织/团队的员工工号，请注意如果传入错误或不存在的工号，所有工号催签失败
	 */
	@ApiListField("staff_ids")
	@ApiField("string")
	private List<String> staffIds;

	/**
	 * 租户信息
	 */
	@ApiField("tenant")
	private String tenant;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public Long getInstlId() {
		return this.instlId;
	}
	public void setInstlId(Long instlId) {
		this.instlId = instlId;
	}

	public String getOprStaffId() {
		return this.oprStaffId;
	}
	public void setOprStaffId(String oprStaffId) {
		this.oprStaffId = oprStaffId;
	}

	public List<String> getStaffIds() {
		return this.staffIds;
	}
	public void setStaffIds(List<String> staffIds) {
		this.staffIds = staffIds;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
