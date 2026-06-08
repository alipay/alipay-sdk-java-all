package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化解决方案门店信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-20 11:02:45
 */
public class AlipayCommerceOperationServiceShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7718318865478264216L;

	/**
	 * 门店评分：SHOP_EVALUATE
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 批量门店请求，是个JSON 序列化后大字段。
	 */
	@ApiField("request_data")
	private String requestData;

	/**
	 * 服务code，如高德扫街榜传AMAP_NFC_SPEAKER_COOP
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 主体id
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 主体类型，枚举值：ALPAY_USER（商户）、SMID（二级商户）、POIMID（门店）、LEADS_ID（leadsId）、BIZ_TID、TAG_ID、SN、EMAIL、PHONE、APP
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getRequestData() {
		return this.requestData;
	}
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
