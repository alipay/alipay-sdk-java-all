package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 某自然人担任 法人/股东/主要管理人员 的企业信息
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:33:23
 */
public class CompanyRole extends AlipayObject {

	private static final long serialVersionUID = 7286765343335661814L;

	/**
	 * 自然人担任企业法人的企业信息
	 */
	@ApiListField("ry_pos_fr_list")
	@ApiField("ep_info")
	private List<EpInfo> ryPosFrList;

	/**
	 * 自然人担任股东的企业信息
	 */
	@ApiListField("ry_pos_sha_list")
	@ApiField("ep_info")
	private List<EpInfo> ryPosShaList;

	/**
	 * 自然人担任主要管理人员的企业信息
	 */
	@ApiListField("share_holder_list")
	@ApiField("ep_info")
	private List<EpInfo> shareHolderList;

	public List<EpInfo> getRyPosFrList() {
		return this.ryPosFrList;
	}
	public void setRyPosFrList(List<EpInfo> ryPosFrList) {
		this.ryPosFrList = ryPosFrList;
	}

	public List<EpInfo> getRyPosShaList() {
		return this.ryPosShaList;
	}
	public void setRyPosShaList(List<EpInfo> ryPosShaList) {
		this.ryPosShaList = ryPosShaList;
	}

	public List<EpInfo> getShareHolderList() {
		return this.shareHolderList;
	}
	public void setShareHolderList(List<EpInfo> shareHolderList) {
		this.shareHolderList = shareHolderList;
	}

}
