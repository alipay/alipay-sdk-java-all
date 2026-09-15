package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化解决方案数字门店信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-07 17:47:51
 */
public class AlipayCommerceOperationServiceDigitalshopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5155319294418426444L;

	/**
	 * 请求类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 业务信息，是个JSON 序列化后字符串，比如商户信息、门店信息等。
当请求类型query_type是SHOP_MATCH时，格式为：{"matchItemList":[{"subjectId":"2088xx0000000001","channelType":"SG"},{"subjectId":"2088xx0000000002","channelType":"GD"}]}，其中subjectId是smid或pid，channelType填GD（高德）或SG（闪购）一次最多可以传5个id批量查询。
	 */
	@ApiField("request_data")
	private String requestData;

	/**
	 * 服务code，如数字化门店ALIPAY_DIGITALSHOP
	 */
	@ApiField("service_code")
	private String serviceCode;

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

}
