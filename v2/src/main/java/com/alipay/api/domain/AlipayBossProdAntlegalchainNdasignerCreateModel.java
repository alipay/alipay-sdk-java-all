package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * MA上签添加新签约人
 *
 * @author auto create
 * @since 1.0, 2023-08-18 15:03:34
 */
public class AlipayBossProdAntlegalchainNdasignerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6229497998158529495L;

	/**
	 * 来源系统
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 协议编号
	 */
	@ApiField("instl_id")
	private Long instlId;

	/**
	 * 操作人的员工工号,请注意是对应协议发布人企业/组织/团队的员工工号
	 */
	@ApiField("opr_staff_id")
	private String oprStaffId;

	/**
	 * 签约人列表,新增签约人单批次不能超过200人，且不传员工名字会查询名字，传员工名字则按该名字发起签约
	 */
	@ApiListField("signer_list")
	@ApiField("antlc_signer_request")
	private List<AntlcSignerRequest> signerList;

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

	public List<AntlcSignerRequest> getSignerList() {
		return this.signerList;
	}
	public void setSignerList(List<AntlcSignerRequest> signerList) {
		this.signerList = signerList;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
