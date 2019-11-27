package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步人群数据到主站
 *
 * @author auto create
 * @since 1.0, 2017-10-16 17:30:17
 */
public class AlipayDataDataserviceDmpCrowdSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4446481511152598526L;

	/**
	 * dmp人群的code，是主站odps表的人群分区
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 金融云dmp人群表指定要同步的分区，dmp固定传null，因为dmp的人群表不是分区表
	 */
	@ApiField("from_partition")
	private String fromPartition;

	/**
	 * 金融云dmp系统圈定的人群表名
	 */
	@ApiField("from_table")
	private String fromTable;

	/**
	 * dmp人群数据同步到主站表的时间分区，yyyyMMdd格式
	 */
	@ApiField("to_partition")
	private String toPartition;

	/**
	 * dmp人群数据在主站odps的表名，固定为dws_fcdmp_crowd_user_dd，所有人群都导入这张表
	 */
	@ApiField("to_table")
	private String toTable;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getFromPartition() {
		return this.fromPartition;
	}
	public void setFromPartition(String fromPartition) {
		this.fromPartition = fromPartition;
	}

	public String getFromTable() {
		return this.fromTable;
	}
	public void setFromTable(String fromTable) {
		this.fromTable = fromTable;
	}

	public String getToPartition() {
		return this.toPartition;
	}
	public void setToPartition(String toPartition) {
		this.toPartition = toPartition;
	}

	public String getToTable() {
		return this.toTable;
	}
	public void setToTable(String toTable) {
		this.toTable = toTable;
	}

}
