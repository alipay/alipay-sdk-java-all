package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 光华平台服务运营数据批量查询
 *
 * @author auto create
 * @since 1.0, 2025-06-25 20:20:38
 */
public class AlipayEcoCityserviceOpeneventAppdataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8316945734136247128L;

	/**
	 * 行业编码，一网通办机构传 CITYSERVICE
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 格式为 yyyy-MM-dd 的字符串
	 */
	@ApiField("date")
	private String date;

	/**
	 * day | week | month 选择一个传入；day 表示取当天数据，week表示取当天向前7天内的汇总数据；month表示取当前向前30天内的汇总数据
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 分页时，当前页码。起始值为1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页时，每页的大小。最大值为100，最小值为1
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 要查询的数据看版类型标识
	 */
	@ApiField("panel_type")
	private String panelType;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
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

	public String getPanelType() {
		return this.panelType;
	}
	public void setPanelType(String panelType) {
		this.panelType = panelType;
	}

}
