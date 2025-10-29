package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团体资金单据(资金流水)查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-06 19:46:14
 */
public class AlipayFundTransGroupfundsFundbillsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8373374831492615931L;

	/**
	 * 流水关联的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 当前查询单据流水的用户支付宝账户ID
	 */
	@ApiField("current_user_id")
	private String currentUserId;

	/**
	 * 扩展参数，可选，业务扩展时使用
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 查询类型，SINGLE: 表示仅查询当前用户流水，ALL: 表示查询所有流水，默认为SINGLE
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 业务来源,对于聚会小程序统一透传"openParty"
	 */
	@ApiField("source")
	private String source;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCurrentUserId() {
		return this.currentUserId;
	}
	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
