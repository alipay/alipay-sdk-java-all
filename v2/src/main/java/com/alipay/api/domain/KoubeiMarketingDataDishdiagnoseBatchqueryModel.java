package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据条件查询推荐菜
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:57:31
 */
public class KoubeiMarketingDataDishdiagnoseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5422833932464947495L;

	/**
	 * 查询菜品类型：
*001：明星菜品；
*002：潜力菜品；
*003：其他菜品（除明星菜品和潜力菜品之外的其他一律作为其他菜品 编号为003）。
*999：查询所有菜品9。
说明：具体值可通过<a href="https://opendocs.alipay.com/apis/api_5/koubei.marketing.data.dishdiagnosetype.batchquery">koubei.marketing.data.dishdiagnosetype.batchquery</a>接口查询获得，同时此接口会返回类型及说明。
	 */
	@ApiField("item_diagnose_type")
	private String itemDiagnoseType;

	/**
	 * 从第一页开始，默认值1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，不填时默认值为 50。
注意：page_size * page_no 最多为300条，超过后将不再返回数据。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询数据时间，最新为 T-1 即上一日数据。最大保留30天，时间格式为：YYYYMMDD。如20170103。
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getItemDiagnoseType() {
		return this.itemDiagnoseType;
	}
	public void setItemDiagnoseType(String itemDiagnoseType) {
		this.itemDiagnoseType = itemDiagnoseType;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
