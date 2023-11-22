package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业工商综合信息
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:33:12
 */
public class CompanyInfo extends AlipayObject {

	private static final long serialVersionUID = 4394271182927289838L;

	/**
	 * 企业历史变更信息
	 */
	@ApiListField("alter_list")
	@ApiField("ep_info")
	private List<EpInfo> alterList;

	/**
	 * 企业工商照面信息
	 */
	@ApiField("basic_info")
	private EpInfo basicInfo;

	/**
	 * 企业行政处罚信息
	 */
	@ApiListField("case_info_list")
	@ApiField("ep_info")
	private List<EpInfo> caseInfoList;

	/**
	 * 企业对外投资信息
	 */
	@ApiListField("entinv_list")
	@ApiField("ep_info")
	private List<EpInfo> entinvList;

	/**
	 * 企业法定代表人在其他公司任职信息
	 */
	@ApiListField("fr_position_list")
	@ApiField("ep_info")
	private List<EpInfo> frPositionList;

	/**
	 * 企业法定代表人对外投资信息
	 */
	@ApiListField("frinv_list")
	@ApiField("ep_info")
	private List<EpInfo> frinvList;

	/**
	 * 企业主要管理人员信息
	 */
	@ApiListField("person_list")
	@ApiField("ep_info")
	private List<EpInfo> personList;

	/**
	 * 企业股东及出资信息
	 */
	@ApiListField("share_holder_list")
	@ApiField("ep_info")
	private List<EpInfo> shareHolderList;

	public List<EpInfo> getAlterList() {
		return this.alterList;
	}
	public void setAlterList(List<EpInfo> alterList) {
		this.alterList = alterList;
	}

	public EpInfo getBasicInfo() {
		return this.basicInfo;
	}
	public void setBasicInfo(EpInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

	public List<EpInfo> getCaseInfoList() {
		return this.caseInfoList;
	}
	public void setCaseInfoList(List<EpInfo> caseInfoList) {
		this.caseInfoList = caseInfoList;
	}

	public List<EpInfo> getEntinvList() {
		return this.entinvList;
	}
	public void setEntinvList(List<EpInfo> entinvList) {
		this.entinvList = entinvList;
	}

	public List<EpInfo> getFrPositionList() {
		return this.frPositionList;
	}
	public void setFrPositionList(List<EpInfo> frPositionList) {
		this.frPositionList = frPositionList;
	}

	public List<EpInfo> getFrinvList() {
		return this.frinvList;
	}
	public void setFrinvList(List<EpInfo> frinvList) {
		this.frinvList = frinvList;
	}

	public List<EpInfo> getPersonList() {
		return this.personList;
	}
	public void setPersonList(List<EpInfo> personList) {
		this.personList = personList;
	}

	public List<EpInfo> getShareHolderList() {
		return this.shareHolderList;
	}
	public void setShareHolderList(List<EpInfo> shareHolderList) {
		this.shareHolderList = shareHolderList;
	}

}
