package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class PrizeDto extends AlipayObject {

	private static final long serialVersionUID = 8188661343739238433L;

	/**
	 * 奖品展示信息
	 */
	@ApiField("display_info")
	private PrizeDisplayDto displayInfo;

	/**
	 * 奖品资金信息
	 */
	@ApiField("funds_info")
	private PrizeFundDto fundsInfo;

	/**
	 * 奖品使用信息
	 */
	@ApiField("use_info")
	private PrizeUseDto useInfo;

	public PrizeDisplayDto getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(PrizeDisplayDto displayInfo) {
		this.displayInfo = displayInfo;
	}

	public PrizeFundDto getFundsInfo() {
		return this.fundsInfo;
	}
	public void setFundsInfo(PrizeFundDto fundsInfo) {
		this.fundsInfo = fundsInfo;
	}

	public PrizeUseDto getUseInfo() {
		return this.useInfo;
	}
	public void setUseInfo(PrizeUseDto useInfo) {
		this.useInfo = useInfo;
	}

}
