package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubVenueAuditStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.venue.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:18
 */
public class AlipayCommerceSportsVenueCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3142754538365572659L;

	/** 
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 服务商对应的场馆ID
	 */
	@ApiField("out_venue_id")
	private String outVenueId;

	/** 
	 * 子场馆信息
	 */
	@ApiListField("sub_venue_list")
	@ApiField("sub_venue_audit_status")
	private List<SubVenueAuditStatus> subVenueList;

	/** 
	 * 支付宝对应的场馆ID
	 */
	@ApiField("venue_id")
	private String venueId;

	/** 
	 * 场馆当前状态
安全审核中：infosec-audit
安全审核不通过：infosec-unpass
云验收中： cloud-audit
云验收不通过： cloud-unpass
上架： online
下架： offline
人工下架： manual-offline
	 */
	@ApiField("venue_status")
	private String venueStatus;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setOutVenueId(String outVenueId) {
		this.outVenueId = outVenueId;
	}
	public String getOutVenueId( ) {
		return this.outVenueId;
	}

	public void setSubVenueList(List<SubVenueAuditStatus> subVenueList) {
		this.subVenueList = subVenueList;
	}
	public List<SubVenueAuditStatus> getSubVenueList( ) {
		return this.subVenueList;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}
	public String getVenueId( ) {
		return this.venueId;
	}

	public void setVenueStatus(String venueStatus) {
		this.venueStatus = venueStatus;
	}
	public String getVenueStatus( ) {
		return this.venueStatus;
	}

}
