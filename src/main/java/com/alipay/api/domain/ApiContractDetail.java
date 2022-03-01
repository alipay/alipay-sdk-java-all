package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 约定详情模型
 *
 * @author auto create
 * @since 1.0, 2020-09-16 19:41:10
 */
public class ApiContractDetail extends AlipayObject {

	private static final long serialVersionUID = 7652626918275755158L;

	/**
	 * 合约取消时间
	 */
	@ApiField("cancel_date")
	private String cancelDate;

	/**
	 * 合约完结时间
	 */
	@ApiField("complete_date")
	private String completeDate;

	/**
	 * 合约事项列表
	 */
	@ApiListField("contract_items")
	@ApiField("api_contract_item")
	private List<ApiContractItem> contractItems;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * INIT、EFFECT、COMPLETE、CLOSE、INVALID
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * APPLY_CANCEL、CANCEL_CONFIRM、CANCEL_FORCE、REFUSE、UNDONE
	 */
	@ApiField("contract_sub_status")
	private String contractSubStatus;

	/**
	 * 合约生效时间
	 */
	@ApiField("effect_date")
	private String effectDate;

	/**
	 * 约定失效时间
	 */
	@ApiField("invalid_date")
	private String invalidDate;

	/**
	 * 事项列表(废弃)
	 */
	@ApiField("items")
	private ApiContractItem items;

	/**
	 * 历史加入人次
	 */
	@ApiField("join_history_people")
	private Long joinHistoryPeople;

	/**
	 * 发约单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 发约主体id
	 */
	@ApiField("offer_principal_id")
	private String offerPrincipalId;

	/**
	 * 参与者列表
	 */
	@ApiListField("participants")
	@ApiField("api_contract_participant")
	private List<ApiContractParticipant> participants;

	/**
	 * 模版号
	 */
	@ApiField("template_no")
	private String templateNo;

	public String getCancelDate() {
		return this.cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCompleteDate() {
		return this.completeDate;
	}
	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}

	public List<ApiContractItem> getContractItems() {
		return this.contractItems;
	}
	public void setContractItems(List<ApiContractItem> contractItems) {
		this.contractItems = contractItems;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractSubStatus() {
		return this.contractSubStatus;
	}
	public void setContractSubStatus(String contractSubStatus) {
		this.contractSubStatus = contractSubStatus;
	}

	public String getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

	public String getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	public ApiContractItem getItems() {
		return this.items;
	}
	public void setItems(ApiContractItem items) {
		this.items = items;
	}

	public Long getJoinHistoryPeople() {
		return this.joinHistoryPeople;
	}
	public void setJoinHistoryPeople(Long joinHistoryPeople) {
		this.joinHistoryPeople = joinHistoryPeople;
	}

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public String getOfferPrincipalId() {
		return this.offerPrincipalId;
	}
	public void setOfferPrincipalId(String offerPrincipalId) {
		this.offerPrincipalId = offerPrincipalId;
	}

	public List<ApiContractParticipant> getParticipants() {
		return this.participants;
	}
	public void setParticipants(List<ApiContractParticipant> participants) {
		this.participants = participants;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

}
