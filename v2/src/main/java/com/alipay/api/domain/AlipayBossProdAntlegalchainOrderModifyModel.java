package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法链系统 更新签约状态
 *
 * @author auto create
 * @since 1.0, 2020-09-02 17:58:23
 */
public class AlipayBossProdAntlegalchainOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3177562835755166948L;

	/**
	 * 发起签约接口返回的baseDataId
	 */
	@ApiField("bas_data_id")
	private String basDataId;

	/**
	 * 业务数据请求唯一标识，需要保证唯一性
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 公司名称和公司社会信用编码二者必传
	 */
	@ApiField("corp_code")
	private String corpCode;

	/**
	 * 公司名称和公司社会信用编码二者必传
	 */
	@ApiField("corp_name")
	private String corpName;

	/**
	 * 操作人邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 签约操作原因，撤回签约操作建议传参
	 */
	@ApiField("op_reason")
	private String opReason;

	/**
	 * 签约操作类型 (CANCEL: 撤回签约；APPROVE: 确认签约)
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 请求来源系统英文名称
	 */
	@ApiField("request_app_name")
	private String requestAppName;

	/**
	 * 请求时间戳（请求时间的毫秒值）
	 */
	@ApiField("request_time_stamp")
	private String requestTimeStamp;

	/**
	 * 请求token
	 */
	@ApiField("request_token")
	private String requestToken;

	/**
	 * 阿里账号统一ID，特殊需求时使用
	 */
	@ApiField("user_id")
	private String userId;

	public String getBasDataId() {
		return this.basDataId;
	}
	public void setBasDataId(String basDataId) {
		this.basDataId = basDataId;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getCorpCode() {
		return this.corpCode;
	}
	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getOpReason() {
		return this.opReason;
	}
	public void setOpReason(String opReason) {
		this.opReason = opReason;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getRequestAppName() {
		return this.requestAppName;
	}
	public void setRequestAppName(String requestAppName) {
		this.requestAppName = requestAppName;
	}

	public String getRequestTimeStamp() {
		return this.requestTimeStamp;
	}
	public void setRequestTimeStamp(String requestTimeStamp) {
		this.requestTimeStamp = requestTimeStamp;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
