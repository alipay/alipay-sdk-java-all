package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建行业任务模版
 *
 * @author auto create
 * @since 1.0, 2022-09-13 10:55:49
 */
public class AlipayCommerceTaskOperationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2773627624617542292L;

	/**
	 * 来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 任务周期数值
	 */
	@ApiField("cycle")
	private String cycle;

	/**
	 * 任务周期类型
	 */
	@ApiField("cycle_type")
	private String cycleType;

	/**
	 * 任务描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 扩展内容，主要满足文案等个性化的定制以及额外的配置项需求
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 任务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务场景，如茶饮：CY，景区：JQ
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 默认结算到品牌
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 任务适用门店范围类型(MULTI_SHOP-多门店任务，SINGLE_SHOP-单门店任务)
	 */
	@ApiField("shop_scope_type")
	private String shopScopeType;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 启动类型
	 */
	@ApiField("startup_type")
	private String startupType;

	/**
	 * 任务指标数值
	 */
	@ApiField("target")
	private String target;

	/**
	 * 任务指标类型
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 任务监听规则类型，监听范围包括账号(pid_smid)，门店(shop_store)，小程序(appId)：
1. pid_smid_appId - 账号+小程序
2. pid_smid_shop_store - 账号+门店
3. pid_smid - 账号
4. pid_smid_shop_store_appId - 账号+门店+小程序
	 */
	@ApiField("task_rule_type")
	private String taskRuleType;

	/**
	 * 任务类型：ZMGO-芝麻GO活动
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券模版id
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCycle() {
		return this.cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getCycleType() {
		return this.cycleType;
	}
	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getShopScopeType() {
		return this.shopScopeType;
	}
	public void setShopScopeType(String shopScopeType) {
		this.shopScopeType = shopScopeType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStartupType() {
		return this.startupType;
	}
	public void setStartupType(String startupType) {
		this.startupType = startupType;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTaskRuleType() {
		return this.taskRuleType;
	}
	public void setTaskRuleType(String taskRuleType) {
		this.taskRuleType = taskRuleType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVoucherTemplateId() {
		return this.voucherTemplateId;
	}
	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}

}
