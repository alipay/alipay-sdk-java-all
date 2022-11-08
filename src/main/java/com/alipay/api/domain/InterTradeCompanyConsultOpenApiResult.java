package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关联交易公司甄别结果
 *
 * @author auto create
 * @since 1.0, 2022-04-26 19:50:04
 */
public class InterTradeCompanyConsultOpenApiResult extends AlipayObject {

	private static final long serialVersionUID = 6666573783729546117L;

	/**
	 * 归属组织.若没有查询到关联方公司，则返回null
	 */
	@ApiField("belong_group")
	private String belongGroup;

	/**
	 * cid列表
	 */
	@ApiListField("cid_list")
	@ApiField("string")
	private List<String> cidList;

	/**
	 * mid列表
	 */
	@ApiListField("mid_list")
	@ApiField("string")
	private List<String> midList;

	/**
	 * 公司名称.若没有查询到关联方公司，则返回null
	 */
	@ApiField("name")
	private String name;

	/**
	 * ou短码.若没有查询到关联方公司，则返回null
	 */
	@ApiField("ou")
	private String ou;

	/**
	 * pid列表
	 */
	@ApiListField("pid_list")
	@ApiField("string")
	private List<String> pidList;

	/**
	 * 是否是关联方
	 */
	@ApiField("related_flag")
	private Boolean relatedFlag;

	/**
	 * uid列表
	 */
	@ApiListField("uid_list")
	@ApiField("string")
	private List<String> uidList;

	public String getBelongGroup() {
		return this.belongGroup;
	}
	public void setBelongGroup(String belongGroup) {
		this.belongGroup = belongGroup;
	}

	public List<String> getCidList() {
		return this.cidList;
	}
	public void setCidList(List<String> cidList) {
		this.cidList = cidList;
	}

	public List<String> getMidList() {
		return this.midList;
	}
	public void setMidList(List<String> midList) {
		this.midList = midList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOu() {
		return this.ou;
	}
	public void setOu(String ou) {
		this.ou = ou;
	}

	public List<String> getPidList() {
		return this.pidList;
	}
	public void setPidList(List<String> pidList) {
		this.pidList = pidList;
	}

	public Boolean getRelatedFlag() {
		return this.relatedFlag;
	}
	public void setRelatedFlag(Boolean relatedFlag) {
		this.relatedFlag = relatedFlag;
	}

	public List<String> getUidList() {
		return this.uidList;
	}
	public void setUidList(List<String> uidList) {
		this.uidList = uidList;
	}

}
