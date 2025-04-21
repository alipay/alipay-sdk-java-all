package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessTimeBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.shop.business.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:36
 */
public class AlipayOfflineSmddShopBusinessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5347392373927193354L;

	/** 
	 * 营业状态
IN_BUSINESS（营业中）/OUT_OF_BUSINESS（暂停营业）
	 */
	@ApiField("business_status")
	private String businessStatus;

	/** 
	 * 营业时间文案，透出营业时间给C用户查看
	 */
	@ApiField("business_time_desc")
	private String businessTimeDesc;

	/** 
	 * 营业时间列表，多段营业时间。该字段不存在表示全天营业
	 */
	@ApiListField("business_time_list")
	@ApiField("business_time_bean")
	private List<BusinessTimeBean> businessTimeList;

	/** 
	 * 当营业状态处于营业中时，判断当前是否是否处于营业时间内
	 */
	@ApiField("business_time_rest")
	private Boolean businessTimeRest;

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	public String getBusinessStatus( ) {
		return this.businessStatus;
	}

	public void setBusinessTimeDesc(String businessTimeDesc) {
		this.businessTimeDesc = businessTimeDesc;
	}
	public String getBusinessTimeDesc( ) {
		return this.businessTimeDesc;
	}

	public void setBusinessTimeList(List<BusinessTimeBean> businessTimeList) {
		this.businessTimeList = businessTimeList;
	}
	public List<BusinessTimeBean> getBusinessTimeList( ) {
		return this.businessTimeList;
	}

	public void setBusinessTimeRest(Boolean businessTimeRest) {
		this.businessTimeRest = businessTimeRest;
	}
	public Boolean getBusinessTimeRest( ) {
		return this.businessTimeRest;
	}

}
