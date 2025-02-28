package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * NFC核身用户出库
 *
 * @author auto create
 * @since 1.0, 2025-02-27 10:43:38
 */
public class AlipayOfflineProviderUserinfoNpassporterDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4419166274425215647L;

	/**
	 * 身份证号
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 用户订单号，如果一个用户传入不同的订单号，则出库的时候会在所有订单都出库完之后才会彻底删除；如果传入相同的订单号，则一次出库就会删除。
	 */
	@ApiListField("out_biz_no")
	@ApiField("string")
	private List<String> outBizNo;

	/**
	 * 为了给用户分到不同的类别中。 
目前使用点位ID，由BD输出或者开放平台上的点位ID。
	 */
	@ApiField("project_id")
	private String projectId;

	public String getIdentityCard() {
		return this.identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public List<String> getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(List<String> outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
