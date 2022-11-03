package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户自主监控自定义指标数据上报接口
 *
 * @author auto create
 * @since 1.0, 2021-10-22 16:28:20
 */
public class AlipayCommerceDataCustommetricSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6256497517475676291L;

	/**
	 * 自定义监控指标数据结构，商户与支付宝进行监控共建场景使用，用户按照数据结构自主上传
	 */
	@ApiListField("metric_data")
	@ApiField("custom_metric")
	private List<CustomMetric> metricData;

	/**
	 * 命名空间，商户与支付宝进行监控共建场景使用，命令空间需要先在云监控自定义监控页面配置录入。
	 */
	@ApiField("namespace")
	private String namespace;

	public List<CustomMetric> getMetricData() {
		return this.metricData;
	}
	public void setMetricData(List<CustomMetric> metricData) {
		this.metricData = metricData;
	}

	public String getNamespace() {
		return this.namespace;
	}
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

}
