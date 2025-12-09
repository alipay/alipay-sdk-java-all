package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * n作业任务信息查询
 *
 * @author auto create
 * @since 1.0, 2025-07-24 10:23:38
 */
public class AlipayOpenSpNtaskSceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7647115617217356926L;

	/**
	 * 用于查询时真正使用的参数值
	 */
	@ApiListField("batch_query_param")
	@ApiField("string")
	private List<String> batchQueryParam;

	/**
	 * 该参数决定用什么类型的参数去查询
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 该参数用于指定查询的数据是设备作业数据还是线圈作业数据
	 */
	@ApiField("scene")
	private String scene;

	public List<String> getBatchQueryParam() {
		return this.batchQueryParam;
	}
	public void setBatchQueryParam(List<String> batchQueryParam) {
		this.batchQueryParam = batchQueryParam;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
