package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝货品推广计划创建
 *
 * @author auto create
 * @since 1.0, 2022-12-29 20:52:16
 */
public class AlipayMerchantLiveItemplanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8632574754961991885L;

	/**
	 * 投放内容，数组，内容为具体条目
	 */
	@ApiListField("content")
	@ApiField("item_plan_content_d_o")
	private List<ItemPlanContentDO> content;

	/**
	 * 可空，计划截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 针对投放内容的操作， 包含3种类型：
覆盖:OVERRIDE 
追加:APPEND 
删除:DELETE
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 投放方标识，一般为小程序id
	 */
	@ApiField("operator_appid")
	private String operatorAppid;

	/**
	 * 投放方类型，生活号：LIFE_APP 达人：CONTENT_USER 小程序：TINYAPP
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 投放计划名，可空
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 可空，计划生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 计划状态 0待生效 1生效中 -1已作废
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 投放目标，一般为生活号id，多个逗号隔开
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 投放范围， 指主体内的具体子渠道，为空则任意子渠道
	 */
	@ApiField("target_range")
	private String targetRange;

	/**
	 * 投放目标类型
生活号：LIFE_APP 
达人：CONTENT_USER 
小程序:TINYAPP
	 */
	@ApiField("target_type")
	private String targetType;

	public List<ItemPlanContentDO> getContent() {
		return this.content;
	}
	public void setContent(List<ItemPlanContentDO> content) {
		this.content = content;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getOperatorAppid() {
		return this.operatorAppid;
	}
	public void setOperatorAppid(String operatorAppid) {
		this.operatorAppid = operatorAppid;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetRange() {
		return this.targetRange;
	}
	public void setTargetRange(String targetRange) {
		this.targetRange = targetRange;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
