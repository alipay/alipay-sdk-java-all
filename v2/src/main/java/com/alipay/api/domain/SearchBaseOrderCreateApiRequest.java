package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基础工单提报入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:00:44
 */
public class SearchBaseOrderCreateApiRequest extends AlipayObject {

	private static final long serialVersionUID = 3418954469958766813L;

	/**
	 * 搜索直达类型 BASE：基础信息，只支持基础信息工单提报
	 */
	@ApiField("access_type")
	private String accessType;

	/**
	 * 小程序Id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 基础信息申请单提报详情
	 */
	@ApiField("base_items")
	private SearchBaseItems baseItems;

	/**
	 * 服务描述
	 */
	@ApiField("descprise")
	private String descprise;

	/**
	 * 是否为草稿态
	 */
	@ApiField("is_draft")
	private Boolean isDraft;

	/**
	 * 申请单id，仅仅驳回或修改是传入
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务的类型 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getAccessType() {
		return this.accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public SearchBaseItems getBaseItems() {
		return this.baseItems;
	}
	public void setBaseItems(SearchBaseItems baseItems) {
		this.baseItems = baseItems;
	}

	public String getDescprise() {
		return this.descprise;
	}
	public void setDescprise(String descprise) {
		this.descprise = descprise;
	}

	public Boolean getIsDraft() {
		return this.isDraft;
	}
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
