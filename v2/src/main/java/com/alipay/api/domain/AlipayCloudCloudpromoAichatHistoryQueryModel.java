package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答历史对话获取
 *
 * @author auto create
 * @since 1.0, 2024-08-26 15:49:52
 */
public class AlipayCloudCloudpromoAichatHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4711959682243382653L;

	/**
	 * 用户的ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 当前需要大于的requestId数据排序
	 */
	@ApiField("greater_request_id")
	private String greaterRequestId;

	/**
	 * 列表查询时需要小于的requestId的分页数据
	 */
	@ApiField("less_request_id")
	private String lessRequestId;

	/**
	 * 每页拉取数量，[1,10]范围，单位为int，个
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 第几页，从1开始，页码的单位为int，从1开始
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 智能问答服务场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 原始请求真实的APPID
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getGreaterRequestId() {
		return this.greaterRequestId;
	}
	public void setGreaterRequestId(String greaterRequestId) {
		this.greaterRequestId = greaterRequestId;
	}

	public String getLessRequestId() {
		return this.lessRequestId;
	}
	public void setLessRequestId(String lessRequestId) {
		this.lessRequestId = lessRequestId;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
