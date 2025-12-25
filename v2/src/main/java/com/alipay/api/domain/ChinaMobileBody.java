package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 移动券核销接口入参Body
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:06
 */
public class ChinaMobileBody extends AlipayObject {

	private static final long serialVersionUID = 6749144848137642688L;

	/**
	 * 核销流水集合
	 */
	@ApiListField("data")
	@ApiField("china_mobile_verification_sync_data")
	private List<ChinaMobileVerificationSyncData> data;

	/**
	 * 权益方的核销流水，即每一次发生核销记录的唯一标识
1、若核销流水撤销标识=0（正常核销），此值唯一，系统将做幂等校验
2、若核销流水撤销标识=1（核销作废），此值需为本次需要作废的那一笔正常核销流水的流水号。
	 */
	@ApiField("reco_id")
	private String recoId;

	/**
	 * 该值是由权益运营管理平台分配，同channelCode
	 */
	@ApiField("rights_id")
	private String rightsId;

	/**
	 * 0:正常核销;1-核销记录作废(即返销，用户退单,券码退回到用户账户) 。为空则默认0
	 */
	@ApiField("verification_cancel_flag")
	private Long verificationCancelFlag;

	/**
	 * 0:后向同步，1:实时流水同步
本期可以暂时只考虑0-后向同步
	 */
	@ApiField("verification_type")
	private Long verificationType;

	public List<ChinaMobileVerificationSyncData> getData() {
		return this.data;
	}
	public void setData(List<ChinaMobileVerificationSyncData> data) {
		this.data = data;
	}

	public String getRecoId() {
		return this.recoId;
	}
	public void setRecoId(String recoId) {
		this.recoId = recoId;
	}

	public String getRightsId() {
		return this.rightsId;
	}
	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public Long getVerificationCancelFlag() {
		return this.verificationCancelFlag;
	}
	public void setVerificationCancelFlag(Long verificationCancelFlag) {
		this.verificationCancelFlag = verificationCancelFlag;
	}

	public Long getVerificationType() {
		return this.verificationType;
	}
	public void setVerificationType(Long verificationType) {
		this.verificationType = verificationType;
	}

}
