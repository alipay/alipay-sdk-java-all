package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑销售Leads创建接口
 *
 * @author auto create
 * @since 1.0, 2021-05-06 14:58:20
 */
public class KoubeiSalesLeadsSaleleadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2858285575943836379L;

	/**
	 * 销售Leads关联的业务主体id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 销售业务主体类型，SHOP_INFO已开店，SHOP_LEADS未开店
	 */
	@ApiField("biz_principle_type")
	private String bizPrincipleType;

	/**
	 * 需要给销售Leads打上的标签Code，数组
	 */
	@ApiListField("leads_tags")
	@ApiField("string")
	private List<String> leadsTags;

	/**
	 * 销售Leads类型
	 */
	@ApiField("leads_type")
	private String leadsType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 调用方请求id，业务请求相同时应保持一致，用于幂等
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizPrincipleType() {
		return this.bizPrincipleType;
	}
	public void setBizPrincipleType(String bizPrincipleType) {
		this.bizPrincipleType = bizPrincipleType;
	}

	public List<String> getLeadsTags() {
		return this.leadsTags;
	}
	public void setLeadsTags(List<String> leadsTags) {
		this.leadsTags = leadsTags;
	}

	public String getLeadsType() {
		return this.leadsType;
	}
	public void setLeadsType(String leadsType) {
		this.leadsType = leadsType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
