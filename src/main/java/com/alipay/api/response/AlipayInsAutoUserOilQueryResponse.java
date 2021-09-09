package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.oil.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-04 17:22:37
 */
public class AlipayInsAutoUserOilQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4192225572546128459L;

	/** 
	 * 累计攒油量（不包含未收取油量）
	 */
	@ApiField("accum_oil")
	private Long accumOil;

	/** 
	 * 当前可兑换油量
	 */
	@ApiField("current_oil")
	private Long currentOil;

	/** 
	 * 当前总油量（包含当前可兑换油量及未收取的油量 currentOil + unpickOil）
	 */
	@ApiField("total_oil")
	private Long totalOil;

	/** 
	 * 未收取油滴
	 */
	@ApiField("unpick_oil")
	private Long unpickOil;

	/** 
	 * 当前已使用油量
	 */
	@ApiField("use_oil")
	private Long useOil;

	public void setAccumOil(Long accumOil) {
		this.accumOil = accumOil;
	}
	public Long getAccumOil( ) {
		return this.accumOil;
	}

	public void setCurrentOil(Long currentOil) {
		this.currentOil = currentOil;
	}
	public Long getCurrentOil( ) {
		return this.currentOil;
	}

	public void setTotalOil(Long totalOil) {
		this.totalOil = totalOil;
	}
	public Long getTotalOil( ) {
		return this.totalOil;
	}

	public void setUnpickOil(Long unpickOil) {
		this.unpickOil = unpickOil;
	}
	public Long getUnpickOil( ) {
		return this.unpickOil;
	}

	public void setUseOil(Long useOil) {
		this.useOil = useOil;
	}
	public Long getUseOil( ) {
		return this.useOil;
	}

}
