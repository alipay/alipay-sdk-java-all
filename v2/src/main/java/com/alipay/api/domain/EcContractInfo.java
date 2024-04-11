package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码合约信息
 *
 * @author auto create
 * @since 1.0, 2023-03-15 17:27:14
 */
public class EcContractInfo extends AlipayObject {

	private static final long serialVersionUID = 6425643813574218287L;

	/**
	 * 合约解约时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * 合约id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合约名称
	 */
	@ApiField("contract_title")
	private String contractTitle;

	/**
	 * 甲方id
	 */
	@ApiField("first_party_id")
	private String firstPartyId;

	/**
	 * 甲方名称
	 */
	@ApiField("first_party_name")
	private String firstPartyName;

	/**
	 * 外部幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 协议信息列表
	 */
	@ApiListField("protocol_info_list")
	@ApiField("ec_protocol_info")
	private List<EcProtocolInfo> protocolInfoList;

	/**
	 * 合约场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 乙方ID
	 */
	@ApiField("second_party_id")
	private String secondPartyId;

	/**
	 * 乙方名称
	 */
	@ApiField("second_party_name")
	private String secondPartyName;

	/**
	 * 签署时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	public Date getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractTitle() {
		return this.contractTitle;
	}
	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public String getFirstPartyId() {
		return this.firstPartyId;
	}
	public void setFirstPartyId(String firstPartyId) {
		this.firstPartyId = firstPartyId;
	}

	public String getFirstPartyName() {
		return this.firstPartyName;
	}
	public void setFirstPartyName(String firstPartyName) {
		this.firstPartyName = firstPartyName;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<EcProtocolInfo> getProtocolInfoList() {
		return this.protocolInfoList;
	}
	public void setProtocolInfoList(List<EcProtocolInfo> protocolInfoList) {
		this.protocolInfoList = protocolInfoList;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSecondPartyId() {
		return this.secondPartyId;
	}
	public void setSecondPartyId(String secondPartyId) {
		this.secondPartyId = secondPartyId;
	}

	public String getSecondPartyName() {
		return this.secondPartyName;
	}
	public void setSecondPartyName(String secondPartyName) {
		this.secondPartyName = secondPartyName;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
