package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 饿了么关系绑定审核流水回流接口
 *
 * @author auto create
 * @since 1.0, 2018-11-13 16:07:12
 */
public class KoubeiSalesKbsalesShopSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7613322979344171358L;

	/**
	 * 操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 申请绑定关系类型
	 */
	@ApiField("action_mode")
	private String actionMode;

	/**
	 * 固定填elm
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 时间戳
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * { opId: 123456, applyInfo: '审核不通过', auditor:'123456'}
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 饿了么门店id
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 口碑流水id， 饿了么leads开始的场景有该值
在线开店及绑定无该值
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 绑定关系类型
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 业务场景码
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 审核状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 饿了么审核任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getActionMode() {
		return this.actionMode;
	}
	public void setActionMode(String actionMode) {
		this.actionMode = actionMode;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalShopId() {
		return this.externalShopId;
	}
	public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
