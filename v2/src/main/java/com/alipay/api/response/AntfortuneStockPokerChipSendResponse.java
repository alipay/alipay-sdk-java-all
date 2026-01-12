package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChipDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.poker.chip.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 17:27:41
 */
public class AntfortuneStockPokerChipSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4821579798115538545L;

	/** 
	 * 筹码详情
	 */
	@ApiField("chip")
	private ChipDTO chip;

	public void setChip(ChipDTO chip) {
		this.chip = chip;
	}
	public ChipDTO getChip( ) {
		return this.chip;
	}

}
