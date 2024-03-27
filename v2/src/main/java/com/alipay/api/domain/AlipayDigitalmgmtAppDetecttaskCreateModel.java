package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * apmobile发起检测任务
 *
 * @author auto create
 * @since 1.0, 2023-07-17 19:30:15
 */
public class AlipayDigitalmgmtAppDetecttaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1188783715946636425L;

	/**
	 * app检测参数
	 */
	@ApiField("app_param")
	private ApmobileAppParam appParam;

	/**
	 * 外部用户id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 来源站点
	 */
	@ApiField("source")
	private String source;

	/**
	 * 请求幂等校验id
	 */
	@ApiField("trace_id")
	private String traceId;

	public ApmobileAppParam getAppParam() {
		return this.appParam;
	}
	public void setAppParam(ApmobileAppParam appParam) {
		this.appParam = appParam;
	}

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
