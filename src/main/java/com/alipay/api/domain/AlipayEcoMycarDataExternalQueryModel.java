package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业平台外部查询请求
 *
 * @author auto create
 * @since 1.0, 2020-07-30 15:16:49
 */
public class AlipayEcoMycarDataExternalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3269645728294857821L;

	/**
	 * external_system_name
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/**
	 * is_transfer_uid
	 */
	@ApiField("is_transfer_uid")
	private Boolean isTransferUid;

	/**
	 * operate_type
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * query_condition
	 */
	@ApiField("query_condition")
	private String queryCondition;

	public String getExternalSystemName() {
		return this.externalSystemName;
	}
	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

	public Boolean getIsTransferUid() {
		return this.isTransferUid;
	}
	public void setIsTransferUid(Boolean isTransferUid) {
		this.isTransferUid = isTransferUid;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getQueryCondition() {
		return this.queryCondition;
	}
	public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
	}

}
