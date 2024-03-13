package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 棋盘使用离线数据创建人群
 *
 * @author auto create
 * @since 1.0, 2024-01-05 17:18:00
 */
public class AlipayMerchantQipanOdpscrowdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2698158796161883888L;

	/**
	 * 安全应用范围，参考文档 安全应用范围枚举
未传值或传入渠道均非法时 采用默认渠道，默认渠道：支付结果页AA、繁星激励。
传入值时，以商户入参为准。
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 支付宝人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群名称 最大长度为15个字符
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 商户外部用户人群code 用于标识商家人群，需保证同一商户下crowd_code唯一
	 */
	@ApiField("external_crowd_code")
	private String externalCrowdCode;

	/**
	 * 人群在支付宝棋盘站点是否可见,取值如下：
true-支付宝站点不可见
false-支付宝站点可见，默认值
使用说明：创建的人群后续需使用标签进行二次圈选，且本人群对商户不可见时可设置为true。
	 */
	@ApiField("hidden")
	private Boolean hidden;

	/**
	 * 用户唯一标识列名
	 */
	@ApiField("identify_column")
	private String identifyColumn;

	/**
	 * 离线表是否分区
	 */
	@ApiField("is_partition")
	private Boolean isPartition;

	/**
	 * 离线表分区字段
	 */
	@ApiField("partition_column")
	private String partitionColumn;

	/**
	 * 离线项目空间
	 */
	@ApiField("project")
	private String project;

	/**
	 * 更新周期
1. DO_NOT:不更新
 2.DAY_N:每N天更新（N取值1,2,3,7,15,30,60,90,180,366）
	 */
	@ApiField("refresh_period")
	private String refreshPeriod;

	/**
	 * 数据源表名
	 */
	@ApiField("table")
	private String table;

	/**
	 * 过滤条件字段列表
	 */
	@ApiListField("where_columns")
	@ApiField("string")
	private List<String> whereColumns;

	/**
	 * 查询过滤条件
	 */
	@ApiField("where_condition")
	private String whereCondition;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

	public String getCrowdDesc() {
		return this.crowdDesc;
	}
	public void setCrowdDesc(String crowdDesc) {
		this.crowdDesc = crowdDesc;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getExternalCrowdCode() {
		return this.externalCrowdCode;
	}
	public void setExternalCrowdCode(String externalCrowdCode) {
		this.externalCrowdCode = externalCrowdCode;
	}

	public Boolean getHidden() {
		return this.hidden;
	}
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public String getIdentifyColumn() {
		return this.identifyColumn;
	}
	public void setIdentifyColumn(String identifyColumn) {
		this.identifyColumn = identifyColumn;
	}

	public Boolean getIsPartition() {
		return this.isPartition;
	}
	public void setIsPartition(Boolean isPartition) {
		this.isPartition = isPartition;
	}

	public String getPartitionColumn() {
		return this.partitionColumn;
	}
	public void setPartitionColumn(String partitionColumn) {
		this.partitionColumn = partitionColumn;
	}

	public String getProject() {
		return this.project;
	}
	public void setProject(String project) {
		this.project = project;
	}

	public String getRefreshPeriod() {
		return this.refreshPeriod;
	}
	public void setRefreshPeriod(String refreshPeriod) {
		this.refreshPeriod = refreshPeriod;
	}

	public String getTable() {
		return this.table;
	}
	public void setTable(String table) {
		this.table = table;
	}

	public List<String> getWhereColumns() {
		return this.whereColumns;
	}
	public void setWhereColumns(List<String> whereColumns) {
		this.whereColumns = whereColumns;
	}

	public String getWhereCondition() {
		return this.whereCondition;
	}
	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

}
