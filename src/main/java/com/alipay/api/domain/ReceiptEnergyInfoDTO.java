package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小票能量信息单个返回结果
 *
 * @author auto create
 * @since 1.0, 2022-01-12 11:36:42
 */
public class ReceiptEnergyInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2247975434325297728L;

	/**
	 * 失败错误码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 能量明细。level是detail的时候返回
	 */
	@ApiListField("energy_generated")
	@ApiField("energy_generated_d_t_o")
	private List<EnergyGeneratedDTO> energyGenerated;

	/**
	 * 小票总能量g数
	 */
	@ApiField("full_energy")
	private Long fullEnergy;

	/**
	 * 商家外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 可重试标识
	 */
	@ApiField("retryable")
	private Boolean retryable;

	/**
	 * 发能量请求成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<EnergyGeneratedDTO> getEnergyGenerated() {
		return this.energyGenerated;
	}
	public void setEnergyGenerated(List<EnergyGeneratedDTO> energyGenerated) {
		this.energyGenerated = energyGenerated;
	}

	public Long getFullEnergy() {
		return this.fullEnergy;
	}
	public void setFullEnergy(Long fullEnergy) {
		this.fullEnergy = fullEnergy;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Boolean getRetryable() {
		return this.retryable;
	}
	public void setRetryable(Boolean retryable) {
		this.retryable = retryable;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
