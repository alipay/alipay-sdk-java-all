package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业涉诉记录
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:44:26
 */
public class LawsuitRecord extends AlipayObject {

	private static final long serialVersionUID = 3684236941488376236L;

	/**
	 * 案件流程列表
	 */
	@ApiListField("ajlc_list")
	@ApiField("ep_info")
	private List<EpInfo> ajlcList;

	/**
	 * 曝光台列表
	 */
	@ApiListField("bgt_list")
	@ApiField("ep_info")
	private List<EpInfo> bgtList;

	/**
	 * 裁判文书列表
	 */
	@ApiListField("cpws_list")
	@ApiField("ep_info")
	private List<EpInfo> cpwsList;

	/**
	 * 法院公告列表
	 */
	@ApiListField("fygg_list")
	@ApiField("ep_info")
	private List<EpInfo> fyggList;

	/**
	 * 开庭公告列表
	 */
	@ApiListField("ktgg_list")
	@ApiField("ep_info")
	private List<EpInfo> ktggList;

	/**
	 * 失信公告列表
	 */
	@ApiListField("sxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> sxggList;

	/**
	 * 执行公告列表
	 */
	@ApiListField("zxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> zxggList;

	public List<EpInfo> getAjlcList() {
		return this.ajlcList;
	}
	public void setAjlcList(List<EpInfo> ajlcList) {
		this.ajlcList = ajlcList;
	}

	public List<EpInfo> getBgtList() {
		return this.bgtList;
	}
	public void setBgtList(List<EpInfo> bgtList) {
		this.bgtList = bgtList;
	}

	public List<EpInfo> getCpwsList() {
		return this.cpwsList;
	}
	public void setCpwsList(List<EpInfo> cpwsList) {
		this.cpwsList = cpwsList;
	}

	public List<EpInfo> getFyggList() {
		return this.fyggList;
	}
	public void setFyggList(List<EpInfo> fyggList) {
		this.fyggList = fyggList;
	}

	public List<EpInfo> getKtggList() {
		return this.ktggList;
	}
	public void setKtggList(List<EpInfo> ktggList) {
		this.ktggList = ktggList;
	}

	public List<EpInfo> getSxggList() {
		return this.sxggList;
	}
	public void setSxggList(List<EpInfo> sxggList) {
		this.sxggList = sxggList;
	}

	public List<EpInfo> getZxggList() {
		return this.zxggList;
	}
	public void setZxggList(List<EpInfo> zxggList) {
		this.zxggList = zxggList;
	}

}
