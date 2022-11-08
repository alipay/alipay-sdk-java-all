package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量初始化交互式风控产品
 *
 * @author auto create
 * @since 1.0, 2022-10-28 10:38:08
 */
public class AlipaySecurityProdInteractiveprodBatchInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3268985133921298558L;

	/**
	 * 全局唯一id，标识一次任务
	 */
	@ApiField("batch_biz_id")
	private String batchBizId;

	/**
	 * 商品id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 商品场景
	 */
	@ApiField("commodity_scene")
	private String commodityScene;

	/**
	 * 当前任务的数据条数
	 */
	@ApiField("data_count")
	private Long dataCount;

	/**
	 * csv文件下载地址，csv文件列头，为各个属性key
	 */
	@ApiField("data_url")
	private String dataUrl;

	/**
	 * 扩展参数，JSON格式
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 登录系统的userId
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 登录系统的userId
	 */
	@ApiField("operator_open_id")
	private String operatorOpenId;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBatchBizId() {
		return this.batchBizId;
	}
	public void setBatchBizId(String batchBizId) {
		this.batchBizId = batchBizId;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityScene() {
		return this.commodityScene;
	}
	public void setCommodityScene(String commodityScene) {
		this.commodityScene = commodityScene;
	}

	public Long getDataCount() {
		return this.dataCount;
	}
	public void setDataCount(Long dataCount) {
		this.dataCount = dataCount;
	}

	public String getDataUrl() {
		return this.dataUrl;
	}
	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorOpenId() {
		return this.operatorOpenId;
	}
	public void setOperatorOpenId(String operatorOpenId) {
		this.operatorOpenId = operatorOpenId;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
