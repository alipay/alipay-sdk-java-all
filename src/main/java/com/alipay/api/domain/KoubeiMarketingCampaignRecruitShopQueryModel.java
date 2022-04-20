package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商门店分页查询接口
 *
 * @author auto create
 * @since 1.0, 2020-08-31 10:35:06
 */
public class KoubeiMarketingCampaignRecruitShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5762599751163659189L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 参与的商户Id
	 */
	@ApiField("invitee")
	private String invitee;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getInvitee() {
		return this.invitee;
	}
	public void setInvitee(String invitee) {
		this.invitee = invitee;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
