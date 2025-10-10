package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商保理赔案件状态修改
 *
 * @author auto create
 * @since 1.0, 2024-09-19 17:51:07
 */
public class AlipayCommerceMedicalInsuranceClaimModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4231634129265961386L;

	/**
	 * 理赔案件申请号，通过调用外部理赔申请接口时，支付宝自定义，传给外部接入方的申请号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 理赔案件号，外部接入方理赔案件的唯一标识
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 案件状态及其他信息
	 */
	@ApiField("claim_status_info")
	private ClaimStatusInfo claimStatusInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 理赔案件下，支付流水维度的赔付信息
	 */
	@ApiListField("serial_infos")
	@ApiField("serial_info")
	private List<SerialInfo> serialInfos;

	/**
	 * 请求来源，由支付宝统一提供固定值
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public ClaimStatusInfo getClaimStatusInfo() {
		return this.claimStatusInfo;
	}
	public void setClaimStatusInfo(ClaimStatusInfo claimStatusInfo) {
		this.claimStatusInfo = claimStatusInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<SerialInfo> getSerialInfos() {
		return this.serialInfos;
	}
	public void setSerialInfos(List<SerialInfo> serialInfos) {
		this.serialInfos = serialInfos;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
