package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化解决方案流量币服务详情查询
 *
 * @author auto create
 * @since 1.0, 2026-09-20 15:57:52
 */
public class AlipayCommerceOperationServiceTaskdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8532536933494111476L;

	/**
	 * 查询类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 业务信息查询辅助字段，是个JSON 序列化后字符串，可传入分页信息和门店信息等。当query_type=EARN_DETAIL/LAUNCH_DETAIL/SHOP_EFFECT，示例：{
  "pageNum": 1,
  "pageSize": 20
}，也可以不传分页，pageNum默认1，pageSize默认 20，最大 100。如果query_type=SHOP_EFFECT，示例：{
  "pageNum": 1,
  "pageSize": 20,
  "shopId": "12345"
}。其他query_type，可传空{}
	 */
	@ApiField("request_data")
	private String requestData;

	/**
	 * 服务code，如流量币服务ALIPAY_LLB
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 主体id
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 主体类型
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
