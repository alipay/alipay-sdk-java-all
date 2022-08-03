package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程任务
 *
 * @author auto create
 * @since 1.0, 2022-03-14 13:53:40
 */
public class BPOpenApiTask extends AlipayObject {

	private static final long serialVersionUID = 3275394427348397886L;

	/**
	 * 处理地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 详情展示地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 审批节点中文显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 操作时间
	 */
	@ApiField("gmt_operate")
	private String gmtOperate;

	/**
	 * 处理备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 审批节点code
	 */
	@ApiField("name")
	private String name;

	/**
	 * 点击的操作按钮
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 可点击的操作
	 */
	@ApiField("operate_transition")
	private String operateTransition;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 处理人花名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 加签类型
	 */
	@ApiField("sign_type")
	private String signType;

	/**
	 * 状态:CREATED,TAKEN,TEMP_SAVE,COMPLETED,CANCELED
	 */
	@ApiField("state")
	private String state;

	/**
	 * 节点类型：UserTask，SystemTask
	 */
	@ApiField("type")
	private String type;

	public String getDealUrl() {
		return this.dealUrl;
	}
	public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGmtOperate() {
		return this.gmtOperate;
	}
	public void setGmtOperate(String gmtOperate) {
		this.gmtOperate = gmtOperate;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getOperateTransition() {
		return this.operateTransition;
	}
	public void setOperateTransition(String operateTransition) {
		this.operateTransition = operateTransition;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getSignType() {
		return this.signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
