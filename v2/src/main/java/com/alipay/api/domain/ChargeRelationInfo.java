package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通记账关系信息
 *
 * @author auto create
 * @since 1.0, 2023-12-25 16:34:05
 */
public class ChargeRelationInfo extends AlipayObject {

	private static final long serialVersionUID = 8319826479685637414L;

	/**
	 * 关联主ID
	 */
	@ApiField("primary_id")
	private String primaryId;

	/**
	 * 关联子ID
	 */
	@ApiField("slave_id")
	private String slaveId;

	public String getPrimaryId() {
		return this.primaryId;
	}
	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public String getSlaveId() {
		return this.slaveId;
	}
	public void setSlaveId(String slaveId) {
		this.slaveId = slaveId;
	}

}
