package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号人群odps同步
 *
 * @author auto create
 * @since 1.0, 2022-06-01 15:30:14
 */
public class AlipayOpenPublicOdpsCrowdSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6387793868552833885L;

	/**
	 * 人群来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 人群名称，不能包含特殊字符
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 即离线数据分区，多级分区时，为list格式
	 */
	@ApiListField("data_partition")
	@ApiField("string")
	private List<String> dataPartition;

	/**
	 * 字段名称，账户类型非ALIPAY_USER 时必填
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 集团人群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 数据odps表单名称,格式：project.tablename
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 用户类型，支付宝账户:ALIPAY_USER,淘宝账户:TAOBAO_USER
	 */
	@ApiField("user_type")
	private String userType;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public List<String> getDataPartition() {
		return this.dataPartition;
	}
	public void setDataPartition(List<String> dataPartition) {
		this.dataPartition = dataPartition;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
