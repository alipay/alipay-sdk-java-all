package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合约信息，用于借条服务商同步合同详情至支付宝电子借条小程序
 *
 * @author auto create
 * @since 1.0, 2024-05-28 17:07:54
 */
public class EcoContractInfo extends AlipayObject {

	private static final long serialVersionUID = 6139653642384475212L;

	/**
	 * 合约结束时间，时间戳格式，单位为毫秒
	 */
	@ApiField("contract_end_time")
	private Long contractEndTime;

	/**
	 * 合约生效时间，时间戳格式，单位为毫秒
	 */
	@ApiField("contract_start_time")
	private Long contractStartTime;

	/**
	 * 合约扩展详细信息
	 */
	@ApiField("detail_info")
	private EcoContractDetailInfo detailInfo;

	/**
	 * 合约名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部商户合约唯一标识
	 */
	@ApiField("out_contract_id")
	private String outContractId;

	/**
	 * 合约参与人信息
	 */
	@ApiListField("participant")
	@ApiField("eco_contract_participant_info")
	private List<EcoContractParticipantInfo> participant;

	/**
	 * 签署到期时间，时间戳格式，单位为毫秒
	 */
	@ApiField("sign_deadline_time")
	private Long signDeadlineTime;

	/**
	 * 双方完成签署的时间，时间戳格式，单位为毫秒，如果不传默认为0
	 */
	@ApiField("sign_end_time")
	private Long signEndTime;

	/**
	 * 双方填写完成，开始签署合约的时间，时间戳格式，单位为毫秒
	 */
	@ApiField("sign_start_time")
	private Long signStartTime;

	/**
	 * 合约发起时间，时间戳格式，单位为毫秒
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	public Long getContractEndTime() {
		return this.contractEndTime;
	}
	public void setContractEndTime(Long contractEndTime) {
		this.contractEndTime = contractEndTime;
	}

	public Long getContractStartTime() {
		return this.contractStartTime;
	}
	public void setContractStartTime(Long contractStartTime) {
		this.contractStartTime = contractStartTime;
	}

	public EcoContractDetailInfo getDetailInfo() {
		return this.detailInfo;
	}
	public void setDetailInfo(EcoContractDetailInfo detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutContractId() {
		return this.outContractId;
	}
	public void setOutContractId(String outContractId) {
		this.outContractId = outContractId;
	}

	public List<EcoContractParticipantInfo> getParticipant() {
		return this.participant;
	}
	public void setParticipant(List<EcoContractParticipantInfo> participant) {
		this.participant = participant;
	}

	public Long getSignDeadlineTime() {
		return this.signDeadlineTime;
	}
	public void setSignDeadlineTime(Long signDeadlineTime) {
		this.signDeadlineTime = signDeadlineTime;
	}

	public Long getSignEndTime() {
		return this.signEndTime;
	}
	public void setSignEndTime(Long signEndTime) {
		this.signEndTime = signEndTime;
	}

	public Long getSignStartTime() {
		return this.signStartTime;
	}
	public void setSignStartTime(Long signStartTime) {
		this.signStartTime = signStartTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
