package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 法链系统 发起多方签约
 *
 * @author auto create
 * @since 1.0, 2021-11-25 19:44:06
 */
public class AlipayBossProdAntlegalchainMultipartyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3514623996952787387L;

	/**
	 * 申请人工号(内部buc工号)
	 */
	@ApiField("apply_buc_user_no")
	private String applyBucUserNo;

	/**
	 * 关联业务数据编号
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 关联业务名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务数据请求唯一标识
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 所有签约方企业信息列表(支持多方签约, 任何一方支持多家公司主体)
	 */
	@ApiListField("corp_entity_multi_list")
	@ApiField("corp_entity")
	private List<CorpEntity> corpEntityMultiList;

	/**
	 * 签约发起方企业信息
	 */
	@ApiField("init_corp_entity")
	private CorpEntity initCorpEntity;

	/**
	 * 签约文件对象信息列表
	 */
	@ApiListField("notary_file_list")
	@ApiField("notary_file_v_o")
	private List<NotaryFileVO> notaryFileList;

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
	 * 签约顺序类型 (值为IN_ORDER: 有顺序; 值为NON_ORDER: 无顺序)；默认为“有顺序”
	 */
	@ApiField("sign_order_type")
	private String signOrderType;

	/**
	 * 发起签约时间/我方签约时间
	 */
	@ApiField("submit_time")
	private Date submitTime;

	public String getApplyBucUserNo() {
		return this.applyBucUserNo;
	}
	public void setApplyBucUserNo(String applyBucUserNo) {
		this.applyBucUserNo = applyBucUserNo;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public List<CorpEntity> getCorpEntityMultiList() {
		return this.corpEntityMultiList;
	}
	public void setCorpEntityMultiList(List<CorpEntity> corpEntityMultiList) {
		this.corpEntityMultiList = corpEntityMultiList;
	}

	public CorpEntity getInitCorpEntity() {
		return this.initCorpEntity;
	}
	public void setInitCorpEntity(CorpEntity initCorpEntity) {
		this.initCorpEntity = initCorpEntity;
	}

	public List<NotaryFileVO> getNotaryFileList() {
		return this.notaryFileList;
	}
	public void setNotaryFileList(List<NotaryFileVO> notaryFileList) {
		this.notaryFileList = notaryFileList;
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

	public String getSignOrderType() {
		return this.signOrderType;
	}
	public void setSignOrderType(String signOrderType) {
		this.signOrderType = signOrderType;
	}

	public Date getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

}
