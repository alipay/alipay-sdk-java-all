package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询商家交易，活动报表数据
 *
 * @author auto create
 * @since 1.0, 2016-04-13 15:33:57
 */
public class AlipayDataDataserviceReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7134556566449971882L;

	/**
	 * 查询报表数据的业务日期列表，精确到天，格式为yyyymmdd，支持列表格式，数据按天返回
	 */
	@ApiListField("biz_date_list")
	@ApiField("string")
	private List<String> bizDateList;

	/**
	 * 待查询商户在支付宝的合作id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 查询报表的类型，当前支持两种，TRADE-交易报表数据，ACTIVITY-活动报表数据
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 查询报表数据的门店列表，数据返回会把符合门店列表中的条件的数据进行汇总返回
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	/**
	 * report_type为ACTIVITY时才有效，查询报表数据的优惠模板列表，数据返回会把符合优惠模板列表中的条件的数据进行汇总返回
	 */
	@ApiListField("template_id_list")
	@ApiField("string")
	private List<String> templateIdList;

	public List<String> getBizDateList() {
		return this.bizDateList;
	}
	public void setBizDateList(List<String> bizDateList) {
		this.bizDateList = bizDateList;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

	public List<String> getTemplateIdList() {
		return this.templateIdList;
	}
	public void setTemplateIdList(List<String> templateIdList) {
		this.templateIdList = templateIdList;
	}

}
