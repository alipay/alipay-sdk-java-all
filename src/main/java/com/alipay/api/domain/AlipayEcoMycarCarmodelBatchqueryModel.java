package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车型信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:28
 */
public class AlipayEcoMycarCarmodelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7486714524691626575L;

	/**
	 * 支付宝车型库品牌编号（系统唯一）
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 支付宝车型库厂商编号（系统唯一）
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 查询类型，接口通过此参数判断本次请求是查询品牌信息还是车型信息等，brands（查询品牌），series（查询车系），company(厂商)，models（查询车型），当该字段值为brands时，则其他参数不需要填值，当该字段为series时，则字段brand_id为必填，当该字段为company时，则字段brand_id为必填，当该字段为models时，则字段serie_id或者company_id不能同时为空，
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 支付宝车型库车系编号（系统唯一）
	 */
	@ApiField("serie_id")
	private String serieId;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSerieId() {
		return this.serieId;
	}
	public void setSerieId(String serieId) {
		this.serieId = serieId;
	}

}
