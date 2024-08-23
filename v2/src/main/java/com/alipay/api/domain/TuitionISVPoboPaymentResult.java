package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 留学缴费VCC业务代付单状态
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:52:19
 */
public class TuitionISVPoboPaymentResult extends AlipayObject {

	private static final long serialVersionUID = 4688495778671315266L;

	/**
	 * 交易号，刷卡后可能会返回
	 */
	@ApiField("payment_id")
	private String paymentId;

	/**
	 * 证明材料，isv刷卡后返回
	 */
	@ApiListField("proof_list")
	@ApiField("tuition_i_s_v_pobo_image_d_t_o")
	private List<TuitionISVPoboImageDTO> proofList;

	/**
	 * FAIL和CANCEL时必填，表示失败或者取消的原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * vcc交易状态
	 */
	@ApiField("status")
	private String status;

	public String getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public List<TuitionISVPoboImageDTO> getProofList() {
		return this.proofList;
	}
	public void setProofList(List<TuitionISVPoboImageDTO> proofList) {
		this.proofList = proofList;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
