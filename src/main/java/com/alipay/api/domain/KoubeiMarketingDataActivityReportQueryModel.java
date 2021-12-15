package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户营销报表查询
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:22:55
 */
public class KoubeiMarketingDataActivityReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4798822858116253392L;

	/**
	 * 查询报表数据的业务日期列表，精确到天，格式为yyyymmdd，支持列表格式，数据按天返回
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
